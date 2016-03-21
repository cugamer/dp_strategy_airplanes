package accelerationBehaviors;

public class AccelerateNotTooFast implements AccelerationType {

	@Override
	public String accelerate() {
		return "accelerates but does not break the sound barrier";
	}

}
