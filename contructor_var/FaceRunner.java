class FaceRunner{
	
	public static void main(String[]args){
		
	String name="lobsang";
	String pimple="NO";
	String color="white";
	
	Face face1=new Face(name,pimple,color);
	
	System.out.println("Face 1:");
	System.out.println("FestName: "+face1.name+"\npimple :"
		+face1.pimple+"\ncolor: "+face1.color);
		
	System.out.println("---------------------------\n-----------------------");
	
	String name1="sanket";
	String pimple1="yes";
	String color1="dusky";
	
	Face face2 = new Face(name1,pimple1,color1);
	
	System.out.println("Face 2:");
	System.out.println("FestName: "+face2.name+"\npimple :"
		+face2.pimple+"\ncolor: "+face2.color);
	
	System.out.println("---------------------------\n-----------------------");
	
	String name2="suresh";
	String pimple2="no";
	String color2="balck";
	
	Face face3 = new Face(name2,pimple2,color2);
	
	System.out.println("Face 3:");
	System.out.println("FestName: "+face3.name+"\npimple :"
		+face3.pimple+"\ncolor: "+face3.color);
		
	System.out.println("---------------------------\n-----------------------");
	
	String name3="will smith";
	String pimple3="no";
	String color3="dusky";
	
	Face face4 = new Face(name3,pimple3,color3);
	
	System.out.println("Face 4:");
	System.out.println("FestName: "+face4.name+"\npimple :"
		+face4.pimple+"\ncolor: "+face4.color);
		
	System.out.println("---------------------------\n-----------------------");
	
	String name4="trump";
	String pimple4="no";
	String color4="white";
	
	Face face5 = new Face(name4,pimple4,color4);
	
	System.out.println("Face 5:");
	System.out.println("FestName: "+face5.name+"\npimple :"
		+face5.pimple+"\ncolor: "+face5.color);
	

	}
}