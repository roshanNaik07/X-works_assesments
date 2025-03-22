class Baloon {
	
	String color;
	String shape;
	String size;
	int noOfBaloon;
	int price;
	int noOfColors;
	
	public Baloon(){
		super();
	}
	
	public Baloon(String color){
		this();
		this.color=color;
	}
	
	public Baloon(String color,String shape){
		this(color);
		this.shape=shape;
	}
	
	public Baloon(String color,String shape,String size){
		this(color,shape);
		this.size=size;
	}
	
	public Baloon(String color,String shape,String size,int noOfBaloon){
		this(color,shape,size);
		this.noOfBaloon=noOfBaloon;
	}
	
	public Baloon(String color,String shape,String size,int noOfBaloon,int price){
		this(color,shape,size,noOfBaloon);
		this.price=price;
	}
	
	public Baloon(String color,String shape,String size,int noOfBaloon,int price,int noOfColors){
		this(color,shape,size,noOfBaloon,price);
		this.noOfColors=noOfColors;	
	}
	
	public void display(){
		System.out.println("color :"+color);
		System.out.println("shape :"+shape);
		System.out.println("size  :"+size);
		System.out.println("noOfBaloon :"+noOfBaloon);
		System.out.println("price :"+price);
		System.out.println("noOfColors :"+noOfColors);
	}
}