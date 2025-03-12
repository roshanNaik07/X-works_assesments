class ChatRunner{
	
	public static void main(String[]args){
		
	boolean subcription=true;
	String attach="photo";
	String theme="Dark";
	
	Chat chat1=new Chat(subcription,attach,theme);
	
	System.out.println("Chat 1:");
	System.out.println("subcription: "+chat1.subcription+"\nattach :"
		+chat1.attach+"\ntheme: "+chat1.theme);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean subcription1=false;
	String attach1="Photo,vedio";
	String theme1="Bright";
	
	Chat chat2 = new Chat(subcription1,attach1,theme1);
	
	System.out.println("Chat 2:");
	System.out.println("subcription: "+chat2.subcription+"\nattach :"
		+chat2.attach+"\ntheme: "+chat2.theme);
	
	System.out.println("---------------------------\n-----------------------");
	
	boolean subcription2=true;
	String attach2="pdf";
	String theme2="Dark";
	
	Chat chat3 = new Chat(subcription2,attach2,theme2);
	
	System.out.println("Chat 3:");
	System.out.println("subcription: "+chat3.subcription+"\nattach :"
		+chat3.attach+"\ntheme: "+chat3.theme);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean subcription3=false;
	String attach3="img,vedio,pdf";
	String theme3="Bright";
	
	Chat chat4 = new Chat(subcription3,attach3,theme3);
	
	System.out.println("Chat 4:");
	System.out.println("subcription: "+chat4.subcription+"\nattach :"
		+chat4.attach+"\ntheme: "+chat4.theme);
		
	System.out.println("---------------------------\n-----------------------");
	
	boolean subcription4=true;
	String attach4="vedio";
	String theme4="Dark";
	
	Chat chat5 = new Chat(subcription4,attach4,theme4);
	
	System.out.println("Chat 5:");
	System.out.println("subcription: "+chat5.subcription+"\nattach :"
		+chat5.attach+"\ntheme: "+chat5.theme);
	

	}
}