package dp_strategy_airplanes;

public class SR71Blackbird extends Airplane {
	public SR71Blackbird(){
		this.description = "super fast high altitude spy plane";
		this.accelerationType = new AccelerateReallyFast();
		this.takePicturesBehavior = new TakeSpyPictures();
	}
}
