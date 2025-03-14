class Char_Ex{
	public static void main(String[]args){
		char division='/',not='!',teamName='A',grade='B',minus='-';
		System.out.println("division="+division+" not="+not+" teamName= "+teamName+" grade="+grade+" minus="+minus);
		division='%';
		not='X';
		teamName='B';
		grade='A';
		minus='-';
		System.out.println("After reinitializing \n division="+division+" not="+not+" teamName= "+teamName+" grade="+grade+" minus="+minus);
	}
}