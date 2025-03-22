class Color {
	
	String brand;
	String color;
	String Temperature ;
	int quantity;
	int price;
	int Brightness;
	
	public Color(){
		super();
	}
	
	public Color(String brand){
		this();
		this.brand=brand;
	}
	
	public Color(String brand,String color){
		this(brand);
		this.color=color;
	}
	
	public Color(String brand,String color,String Temperature ){
		this(brand,color);
		this.Temperature =Temperature ;
	}
	
	public Color(String brand,String color,String Temperature ,int quantity){
		this(brand,color,Temperature );
		this.quantity=quantity;
	}
	
	public Color(String brand,String color,String Temperature ,int quantity,int price){
		this(brand,color,Temperature ,quantity);
		this.price=price;
	}
	
	public Color(String brand,String color,String Temperature ,int quantity,int price,int Brightness){
		this(brand,color,Temperature ,quantity,price);
		this.Brightness=Brightness;	
	}
	
	public void display(){
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("Temperature   :"+Temperature );
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
		System.out.println("Brightness :"+Brightness);
	}
}