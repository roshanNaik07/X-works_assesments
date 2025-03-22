class BakeryRunner{
	
	public static void main(String[]values)
	{
		String itemName="Peda";
		int quantity=20;
		Bakery.buy(itemName,quantity);
		
		boolean yesOrNO = true;
		Bakery.open(yesOrNO);
		
		boolean closed = false;
		Bakery.close(closed);
		
		String name="Roshan";
		Bakery.owner(name);
		
		String chName="Vaibhav";
		Bakery.cashier(chName);
	}
}