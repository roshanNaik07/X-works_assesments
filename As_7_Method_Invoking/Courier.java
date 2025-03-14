class Courier{
	static void pickUp(String item){
		System.out.println("Running pickUp in Courier");
		Station.send(item);
	}
}