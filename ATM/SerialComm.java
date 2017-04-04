//import com.sun.xml.internal.messaging.saaj.packaging.mime.util.LineInputStream;
import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
//import sun.swing.BakedArrayList;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerialComm {
/*
static List<String> inputs = new ArrayList<>();
private int lastIndexNum = 0;

    String DetectNewInput(){

        if(lastIndexNum < inputs.size()) {
            lastIndexNum = inputs.size();
            return inputs.get(inputs.size() - 1);
        } else {
            return "fu";
        }
    }
*/
    public SerialComm() {
        super();
    }

    void connect(String portName) throws Exception {
        CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(portName);
        if (portIdentifier.isCurrentlyOwned()) {
            System.out.println("Error: Port is currently in use");
        } else {
            CommPort commPort = portIdentifier.open(this.getClass().getName(), 2000);

            if (commPort instanceof SerialPort) {
                SerialPort serialPort = (SerialPort) commPort;
                serialPort.setSerialPortParams(9600, SerialPort.DATABITS_8, SerialPort.STOPBITS_1, SerialPort.PARITY_NONE);

                InputStream in = serialPort.getInputStream();
                OutputStream out = serialPort.getOutputStream();

                (new Thread(new SerialReader(in))).start();

            } else {
                System.out.println("Error: Only serial ports are handled by this example.");
            }
        }
    }

    /** */
    public static class SerialReader implements Runnable {

        SerialReader(){

        }

        InputStream in;

        List<String> inputs = new ArrayList<>();
        private int lastIndexNum = 0;

        String DetectNewInput(){

            if(lastIndexNum < inputs.size()) {
                lastIndexNum = inputs.size();
                System.out.println(inputs.get(inputs.size() - 1));
                return inputs.get(inputs.size() - 1);

            } else {
                return "fu";
            }
        }

        public SerialReader(InputStream in) {
            this.in = in;
        }

        public void run() {
            byte[] buffer = new byte[1024];
            int len = -1;
            try {
                while ((len = this.in.read(buffer)) > -1) {
                    inputs.add(new String(buffer, 0, len));
                    System.out.print(new String(buffer, 0, len));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            (new SerialComm()).connect("COM5");
        } catch (Exception e) {
            e.printStackTrace();
        }
        SerialComm.SerialReader laser = new SerialComm.SerialReader();
		
		String tmp;
		
        while(true){
          tmp =  laser.DetectNewInput();
		  System.out.println(tmp);
        }

    }
}