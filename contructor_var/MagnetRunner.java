class MagnetRunner{
	
	public static void main(String[]args){
		
	String type="Neodymium Magnet";
	String power="100-200N";
	int price=8000;
	
	Magnet magnet1=new Magnet(type,power,price);
	
	System.out.println("Magnet 1:");
	System.out.println("type: "+magnet1.type+"\npower :"
		+magnet1.power+"\nprice: "+magnet1.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String type1="Samarium-Cobalt Magnet";
	String power1="150-300N";
	int price1=24000;
	
	Magnet magnet2 = new Magnet(type1,power1,price1);
	
	System.out.println("Magnet 2:");
	System.out.println("type: "+magnet2.type+"\npower :"
		+magnet2.power+"\nprice: "+magnet2.price);
	
	System.out.println("---------------------------\n-----------------------");
	
	String type2="Alnico Magnet";
	String power2="100-150N";
	int price2=20000;
	
	Magnet magnet3 = new Magnet(type2,power2,price2);
	
	System.out.println("Magnet 3:");
	System.out.println("type: "+magnet3.type+"\npower :"
		+magnet3.power+"\nprice: "+magnet3.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String type3="Ceramic (Ferrite) Magnet";
	String power3="10-25N";
	int price3=4000;
	
	Magnet magnet4 = new Magnet(type3,power3,price3);
	
	System.out.println("Magnet 4:");
	System.out.println("type: "+magnet4.type+"\npower :"
		+magnet4.power+"\nprice: "+magnet4.price);
		
	System.out.println("---------------------------\n-----------------------");
	
	String type4="Electromagnet";
	String power4="10-50N";
	int price4=40000;
	
	Magnet magnet5 = new Magnet(type4,power4,price4);
	
	System.out.println("Magnet 5:");
	System.out.println("type: "+magnet5.type+"\npower :"
		+magnet5.power+"\nprice: "+magnet5.price);
	

	}
}