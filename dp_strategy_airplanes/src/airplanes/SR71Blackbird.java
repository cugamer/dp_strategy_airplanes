package airplanes;

import accelerationBehaviors.AccelerateReallyFast;
import picturesBehaviors.TakeSpyPictures;

public class SR71Blackbird extends Airplane {
	public SR71Blackbird(){
		this.description = "super fast high altitude spy plane";
		this.accelerationType = new AccelerateReallyFast();
		this.takePicturesBehavior = new TakeSpyPictures();
	}
}
