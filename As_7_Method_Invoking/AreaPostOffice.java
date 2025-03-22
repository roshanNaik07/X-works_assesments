class AreaPostOffice{
	static void areaDelivery(String customername,String address){
		System.out.println("Running areaDelivery in AreaPostOffice");
		SubRegionalPostOffice.subDelivery(customername,address);
	}
}