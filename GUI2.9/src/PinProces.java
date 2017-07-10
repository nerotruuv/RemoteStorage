import sun.applet.Main;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Raber on 6/5/2017.
 */

public class PinProces {
    MainFrame mainFrame;
    ScanPasPanel scanPasPanel;
    PinInvoerPanel pinInvoerPanel;
    SerialPortListener serialPortListener;
    VraagOmBon vraagOmBon;
    String pin = "1234";
    String pas = "1B62F735";
    String inputline= "";

    public PinProces(){
        //serialPortListener = new SerialPortListener();
        //serialPortListener.initialize();


        mainFrame = new MainFrame();
        //scanPasPanel = new ScanPasPanel();
        //mainFrame.add(scanPasPanel);
        ScanPasPanel scanpas = new ScanPasPanel();
        mainFrame.add(scanpas);



    }

    /*
    public void run() {


        while (true) {
            try{
                inputline =  serialPortListener.getInput().readLine();
                System.out.println(inputline);
            }
            catch (Exception e){

            }



            if (inputline.equals(pas)) {
                inputline = "";
                mainFrame.remove(scanPasPanel);
                pinInvoerPanel = new PinInvoerPanel();
                mainFrame.add(pinInvoerPanel);
                pinInvoerPanel.updateUI();
            }


        }
        /*
        scanPasPanel.getOkButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                mainFrame.remove(scanPasPanel);
                mainFrame.add(pinInvoerPanel);
                pinInvoerPanel.updateUI();
            }
        });

        pinInvoerPanel.getOkButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                if(pinInvoerPanel.getPasswordField().getText().equals(pin)) {
                    mainFrame.remove(pinInvoerPanel);
                    scanPasPanel.updateUI();
                    mainFrame.add(scanPasPanel);
                }
                else {
                    pinInvoerPanel.getPinInvoer().setText("foute pincode");
                    pinInvoerPanel.updateUI();
                }
            }
        });

        pinInvoerPanel.getBreekaf().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {

                mainFrame.remove(pinInvoerPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        });

    }
    */
}