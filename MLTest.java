// Describes how a GUI could interface with the MorseListener class
// Compile and run this java code for a demonstration
// Created by CB Fay on 11.27.2017

class MLTest {
	static MorseListener ML = new MorseListener();
	
	public static void main(String[] args) {
		
		// The "Listen" button should call the method listen()
		ML.listen();
		
		// ML.getInput(0); <- Pressing the "Wait" button should call this method
		// ML.getInput(1); <- Pressing the "Short" button should call this method
		// ML.getInput(2); <- Pressing the "Long" button should call this method
		
		// h
		ML.getInput(1);
		ML.getInput(1);
		ML.getInput(1); 
		ML.getInput(1); 
		letter(); // see below for explanation
		// e
		ML.getInput(1);
		ML.getInput(1);
		letter();
		// l
		ML.getInput(1);
		ML.getInput(2);
		ML.getInput(1);
		ML.getInput(1);
		letter();
		// l
		ML.getInput(1);
		ML.getInput(2);
		ML.getInput(1);
		ML.getInput(1);
		letter();
		// o
		ML.getInput(2);
		ML.getInput(2);
		ML.getInput(2);
		space(); // see below for explanation
		
		// t
		ML.getInput(2);
		letter();
		// h
		ML.getInput(1);
		ML.getInput(1);
		ML.getInput(1);
		ML.getInput(1);
		letter();
		// e
		ML.getInput(1);
		letter();
		// r
		ML.getInput(1);
		ML.getInput(2);
		ML.getInput(1);
		letter();
		// e
		ML.getInput(1);
		letter();
		
		// The "Stop" button should call stopListen(), and display the return value
		System.out.println(ML.stopListen());
	}
	
	// Just for convenience, calling this method calls getInput(0) 3 times.
	public static void letter() {
		for (int i = 0; i < 3; i++) {
			ML.getInput(0);
		}
	}

	// Likewise, but 7 times.
	public static void space() {
		for (int i = 0; i < 7; i++) {
			ML.getInput(0);
		}
	}		

}