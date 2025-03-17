class Tomato {
	
	String texture;
	String color  ;
	String taste;
	int seedsCount;
	int price;
	int weight;
	
	public Tomato(){
		super();
	}
	
	public Tomato(String texture){
		this();
		this.texture=texture;
	}
	
	public Tomato(String texture,String color  ){
		this(texture);
		this.color  =color  ;
	}
	
	public Tomato(String texture,String color  ,String taste ){
		this(texture,color  );
		this.taste =taste ;
	}
	
	public Tomato(String texture,String color  ,String taste ,int seedsCount){
		this(texture,color  ,taste );
		this.seedsCount=seedsCount;
	}
	
	public Tomato(String texture,String color  ,String taste ,int seedsCount,int price){
		this(texture,color  ,taste ,seedsCount);
		this.price=price;
	}
	
	public Tomato(String texture,String color  ,String taste ,int seedsCount,int price,int weight){
		this(texture,color  ,taste ,seedsCount,price);
		this.weight=weight;	
	}
	
	public void display(){
		System.out.println("texture :"+texture);
		System.out.println("color   :"+color  );
		System.out.println("taste   :"+taste );
		System.out.println("seedsCount :"+seedsCount);
		System.out.println("price :"+price);
		System.out.println("weight :"+weight);
	}
}