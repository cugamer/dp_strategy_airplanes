package picturesBehaviors;

public class TakeGunCameraPictures implements TakePicturesBehavior {

	@Override
	public String takePicture() {
		return "takes pictures of what it's shooting at";
	}
	
}
