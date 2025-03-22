class Shop{
	static void sell(String vegetable,int quantity){
		System.out.println("Running sell in shop");
		Agent.purchase(vegetable,quantity);
	}
}