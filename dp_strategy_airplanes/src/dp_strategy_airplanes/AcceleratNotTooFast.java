package dp_strategy_airplanes;

public class AcceleratNotTooFast implements AccelerationType {

	@Override
	public String accelerate() {
		return "aircraft accelerates but does not break the sound barrier.";
	}

}
