public class Comm{
	/* Fields */
	Database mysql = new Database();
	BCrypt bcrypt = new BCrypt();
	
	/* Methods */
	public boolean getPas(String iban){
		mysql.connect();
		if(mysql.getData("SELECT accountNum FROM AccountData WHERE accountNum = '"+iban+"';") != iban){
			mysql.closeConnection();
			return false;
		}else{
			mysql.closeConnection();
			return true;
		}
	}
	
	public boolean getPin(int pin, String iban){
		mysql.connect();
		if(bcrypt.checkpw(pin, mysql.getData("SELECT pin FROM AccountData WHERE accountNum = '"+iban+"';"))){
			mysql.closeConnection();
			return true;
		}else{
			mysql.closeConnection();
			return false;
		}
	}
	
	public int getSaldo(String iban){
		mysql.connect();
		int saldo = mysql.getData("SELECT credit FROM AccountData WHERE accountNum = '"+iban+"';");
		mysql.closeConnection();
		return saldo;
	}	
	
	public boolean checkTrans(int trans, String iban){
		mysql.connect();
		if(mysql.getData("SELECT credit FROM AccountData WHERE accountNum = '"+iban+"';")) >= trans){
			return true;
		}else{
			return false;
		}
	}
	
	public void doTrans(int trans, String iban){
		mysql.connect();
		mysql.setData("UPDATE AccountData SET credit = "+trans+" WHERE accountNum = '"+iban+"';");
		mysql.closeConnection();
	}
}