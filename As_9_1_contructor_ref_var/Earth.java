class Earth{
	
	String continent;
	int noOfCountries;
	float population;
	String countryName;
	
	public static void main(String[]values){
		
		Earth Earth1=new Earth();
		Earth1.continent="Asia";
		Earth1.noOfCountries=49;
		Earth1.population=1.43f;
		Earth1.countryName="India";
		System.out.println("Earth1 details:");
		System.out.println("continent :"+Earth1.continent+"\nnoOfCountries :"+Earth1.noOfCountries+"\npopulation :"+Earth1.population+
					"\ncountryName: "+Earth1.countryName);
		
		System.out.println("---------------------------\n------------------------");
		
		Earth Earth2=new Earth();
		Earth2.continent=" Africa ";
		Earth2.noOfCountries=53;
		Earth2.population=223f;
		Earth2.countryName="Nigeria";
		System.out.println("USB-B ,USB-A,USB-C :");
		System.out.println("continent :"+Earth2.continent+"\nnoOfCountries :"+Earth2.noOfCountries+"\npopulation :"+Earth2.population+
					"\ncountryName: "+Earth2.countryName);
		
		System.out.println("---------------------------\n------------------------");
		
		Earth Earth3=new Earth();
		Earth3.continent="North America";
		Earth3.noOfCountries=23;
		Earth3.population=335f;
		Earth3.countryName="United States";
		System.out.println("Earth3 details:");
		System.out.println("continent :"+Earth3.continent+"\nnoOfCountries :"+Earth3.noOfCountries+"\npopulation :"+Earth3.population+
					"\ncountryName: "+Earth3.countryName);
		
		System.out.println("---------------------------\n------------------------");
		
		Earth Earth4=new Earth();
		Earth4.continent="South America";
		Earth4.noOfCountries=12;
		Earth4.population=216f;
		Earth4.countryName="Brazil";
		System.out.println("Earth3 details:");
		System.out.println("continent :"+Earth4.continent+"\nnoOfCountries :"+Earth4.noOfCountries+"\npopulation :"+Earth4.population+
					"\ncountryName: "+Earth4.countryName);
					
		System.out.println("---------------------------\n------------------------");			
		
		Earth Earth5=new Earth();
		Earth5.continent="Europe";
		Earth5.noOfCountries=44;
		Earth5.population=83;
		Earth5.countryName="Germany";
		System.out.println("Earth5 details:");
		System.out.println("continent :"+Earth5.continent+"\nnoOfCountries :"+Earth5.noOfCountries+"\npopulation :"+Earth5.population+
					"\ncountryName: "+Earth5.countryName);
		
		System.out.println("---------------------------\n------------------------");
		
		Earth Earth6=new Earth();
		Earth6.continent="Australia";
		Earth6.noOfCountries=14;
		Earth6.population=26;
		Earth6.countryName="Australia";
		System.out.println("Earth6 details:");
		System.out.println("continent :"+Earth6.continent+"\nnoOfCountries :"+Earth6.noOfCountries+"\npopulation :"+Earth6.population+
					"\ncountryName: "+Earth6.countryName);
		
		System.out.println("---------------------------\n------------------------");
		
		Earth Earth7=new Earth();
		Earth7.continent="Antarctica ";
		Earth7.noOfCountries=0;
		Earth7.population=0;
		Earth7.countryName="McMurdo Station (USA)";
		System.out.println("Earth7 details:");
		System.out.println("continent :"+Earth7.continent+"\nnoOfCountries :"+Earth7.noOfCountries+"\npopulation :"+Earth7.population+
					"\ncountryName: "+Earth7.countryName);
		

	}
}