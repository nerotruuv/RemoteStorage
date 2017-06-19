import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Enumeration;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;
import gnu.io.SerialPortEvent;
import gnu.io.SerialPortEventListener;


/**
 * Created by Raber on 6/5/2017.
 *
 */
public class SerialPortListener implements SerialPortEventListener{
    private String inputline;
    SerialPort serialPort;


    //Automaat automaat=null;

    /**
     * The port we're normally going to use.
     */

    private static final String PORT_NAMES[] = {

            "COM7", "COM6", "COM5", "COM4", "COM3", "COM2", "COM1"// Windows

    };

    private BufferedReader input;

    /**
     * The output stream to the port
     */

    private OutputStream output;

    /**
     * Milliseconds to block while waiting for port open
     */

    private static final int TIME_OUT = 2000;

    /**
     * Default bits per second for COM port.
     */

    private static final int DATA_RATE = 9600;

    public void initialize() {

        CommPortIdentifier portId = null;

        Enumeration portEnum = CommPortIdentifier.getPortIdentifiers();

        //First, Find an instance of serial port as set in PORT_NAMES.

        while (portEnum.hasMoreElements()) {

            CommPortIdentifier currPortId = (CommPortIdentifier) portEnum.nextElement();

            for (String portName : PORT_NAMES) {

                if (currPortId.getName().equals(portName)) {

                    portId = currPortId;

                    break;

                }

            }

        }

        if (portId == null) {

            System.out.println("Could not find COM port.");

            return;

        }

        try {

            // open serial port, and use class name for the appName.

            serialPort = (SerialPort) portId.open(this.getClass().getName(),

                    TIME_OUT);

            // set port parameters

            serialPort.setSerialPortParams(DATA_RATE,

                    SerialPort.DATABITS_8,

                    SerialPort.STOPBITS_1,

                    SerialPort.PARITY_NONE);

            // open the streams

            input = new BufferedReader(new InputStreamReader(serialPort.getInputStream()));

            output = serialPort.getOutputStream();

            // add event listeners

            serialPort.addEventListener(this);

            serialPort.notifyOnDataAvailable(true);

        } catch (Exception e) {

            System.err.println(e.toString());

        }

    }

    public void serialEvent(SerialPortEvent spe) {

        if (spe.getEventType() == SerialPortEvent.DATA_AVAILABLE) {
            /*
            try {
                String inputLine=input.readLine();
                if (inputLine.equals("#")) {
                    passwordField.setText("*");
                }
                else{
                    passwordField.setText(passwordField.getText()+inputLine);
                    if (passwordField.getText().length()>4) passwordField.setText(inputLine);
                    //System.out.println(inputLine);
                }

            } catch (Exception e) {

                System.err.println(e.toString());

            }

            try {
               // inputline = input.readLine();
                System.out.println(input.readLine());
            }
            catch (Exception e){

            }

*/
        }
    }


    public String getInputline() {
        return inputline;
    }

    public BufferedReader getInput() {
        return input;
    }
}
