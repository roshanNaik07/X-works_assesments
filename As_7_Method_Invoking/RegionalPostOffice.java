class RegionalPostOffice{
	static void deliver(String customername,String address){
		System.out.println("Running deliver in RegionalPostOffice");
		PostHeadMaster.headDetails(customername,address);
	}
}