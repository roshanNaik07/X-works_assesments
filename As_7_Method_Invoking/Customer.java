class Customer{
	static void buy(String vegetable,int quantity){
		System.out.println("Running buy in Customer");
		Shop.sell(vegetable,quantity);
	}
}