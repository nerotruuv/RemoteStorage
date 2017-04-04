public class App{
	public static void main(String[] args){
		BCrypt bcrypt = new BCrypt();
		Database mysql = new Database();
		
		mysql.connect();
		
		String sqlPin = mysql.getData("SELECT pin FROM AccountData WHERE accountNum = 'RUND123456789';");
		
		
		String RUND1 = "$2a$10$HzgBtlE383vcpFei/RSxPu/6GmgpLWDTm8fNT6xLi41.JnPzbgTa2";
		
		String RUND2 = "$2a$10$Veew82mwJTYvZVFdi..J6eGHJvcQ/WhjxZiD8R8hI6dRWiXAp3wAC";
		
		//String hashed = bcrypt.hashpw(password2, bcrypt.gensalt());
		//String hashed2 = bcrypt.hashpw(password, bcrypt.gensalt());
		
		//String check = "$2a$10$07dhVBQwsYz281qPQKT9Veg8DvE74yUJy1QEmD7iP0aBxX7yukUkO";
		
		//System.out.println(hashed);
		//System.out.println(hashed2);
		
		if(bcrypt.checkpw(pin, sqlPin)){
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		mysql.closeConnection();
	}
}