package airplanes;

import accelerationBehaviors.CannotAccelerate;
import picturesBehaviors.TakePicturesOfThePlane;

public class FlyerOne extends Airplane {
	public FlyerOne(){
		this.description = "the first heavier than air craft ever to fly, first in 1903";
		this.accelerationType = new CannotAccelerate();
		this.takePicturesBehavior = new TakePicturesOfThePlane();
	}
}
