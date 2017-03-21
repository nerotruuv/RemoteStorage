import gnu.io.CommPort;
import gnu.io.CommPortIdentifier;
import gnu.io.SerialPort;

import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Comms{ String[] args){
	
	private String port;
	
	public Comms(String poort){
		super();
		port = poort;
		Initialize();
	} 
	
	public void Initialize(){
		try
        {
            (new TwoWaySerialComm()).connect("COM3");
        }
        catch ( Exception e )
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
	
	public void connect(){
		try{
			CommPortIdentifier portIdentifier = CommPortIdentifier.getPortIdentifier(port);
			if ( portIdentifier.isCurrentlyOwned() )
			{
				System.out.println("Error: Port is currently in use");
			}
			else
			{
				CommPort commPort = portIdentifier.open(portIdentifier.getName(), 2000);
            
				if ( commPort instanceof SerialPort ){
					SerialPort serialPort = (SerialPort) commPort;
					serialPort.setSerialPortParams(9600,SerialPort.DATABITS_8,SerialPort.STOPBITS_1,SerialPort.PARITY_NONE);
                
					InputStream in = serialPort.getInputStream();
				
					SerialReader(in);
				}
				else{
					System.out.println("Error: Only serial ports are handled by this program.");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public String SerialReader(InputStream in){	
		byte[] buffer = new byte[1024];
		int len = -1;
		try{
			if ( ( len = in.read(buffer)) > -1 ){
				return(new String(buffer,0,len));
			}
		}catch ( IOException e ){
			e.printStackTrace();
		}            
	}
	

	
	
}	