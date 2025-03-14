class Discount{
	
	static String applyDiscount(String value){
		if(value.equals("Roshan")){
			return "10 % discount";
		}
		if(value.equals("Vaibhav")){
			return "15 % discount";
		}
		return "Doesn't exist";
	}
}