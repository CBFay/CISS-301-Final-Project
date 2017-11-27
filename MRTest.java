class MRTest {
		
	public static void main(String[] args) {
		MorseReader MR = new MorseReader();
		
		MR.listen(0);
		MR.listen(1);
		MR.listen(2);
		MR.toEnglish();
	}
}