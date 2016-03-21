package dp_strategy_airplanes;

public class FlyerOne extends Airplane {
	public FlyerOne(){
		this.description = "the first heavier than air craft ever to fly, first in 1903";
		this.accelerationType = new CannotAccelerate();
	}
}
