class Doctor{
	static void treatment(String patientname,int age){
		System.out.println("Running treatment in Nurse");
		Nurse.assist(patientname);
	}
}