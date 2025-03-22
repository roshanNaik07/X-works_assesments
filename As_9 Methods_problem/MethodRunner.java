class MethodRunner{
	
	public static void main(String[]args){
		String[]emails={"roshan@gmail.com","vaibhav@gmail.com","hrishikesh@gmail.com"};
		EmailInfo.printEmail(emails);
		
		System.out.println("-------------------------------------\n------------------------");
		
		String[]countryName={"INDIA","England","Australia"};
		CountryName.printName(countryName);
		
		System.out.println("-------------------------------------\n------------------------");
		
		String item="Pizza";
		String[]ingrediants=FoodItem.printingredients(item);
		for(String items:ingrediants){
			System.out.println(items);
		}
	}
}