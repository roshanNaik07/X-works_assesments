class MethodRunner{
	public static void main(String[]args){
		
		int Ladprice = 200;
		Ladder.ladderPrice(Ladprice);
		
		float ladHeight=7.5f;
		Ladder.ladderHight(ladHeight);
		
		String ladMaterial="iron";
		Ladder.ladderMaterial(ladMaterial);
		
		String closeOrOpen="Open";
		boolean Grip=false;
		Ladder.ladderFuntion(closeOrOpen,Grip);
		
		int steps=8;
		String material="Wood";
		Ladder.ladderStep(steps,material);
		
		int ladAvailable=5;
		float height=5.5f;
		String color="Black";
		Ladder.ladderAvailable(ladAvailable,height,color);
		
		String app="Flipkart";
		int quantity =8;
		String Brand="Wooden";
		Ladder.ladderOrder(app,quantity,Brand);
		
		String foName="Burger";
		FoodItem.foodName(foName);
		
		String type="snacks";
		FoodItem.foodType(type);
		
		int foquantity=4;
		FoodItem.foodQuntity(foquantity);
		
		String areaName="Sirsi";
		String city="Karnataka";
		FoodItem.foodRegion(areaName,city);
		
		String itemName="Onion";
		int foodQuan= 5;
		FoodItem.foodItems(itemName,foodQuan);
		
		FoodItem.foodOrder(foName,Ladprice,foodQuan);
	    
		float calories=205.65f;
		boolean tasty=true;
		FoodItem.foodVerity(type,calories,tasty);
		
		String beName="BroCode";
		int beQuantity=5;
		float alPercentage=15.5f;
		Beer.beerName(beName);
		Beer.beerQuantity(beQuantity);
		Beer.alcoholPercentage(alPercentage);
		
		Beer.beerPrice(beName,Ladprice);
		
		boolean strong=false;
		Beer.beerType(strong,Ladprice);
		
		Beer.beerOrder(beName,beQuantity,Ladprice);
		
		Beer.beerBrand(beName,Ladprice,beQuantity);
		
	}
}