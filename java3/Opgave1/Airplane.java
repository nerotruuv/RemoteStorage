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
	
	private Engine EngineList[] = new Engine[4];
	private boolean EngineCheckList[] = new boolean[4];
	
	private Flap FlapList[] = new Flap[2];
	private boolean FlapCheckList[] = new boolean[2];
	
	private Pilot PilotList[] = new Pilot[3];
	private boolean PilotCheckList[] = new boolean[3];
	
}