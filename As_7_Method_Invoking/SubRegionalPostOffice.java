class SubRegionalPostOffice{
	static void subDelivery(String customername,String address){
		System.out.println("Running subDelivery in SubRegionalPostOffice");
		RegionalPostOffice.deliver(customername,address);
	}
}