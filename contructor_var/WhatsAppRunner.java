class WhatsAppRunner{
	
	public static void main(String[]args){
		
	boolean profilePic=true;
	String accountName="Roshan";
	String accountType="personal";
	
	WhatsApp whatsApp1=new WhatsApp(profilePic,accountName,accountType);
	
	System.out.println("WhatsApp 1:");
	System.out.println("profilePic: "+whatsApp1.profilePic+"\naccountName :"
		+whatsApp1.accountName+"\naccountType: "+whatsApp1.accountType);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean profilePic1=false;
	String accountName1="FoodFactory";
	String accountType1="Bussiness";
	
	WhatsApp whatsApp2 = new WhatsApp(profilePic1,accountName1,accountType1);
	
	System.out.println("WhatsApp 2:");
	System.out.println("profilePic: "+whatsApp2.profilePic+"\naccountName :"
		+whatsApp2.accountName+"\naccountType: "+whatsApp2.accountType);
	
	System.out.println("---------------------------\n-----------------------");
	
	boolean profilePic2=true;
	String accountName2="Hrishikesh";
	String accountType2="Personal";
	
	WhatsApp whatsApp3 = new WhatsApp(profilePic2,accountName2,accountType2);
	
	System.out.println("WhatsApp 3:");
	System.out.println("profilePic: "+whatsApp3.profilePic+"\naccountName :"
		+whatsApp3.accountName+"\naccountType: "+whatsApp3.accountType);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean profilePic3=false;
	String accountName3="Xworkz";
	String accountType3="Bussiness";
	
	WhatsApp whatsApp4 = new WhatsApp(profilePic3,accountName3,accountType3);
	
	System.out.println("WhatsApp 4:");
	System.out.println("profilePic: "+whatsApp4.profilePic+"\naccountName :"
		+whatsApp4.accountName+"\naccountType: "+whatsApp4.accountType);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean profilePic4=true;
	String accountName4="Ketan";
	String accountType4="personal";
	
	WhatsApp whatsApp5 = new WhatsApp(profilePic4,accountName4,accountType4);
	
	System.out.println("WhatsApp 5:");
	System.out.println("profilePic: "+whatsApp5.profilePic+"\naccountName :"
		+whatsApp5.accountName+"\naccountType: "+whatsApp5.accountType);
	

	}
}