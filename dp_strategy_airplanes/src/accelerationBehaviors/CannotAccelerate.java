package accelerationBehaviors;

public class CannotAccelerate implements AccelerationType {

	@Override
	public String accelerate() {
		return "cannot accelerate";
	}

}
