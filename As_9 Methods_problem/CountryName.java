class CountryName{
	
	static void printName(String[]countryNames){
		
		for(String names:countryNames){
			int length=names.length();
			if(names.charAt(length-1)=='a'||names.charAt(length-1)=='A'){
				System.out.println(names);
			}
			else{
				continue;
			}
		}
	}
}