class FoodItem{
	
	static String[] printingredients(String name){
		
		if (name.equals("Pizza")){
			return new String[]{"Tomato sauce", "Bread flour", "Yeast"};
		}
		else if(name.equals("Paysa")){
			 return new String[]{"Milk", "Sugar", "Ghee"};
		}
		return new String[]{};
	}
	
}