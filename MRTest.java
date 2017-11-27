class MRTest {
		
	public static void main(String[] args) {
		MorseReader MR = new MorseReader();
		
		MR.listen(0); 	// button "wait"
		MR.listen(1); 	// button "short"
		MR.listen(2); 	// button "long"
		MR.toEnglish(); // button "done"
	}
}
