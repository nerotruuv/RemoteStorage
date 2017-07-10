import sun.applet.Main;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * Created by Raber on 6/5/2017.
 */

public class PinProces {
    public MainFrame mainFrame;
    public ScanPasPanel scanPasPanel;
    public PinInvoerPanel pinInvoerPanel;
    public MainMenuPanel mainMenuPanel;
    public BiljettenKiezen biljettenKiezenPanel;
    public SaldoInfo saldoInfoPanel;
    public SerialPortListener serialPortListener;
    public VraagOmBon vraagOmBon;
    public String pin = "1234";
    public String pas = "RABO0938713";
    public String inputline= "";
    //public Dispencer dispencer;

    public PinProces(){
       // serialPortListener = new SerialPortListener();
       // serialPortListener.initialize();
        //dispencer = new Dispencer();
        mainFrame = new MainFrame();
        scanPasPanel  = new ScanPasPanel();
        pinInvoerPanel = new PinInvoerPanel();
        mainMenuPanel = new MainMenuPanel();
        biljettenKiezenPanel = new BiljettenKiezen();
        saldoInfoPanel = new SaldoInfo();
        //dispencer.setBills(5,5,5);
        mainFrame.add(scanPasPanel);


    }

    public void run() {

        //while (true) {
            /*
            try {
                inputline = serialPortListener.getInput().readLine();
                System.out.println(inputline);
            } catch (Exception e) {

            }


            if (inputline.equals(pas)) {
                inputline = "";
                mainFrame.remove(scanPasPanel);
                pinInvoerPanel = new PinInvoerPanel();
                mainFrame.add(pinInvoerPanel);
                pinInvoerPanel.updateUI();
            }
*/
/**
 *      inlogscherm methodes
 * */

        scanPasPanel.getOkButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {

                mainFrame.remove(scanPasPanel);
                mainFrame.add(pinInvoerPanel);
                pinInvoerPanel.updateUI();

                //dispencer.getBills(1,1,1);
            }
        });

        pinInvoerPanel.getOkButton().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if(pinInvoerPanel.getPasswordField().getText().equals(pin)) {
                    mainFrame.remove(pinInvoerPanel);
                    mainFrame.add(mainMenuPanel);
                    mainMenuPanel.updateUI();
                }
                else {
                    pinInvoerPanel.PinPopup();
                }
            }
        });

        pinInvoerPanel.getBreekaf().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                mainFrame.remove(pinInvoerPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        });

/**
 *      main menu methodes
 * */
        mainMenuPanel.getBreekafButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        mainMenuPanel.getBedragButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();
            }
        }));

        mainMenuPanel.getSaldoButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(saldoInfoPanel);
                saldoInfoPanel.updateUI();
            }
        }));

        mainMenuPanel.get10Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        mainMenuPanel.get20Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        mainMenuPanel.get50Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(mainMenuPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

/**
 *      saldo
 * */

        saldoInfoPanel.getBreekafButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        saldoInfoPanel.getMainMenuButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(mainMenuPanel);
                mainMenuPanel.updateUI();
            }
        }));

        saldoInfoPanel.getBedragButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();
            }
        }));

        saldoInfoPanel.get10Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        saldoInfoPanel.get20Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        saldoInfoPanel.get50Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(saldoInfoPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));
/**
 *      bedrag
 * */
        biljettenKiezenPanel.getBreekafButton().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){

                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(scanPasPanel);
                scanPasPanel.updateUI();
            }
        }));

        biljettenKiezenPanel.getMainMenu().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(mainMenuPanel);
                mainMenuPanel.updateUI();
            }
        }));

        biljettenKiezenPanel.get10Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){

                biljettenKiezenPanel.addBill(10);
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();
            }
        }));

        biljettenKiezenPanel.get20Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){

                biljettenKiezenPanel.refresh();
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();

                biljettenKiezenPanel.addBill(20);
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();
            }
        }));

        biljettenKiezenPanel.get50Button().addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){

                biljettenKiezenPanel.refresh();
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();

                biljettenKiezenPanel.addBill(50);
                mainFrame.remove(biljettenKiezenPanel);
                mainFrame.add(biljettenKiezenPanel);
                biljettenKiezenPanel.updateUI();
            }
        }));
    }
}
//}