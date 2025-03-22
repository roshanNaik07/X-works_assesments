class Broker{
	static void brokerage(String vegetable,int quantity){
		System.out.println("Running brokerage in broker");
		Farmer.farm(vegetable,quantity);
	}
}