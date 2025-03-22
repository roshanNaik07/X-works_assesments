class Flag{
	
	String Country;
	int noOfColors;
	String colors;
	String Orientaton;
	
	public static void main(String[]values){
		
		Flag Flag1=new Flag();
		Flag1.Country="India ";
		Flag1.noOfColors=4;
		Flag1.colors="Orange, White, Green, Blue";
		Flag1.Orientaton="Horizontal";
		System.out.println("Flag1 details:");
		System.out.println("Country :"+Flag1.Country+"\nnoOfColors :"+Flag1.noOfColors+"\ncolors :"+Flag1.colors+
					"\nOrientaton: "+Flag1.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag2=new Flag();
		Flag2.Country=" Japan   ";
		Flag2.noOfColors=2;
		Flag2.colors="White ,Red";
		Flag2.Orientaton="Centered circle";
		System.out.println("USB-B ,USB-A,USB-C :");
		System.out.println("Country :"+Flag2.Country+"\nnoOfColors :"+Flag2.noOfColors+"\ncolors :"+Flag2.colors+
					"\nOrientaton: "+Flag2.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag3=new Flag();
		Flag3.Country="Chile  ";
		Flag3.noOfColors=3;
		Flag3.colors="Red,White,Blue";
		Flag3.Orientaton="Horizontal";
		System.out.println("Flag3 details:");
		System.out.println("Country :"+Flag3.Country+"\nnoOfColors :"+Flag3.noOfColors+"\ncolors :"+Flag3.colors+
					"\nOrientaton: "+Flag3.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag4=new Flag();
		Flag4.Country="Italy  ";
		Flag4.noOfColors=3;
		Flag4.colors="Green,white,Red";
		Flag4.Orientaton="Verticle";
		System.out.println("Flag4 details:");
		System.out.println("Country :"+Flag4.Country+"\nnoOfColors :"+Flag4.noOfColors+"\ncolors :"+Flag4.colors+
					"\nOrientaton: "+Flag4.Orientaton);
					
		System.out.println("---------------------------\n------------------------");			
		
		Flag Flag5=new Flag();
		Flag5.Country="Peru  ";
		Flag5.noOfColors=2;
		Flag5.colors="Red,White";
		Flag5.Orientaton="Verticle";
		System.out.println("Flag5 details:");
		System.out.println("Country :"+Flag5.Country+"\nnoOfColors :"+Flag5.noOfColors+"\ncolors :"+Flag5.colors+
					"\nOrientaton: "+Flag5.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag6=new Flag();
		Flag6.Country="Mali  ";
		Flag6.noOfColors=3;
		Flag6.colors="Green,Yellow,Red";
		Flag6.Orientaton="Verticle";
		System.out.println("Flag6 details:");
		System.out.println("Country :"+Flag6.Country+"\nnoOfColors :"+Flag6.noOfColors+"\ncolors :"+Flag6.colors+
					"\nOrientaton: "+Flag6.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag7=new Flag();
		Flag7.Country="Laos   ";
		Flag7.noOfColors=3;
		Flag7.colors="Red,Blue,white";
		Flag7.Orientaton="Horizontal";
		System.out.println("Flag7 details:");
		System.out.println("Country :"+Flag7.Country+"\nnoOfColors :"+Flag7.noOfColors+"\ncolors :"+Flag7.colors+
					"\nOrientaton: "+Flag7.Orientaton);
		
		System.out.println("---------------------------\n------------------------");
		
		Flag Flag8=new Flag();
		Flag8.Country="Ghana   ";
		Flag8.noOfColors=3;
		Flag8.colors="Red, Yellow, Green";
		Flag8.Orientaton="Horizontal";
		System.out.println("Flag8 details:");
		System.out.println("Country :"+Flag8.Country+"\nnoOfColors :"+Flag8.noOfColors+"\ncolors :"+Flag8.colors+
					"\nOrientaton: "+Flag8.Orientaton);
		
		
	}
}