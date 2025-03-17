class Bucket {
	
	String brand;
	String color  ;
	String size;
	int quantity;
	int price;
	int weight;
	
	public Bucket(){
		super();
	}
	
	public Bucket(String brand){
		this();
		this.brand=brand;
	}
	
	public Bucket(String brand,String color  ){
		this(brand);
		this.color  =color  ;
	}
	
	public Bucket(String brand,String color  ,String size ){
		this(brand,color  );
		this.size =size ;
	}
	
	public Bucket(String brand,String color  ,String size ,int quantity){
		this(brand,color  ,size );
		this.quantity=quantity;
	}
	
	public Bucket(String brand,String color  ,String size ,int quantity,int price){
		this(brand,color  ,size ,quantity);
		this.price=price;
	}
	
	public Bucket(String brand,String color  ,String size ,int quantity,int price,int weight){
		this(brand,color  ,size ,quantity,price);
		this.weight=weight;	
	}
	
	public void display(){
		System.out.println("brand :"+brand);
		System.out.println("color   :"+color  );
		System.out.println("size   :"+size );
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
		System.out.println("weight :"+weight);
	}
}