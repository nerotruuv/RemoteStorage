public class Pages{
	/* Fields */
	private String homePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/index.html";
	private String pinPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/pinPage.html";
	private String keuzePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/keuzePage.html";
	private String saldoPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/saldoPage.html";
	private String geldKeuzePage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/geldKeuzePage.html";
	private String geldInPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/geldInPage.html";
	private String lowBalPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/lowBalPage.html";
	private String bonPage = "file://E:/Daan/Documents/School/RundBunq/GUI/HTML/bonPage.html";
	
	private String pin = "";
	private int bedrag = 0;
	
	/* Methods */
	public String getHome(){return homePage;}
	public String getPin(){return pinPage;}
	public String getKeuze(){return keuzePage;}
	public String getSaldo(){return saldoPage;}
	public String getGeldKeuze(){return geldKeuzePage;}
	public String getGeldIn(){return geldInPage;}
	public String getLow(){return lowBalPage;}
	public String getBon(){return bonPage;}
}