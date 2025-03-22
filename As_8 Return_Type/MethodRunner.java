class MethodRunner{
	public static void main(String[]args){
		
		long phNO=9110863479l;
		String phName=FindName.nameIs(phNO);
		System.out.println(phNO+ ":"+phName);
		
		long phNo1=9110863461l;
		String phName1=FindName.nameIs(phNo1);
		System.out.println(phNo1+ ":"+phName1);
		
		System.out.println("- ----------------\n-----------------");
		
		String companyName="Ford";
		String coName=Company.ownerName(companyName);
		System.out.println(companyName+" : "+coName);
		
		System.out.println("-----------------\n-----------------");
		
		String foodName="dosa";
		int foPrice=Food.foodPrice(foodName);
		System.out.println(foodName+" price is :"+foPrice);
		
		System.out.println("-----------------\n-----------------");
		
		long accountNum=546238156l;
		long balanceAmt= Balance.balanceCheck(accountNum);
		System.out.println(accountNum+" has balance: "+balanceAmt);
		
		System.out.println("-----------------\n-----------------");
		
		String sourceName="porota";
		int soPrice= Source.checkPrice(sourceName);
		System.out.println(sourceName+" Price is :"+soPrice);
		
		System.out.println("-----------------\n-----------------");
		
		String personName="Ratan Tata";
		String alOrDe=Alive.aliveOrDead(personName);
		System.out.println(personName+" : "+alOrDe);
	}
}