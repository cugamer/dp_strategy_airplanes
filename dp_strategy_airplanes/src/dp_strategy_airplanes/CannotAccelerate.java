package dp_strategy_airplanes;

public class CannotAccelerate implements AccelerationType {

	@Override
	public String accelerate() {
		return "aircraft cannot accelerate";
	}

}
