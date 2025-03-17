class Pichkari {
	
	String brand;
	String color;
	String size;
	int count;
	int price;
	int capacity;
	
	public Pichkari(){
		super();
	}
	
	public Pichkari(String brand){
		this();
		this.brand=brand;
	}
	
	public Pichkari(String brand,String color){
		this(brand);
		this.color=color;
	}
	
	public Pichkari(String brand,String color,String size){
		this(brand,color);
		this.size=size;
	}
	
	public Pichkari(String brand,String color,String size,int count){
		this(brand,color,size);
		this.count=count;
	}
	
	public Pichkari(String brand,String color,String size,int count,int price){
		this(brand,color,size,count);
		this.price=price;
	}
	
	public Pichkari(String brand,String color,String size,int count,int price,int capacity){
		this(brand,color,size,count,price);
		this.capacity=capacity;	
	}
	
	public void display(){
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("size  :"+size);
		System.out.println("count :"+count);
		System.out.println("price :"+price);
		System.out.println("capacity :"+capacity);
	}
}