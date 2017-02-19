public abstract class Part(){
	
	
	/**
	*	hier moet ik de kans dat een onderdeel uitvalt berekenen
	*	dit moet ik doen door een rng nummer te trekken uit een hogehod 
	*	gebruik makend van de failure kans 
	*/	
	protected void Calculate(){
		if(Math.floor(Math.random() * (1/failure))==1){
			broken = true;
		}else{
			broken = false;
		}
	}
	
	protected boolean broken;
	protected float failure;
	
}
