public class Airplane{
	
	public Airplane(){
		for(int i = 0; i <= EngineList.lenght; i++){
			EngineList[i] = new Engine();
		}
		
		for(int i = 0; i <= FlapList.lenght; i++){
			FlapList[i] = new Flap();
		}
		
		for(int i = 0; i <= PilotList.lenght; i++){
			PilotList[i] = new Pilot();
		}
	}
	
	public void Flight(){
		
	}	
	
	private EngineList = new Engine[4];
	private FlapList = new Flap[2];
	private PilotList = new Pilot[3];
	
}