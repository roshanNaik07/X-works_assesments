class FestivalRunner{
	
	public static void main(String[]args){
		
	String festName="Dasara";
	String date="2nd Oct 2025";
	String location="Mysore";
	
	Festival festival1=new Festival(festName,date,location);
	
	System.out.println("Festival 1:");
	System.out.println("FestName: "+festival1.festName+"\ndate :"
		+festival1.date+"\nlocation: "+festival1.location);
		
	System.out.println("---------------------------\n-----------------------");
	
	String festName1="Goa Carnival";
	String date1="2nd March 2025";
	String location1="Goa";
	
	Festival festival2 = new Festival(festName1,date1,location1);
	
	System.out.println("Festival 2:");
	System.out.println("FestName: "+festival2.festName+"\ndate :"
		+festival2.date+"\nlocation: "+festival2.location);
	
	System.out.println("---------------------------\n-----------------------");
	
	String festName2="Sirsi Jatre";
	String date2="10 March 2026";
	String location2="Sirsi";
	
	Festival festival3 = new Festival(festName2,date2,location2);
	
	System.out.println("Festival 3:");
	System.out.println("FestName: "+festival3.festName+"\ndate :"
		+festival3.date+"\nlocation: "+festival3.location);
		
	System.out.println("---------------------------\n-----------------------");
	
	String festName3="Maha Kumbh";
	String date3="feb 2025";
	String location3="Prayagraj";
	
	Festival festival4 = new Festival(festName3,date3,location3);
	
	System.out.println("Festival 4:");
	System.out.println("FestName: "+festival4.festName+"\ndate :"
		+festival4.date+"\nlocation: "+festival4.location);
		
	System.out.println("---------------------------\n-----------------------");
	
	String festName4="Onam";
	String date4="26 Aug, 2025";
	String location4="Kerala";
	
	Festival festival5 = new Festival(festName4,date4,location4);
	
	System.out.println("Festival 5:");
	System.out.println("FestName: "+festival5.festName+"\ndate :"
		+festival5.date+"\nlocation: "+festival5.location);
	

	}
}