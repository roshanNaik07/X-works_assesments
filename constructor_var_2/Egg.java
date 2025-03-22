class Egg {
	
	String NutritionalValue;
	String shellColor  ;
	String size;
	int quantity;
	int price;
	int weight;
	
	public Egg(){
		super();
	}
	
	public Egg(String NutritionalValue){
		this();
		this.NutritionalValue=NutritionalValue;
	}
	
	public Egg(String NutritionalValue,String shellColor  ){
		this(NutritionalValue);
		this.shellColor  =shellColor  ;
	}
	
	public Egg(String NutritionalValue,String shellColor  ,String size ){
		this(NutritionalValue,shellColor  );
		this.size =size ;
	}
	
	public Egg(String NutritionalValue,String shellColor  ,String size ,int quantity){
		this(NutritionalValue,shellColor  ,size );
		this.quantity=quantity;
	}
	
	public Egg(String NutritionalValue,String shellColor  ,String size ,int quantity,int price){
		this(NutritionalValue,shellColor  ,size ,quantity);
		this.price=price;
	}
	
	public Egg(String NutritionalValue,String shellColor  ,String size ,int quantity,int price,int weight){
		this(NutritionalValue,shellColor  ,size ,quantity,price);
		this.weight=weight;	
	}
	
	public void display(){
		System.out.println("NutritionalValue :"+NutritionalValue);
		System.out.println("shellColor   :"+shellColor  );
		System.out.println("size   :"+size );
		System.out.println("quantity :"+quantity);
		System.out.println("price :"+price);
		System.out.println("weight :"+weight);
	}
}