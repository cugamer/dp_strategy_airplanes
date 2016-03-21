package dp_strategy_airplanes;

public class ATenWarthog extends Airplane {
	public ATenWarthog(){
		this.description = "a slow, low-level, terrifying close air support aircraft";
		this.accelerationType = new AccelerateNotTooFast();
	}
}
