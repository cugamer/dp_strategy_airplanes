package dp_strategy_airplanes;

public class UseAirplanes {

	public static void main(String[] args) {
		SR71Blackbird sr71 = new SR71Blackbird();
		FlyerOne flyerOne = new FlyerOne();
		
		System.out.println("The SR-71 is a " + sr71.getDescription());
		System.out.println("The SR-71 " + sr71.accelerateAirplane());
		
		System.out.println("The Wright Flyer is " + flyerOne.getDescription());
		System.out.println("The Wright Flyer " + flyerOne.accelerateAirplane());

	}

}
