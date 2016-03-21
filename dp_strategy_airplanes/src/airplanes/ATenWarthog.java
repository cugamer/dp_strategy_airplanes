package airplanes;

import accelerationBehaviors.AccelerateNotTooFast;
import picturesBehaviors.TakeGunCameraPictures;

public class ATenWarthog extends Airplane {
	public ATenWarthog(){
		this.description = "a slow, low-level, terrifying close air support aircraft";
		this.accelerationType = new AccelerateNotTooFast();
		this.takePicturesBehavior = new TakeGunCameraPictures();
	}
}
