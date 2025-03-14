class Hospital{
	static void checkup(String patientname,int age,long mobile,String email,boolean sicknes){
		System.out.println("Running checkup in Hospital");
		Doctor.treatment(patientname,age);
	}
}