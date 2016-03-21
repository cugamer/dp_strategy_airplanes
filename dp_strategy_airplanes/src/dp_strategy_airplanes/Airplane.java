package dp_strategy_airplanes;

public class Airplane {
	String description;
	AccelerationType accelerationType;
	
	public String getDescription(){
		return description;
	}
	
	public String accelerateAirplane(){
		return accelerationType.accelerate();
	}
	
	public void setAccelerationType(AccelerationType accelerationType){
		this.accelerationType = accelerationType;
	}
}
