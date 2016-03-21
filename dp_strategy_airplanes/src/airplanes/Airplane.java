package airplanes;

import accelerationBehaviors.AccelerationType;
import picturesBehaviors.TakePicturesBehavior;

public class Airplane {
	protected String description;
	protected AccelerationType accelerationType;
	protected TakePicturesBehavior takePicturesBehavior;
	
	public String getDescription(){
		return description;
	}
	
	public String accelerateAirplane(){
		return accelerationType.accelerate();
	}
	
	public void setAccelerationType(AccelerationType accelerationType){
		this.accelerationType = accelerationType;
	}
	
	public String takePictures(){
		return takePicturesBehavior.takePicture();
	}
	
	public void setTakePicturesBehavior(TakePicturesBehavior takePicturesBehavior){
		this.takePicturesBehavior = takePicturesBehavior;
	}
}
