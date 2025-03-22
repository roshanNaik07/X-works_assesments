public class Lollipop{
	public static void main(String[]args){
		OnLaptop.onLap();
		OnLaptop.osOn();
		OnLaptop.openWindow();
		OnLaptop.openEmail();
		OnLaptop.signIn();
		openLink();
		select();
		placeOrder();
		closeSite();
	}
	static void openLink(){
		System.out.println("Opening the store link");
	}
	static void select(){
		System.out.println("Select the lollipop");
	}
	static void placeOrder(){
		System.out.println("Place the lollipop order");
	}
	static void makePayment(){
		System.out.println("Make the payment");
	}
	static void closeSite(){
		System.out.println("close the site and log out");
	}
}