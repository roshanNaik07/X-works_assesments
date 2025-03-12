class ChainRunner{
	
	public static void main(String[]args){
		
	String brand="Mejuri";
	String material="14k Yellow Gold";
	int price=148;
	
	Chain chain1=new Chain(brand,material,price);
	
	System.out.println("Chain 1:");
	System.out.println("brand: "+chain1.brand+"\nmaterial :"
		+chain1.material+"\nprice: "+chain1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand1="UNOde50";
	String material1="18K Gold-Plated";
	int price1=250;
	
	Chain chain2 = new Chain(brand1,material1,price1);
	
	System.out.println("Chain 2:");
	System.out.println("brand: "+chain2.brand+"\nmaterial :"
		+chain2.material+"\nprice: "+chain2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String brand2="Gorjana";
	String material2="Gold-Plated Brass";
	int price2=450;
	
	Chain chain3 = new Chain(brand2,material2,price2);
	
	System.out.println("Chain 3:");
	System.out.println("brand: "+chain3.brand+"\nmaterial :"
		+chain3.material+"\nprice: "+chain3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand3="Catbird ";
	String material3="14k Gold";
	int price3=69;
	
	Chain chain4 = new Chain(brand3,material3,price3);
	
	System.out.println("Chain 4:");
	System.out.println("brand: "+chain4.brand+"\nmaterial :"
		+chain4.material+"\nprice: "+chain4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String brand4="Kendra Scott";
	String material4="14k Gold-Plated Brass";
	int price4=190;
	
	Chain chain5 = new Chain(brand4,material4,price4);
	
	System.out.println("Chain 5:");
	System.out.println("brand: "+chain5.brand+"\nmaterial :"
		+chain5.material+"\nprice: "+chain5.price);
	

	}
}