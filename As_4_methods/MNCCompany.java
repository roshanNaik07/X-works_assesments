public class MNCCompany{
	public static void main(String[]args){
		openMNCLink();
		topMNC();
		nearMNC();
		layOFFs();
		closeMNCLink();
		OnLaptop.onLap();
		OnLaptop.osOn();
		OnLaptop.openWindow();
		OnLaptop.openEmail();
		OnLaptop.signIn();
	}
	static void openMNCLink(){
		System.out.println("Opening the MNC List");
	}
	static void topMNC(){
		System.out.println("TCS , HUL ,Infosys");
	}
	static void nearMNC(){
		System.out.println("TCS , HP etc");
	}
	static void layOFFs(){
		System.out.println("Google , Amazon etc");
	}
	static void closeMNCLink(){
		System.out.println("Closing the link");
	}
}