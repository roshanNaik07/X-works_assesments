class TrafficSignal{
	public static void SignalColor(){
		System.out.println("Traffic method 5");
	}
	public static void signalAction(){
		System.out.println("traffic Method 6");
	}
	public static void RunLipstick(){
		SignalColor();
		signalAction();
		TrafficModel.greenColor();
		TrafficModel.greenAction();
	}
}