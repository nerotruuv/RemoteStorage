public class Pilot extends Part{
	
	public Pilot(){
		
	}
	
	public void CheckBroken(){
		if(broken == true){
			throw new PilotExeption();
		}
	}
	
	private float failure = 0.005;
	
}