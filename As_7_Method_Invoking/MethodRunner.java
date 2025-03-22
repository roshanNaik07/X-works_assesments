public class MethodRunner{
	
	public static void main(String[]args){
		String item="shoe";
		System.out.println("Running main");
		Courier.pickUp(item);
		
		String vegetable="Onion";
		int quantity=6;
		Customer.buy(vegetable,quantity);
		
		String customerName="Roshan";
		String cusAddress="Bangalore";
		AreaPostOffice.areaDelivery(customerName,cusAddress);
		
		String patientname="Vaibhav";
		int age=22;
		long mobile=56489756;
		String email="roshan@gmail.com";
		boolean sicknes=true;
		Hospital.checkup(patientname,age,mobile,email,sicknes);
	}
}