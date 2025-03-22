class MyInterest{
	public static void main(String[]args){
		String[] Hobbies ={"Art","Games","Cricket","cooking"};
		String[] artTypes={"painting","Sketch","Portrait","Abstract","oilpainting","color pencil arts"};
		String[] games ={"bgmi","COC","Mine craft","CS","Heyday","sniper 3D","Hill climber","Pokemon go","chess","froza","PUBG","Warzone"};
		String[] CricketTools={"Bat","Ball","stump","Match","LB","wide","Over","Super over","Thala"};
		String[] FavDishes={"Biryani","Kabab","chiken Chilly","Momos","icecream","desert"};
		for(String Hobby:Hobbies)
			System.out.println(Hobby);
		for(String Art:artTypes)
			System.out.println(Art);
		for(String Game:games)
			System.out.println(Game);
		for(String cricket:CricketTools)
			System.out.println(cricket);
		for(String Fav:FavDishes)
			System.out.println(Fav);
	}
}