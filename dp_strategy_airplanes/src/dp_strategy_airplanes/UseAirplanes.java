package dp_strategy_airplanes;

import accelerationBehaviors.AccelerateReallyFast;
import airplanes.ATenWarthog;
import airplanes.FlyerOne;
import airplanes.SR71Blackbird;
import picturesBehaviors.TakeSpyPictures;

public class UseAirplanes {

	public static void main(String[] args) {
		SR71Blackbird sr71 = new SR71Blackbird();
		FlyerOne flyerOne = new FlyerOne();
		ATenWarthog a10 = new ATenWarthog();
		
		System.out.println("The SR-71 is a " + sr71.getDescription());
		System.out.println("The SR-71 " + sr71.accelerateAirplane());
		System.out.println("The SR-71 " + sr71.takePictures() + "\n");
		
		System.out.println("The Wright Flyer is " + flyerOne.getDescription());
		System.out.println("The Wright Flyer " + flyerOne.accelerateAirplane());
		System.out.println("The Wright Flyer " + flyerOne.takePictures() + "\n");
		
		System.out.println("The A Ten Thunderbolt Two is " + a10.getDescription());
		System.out.println("The A 10 " + a10.accelerateAirplane());
		System.out.println("The A 10 " + a10.takePictures() + "\n");
		
		System.out.println("The government has decided to pull the Wright Flyer out of retirement and fit it with some spiffy ram jets");
		flyerOne.setAccelerationType(new AccelerateReallyFast());
		System.out.println("The Wright Flyer " + flyerOne.accelerateAirplane() + "\n");
		
		System.out.println("The A 10 has been reconfigured to take low level recon photos.");
		a10.setTakePicturesBehavior(new TakeSpyPictures());
		System.out.println(a10.takePictures());
	}
}
