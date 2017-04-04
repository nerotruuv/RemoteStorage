import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
 
public class ATM {
	/* Fields */
	private static String homePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/index.html";
	private static String pinPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/pinPage.html";
	private static String keuzePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/keuzePage.html";
	private static String saldoPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/saldoPage.html";
	private static String geldKeuzePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/geldKeuzePage.html";
	private static String geldInPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/geldInPage.html";
	private static String lowBalPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/lowBalPage.html";
	private static String bonPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/bonPage.html";
	
	private static String curPage = "homePage";
	private static String iban = null;
	private static int pasNr = null;
	private static String pin = null;
	private static String geldIn = null;
	
	private static Comm comm = new Comm();
	
    public static void main(String[] args) {
        final Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
 
        JFrame frame = new JFrame("RundBunq");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(800, 500);	//ONLY FOR DEBUGGING
		/*frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setUndecorated(true);
		frame.setVisible(true);*/
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
 
        browser.loadURL(homePage);
		
		while(true){
			if(curPage.equals("homePage")){
				if(iban != null && pasNr != null){
					if(comm.getPas(iban)){
						browser.loadURL(pinPage);
						curPage = "pinPage";
					}
				}
			}else if(curPage.equals("pinPage")){
				if(pin.length < 4 && !rxtx.getInput().equals("*") && !rxtx.getInput().equals("#")
					&& !rxtx.getInput().equals("A") && !rxtx.getInput().equals("B")
					&& !rxtx.getInput().equals("C") && !rxtx.getInput().equals("D")){
						pin += rxtx.getInput();
						browser.loadURL(*);
				}else if(pin.length == 4 && rxtx.getInput().equals("*")){
					if(comm.getPin(pin, iban)){
						browser.loadURL(keuzePage);
						curPage = "keuzePage";
						pin = null;
					}else{
						browser.loadURL(wrongPin);
						curPage = "wrongPin";
						pin = null;
					}
				}else if(rxtx.getInput().equals("#")){
					browser.loadURL(homePage);
					curPage("homePage");
					pin = null;
					iban = null;
					pasNr = null;
				}
			}else if(curPage.equals("keuzePage")){
				if(rxtx.getInput().equals("1")){
					browser.loadURL(saldoPage);
					curPage = "saldoPage";
				}else if(rxtx.getInput().equals("A")){
					browser.loadURL(geldKeuzePage);
					curPage = "geldKeuzePage";
				}else if(rxtx.getInput().equals("*")){
					browser.loadURL(homePage);
					curPage = "homePage";
					pin = null;
					iban = null;
					pasNr = null;
				}
			}else if(curPage.equals("saldoPage")){
				if(rxtx.getInput().equals("*")){
					browser.loadURL(keuzePage);
					curPage = "keuzePage";
				}else if(rxtx.getInput().equals("#")){
					browser.loadURL(homePage);
					curPage = "homePage";
					pin = null;
					iban = null;
					pasNr = null;
				}
			}else if(curPage.equals("geldKeuzePage")){
				if(rxtx.getInput().equals("1")){
					if(comm.checkTrans(10, iban)){
						check.doTrans(10, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
					}
				}else if(rxtx.getInput().equals("2")){
					if(comm.checkTrans(20, iban)){
						check.doTrans(20, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
					}
				}else if(rxtx.getInput().equals("3")){
					if(comm.checkTrans(50, iban)){
						check.doTrans(50, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
					}
				}else if(rxtx.getInput().equals("A")){
					if(comm.checkTrans(100, iban)){
						check.doTrans(100, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
					}
				}else if(rxtx.getInput().equals("B")){
					if(comm.checkTrans(250, iban)){
						check.doTrans(250, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
					}
				}else if(rxtx.getInput().equals("C")){
					browser.loadURL(geldInPage);
					curPage = "geldInPage";
				}else if(rxtx.getInput().equals("*")){
					browser.loadURL(keuzePage);
					curPage = "keuzePage";
				}else if(rxtx.getInput().equals("#")){
					browser.loadURL(homePage);
					curPage = "homePage";
					pin = null;
					iban = null;
					pasNr = null;
				}
			}else if(curPage.equals("geldInPage")){
				if(rxtx.getInput().equals("1")){
					geldIn += 1;
				}else if(rxtx.getInput().equals("2")){
					geldIn =+ 2;
				}else if(rxtx.getInput().equals("3")){
					geldIn += 3;
				}else if(rxtx.getInput().equals("4")){
					geldIn += 4;
				}else if(rxtx.getInput().equals("5")){
					geldIn += 5;
				}else if(rxtx.getInput().equals("6")){
					geldIn += 6;
				}else if(rxtx.getInput().equals("7")){
					geldIn += 7;
				}else if(rxtx.getInput().equals("8")){
					geldIn += 8;
				}else if(rxtx.getInput().equals("9")){
					geldIn += 9;
				}else if(rxtx.getInput().equals("0")){
					geldIn += 0;
				}else if(rxtx.getInput().equals("A")){
					int geld = Integer.parseInt(geldIn);
					if(comm.checkTrans(geld, iban){
						comm.doTrans(geld, iban);
					}else{
						browser.loadURL(lowBalPage);
						curPage = "lowBalPage";
						geld = "";
						geldIn = null;
					}
				}else if(rxtx.getInput().equals("*")){
					browser.loadURL(keuzePage);
					curPage = "keuzePage";
					geld = null;
					geldIn = "";
				}else if(rxtx.getInput().equals("#")){
					browser.loadURL(homePage);
					curPage = "homePage";
					geldIn = "";
					pin = null;
					iban = null;
					pasNr = null;
				}
			}
			}else if(curPage.equals("lowBalPage")){
				// Check if Terug or if Afbreken
				// Load required page
				// Set required curPage
			}else if(curPage.equals("bonPage")){
				// Check if Ja or if Nee
				// Print bon
				// browser.loadURL(homePage);
				// curPage = "homePage";
			}
			
			// ONLY FOR DEBUGGING
			/*System.out.print("Keypad input: ");
			int y = in.nextInt();
			System.out.println(y);
			
			switch(y){
				case 1: browser.loadURL(homePage);
						break;
				case 2: browser.loadURL(pinPage);
						break;
				case 3: browser.loadURL(keuzePage);
						break;
				case 4: browser.loadURL(saldoPage);
						break;
				case 5: browser.loadURL(geldKeuzePage);
						break;
				case 6: browser.loadURL(geldInPage);
						break;
				case 7: browser.loadURL(lowBalPage);
						break;
				case 8: browser.loadURL(bonPage);
						break;
			}*/
		}
    }
}