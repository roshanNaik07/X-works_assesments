class Station{
	static void send(String item){
		System.out.println("Running send in Station");
		 DeliveyGuy.accept(item);
	}
}