class Var_byte_ex{
	public static void main(String[]args){
		byte stockLeft = 5, rollNO = 25, ticketNo = 6, numberOfLanguages=45, classStrength=65;
		System.out.println(" stockLeft :"+stockLeft+" rollNO="+rollNO+" ticketNo="+ticketNo+" numberOfLanguages="+numberOfLanguages+" classStrength=" +classStrength);
		stockLeft=2;
		rollNO=41;
		ticketNo=8;
		numberOfLanguages=67;
		classStrength=50;
		System.out.println("After reinitialization :\n  stockLeft :"+stockLeft+" rollNO="+rollNO+" ticketNo="+ticketNo+" numberOfLanguages="+numberOfLanguages+" classStrength=" +classStrength);
	}
}