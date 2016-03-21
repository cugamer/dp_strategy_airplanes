package dp_strategy_airplanes;

public class TakePicturesOfThePlane implements TakePicturesBehavior {

	@Override
	public String takePicture() {
		return "can't take it's own pictures right now but you can take pictures of it";
	}

}
