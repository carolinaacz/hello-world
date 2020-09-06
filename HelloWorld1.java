package HelloWorld1;

import java.io.PrintStream;

class HelloWorld1 {

	// Name : Carolina Chavez Zavaleta
	// Assignment : HelloWorld1
	// Date : 2019

	PrintStream out;

	HelloWorld1() {
		out = new PrintStream(System.out);
	}

	void start() {
		out.printf("Hello world!! ");
		out.printf("written by: %s\n", "...");
	}

	public static void main(String[] argv) {
		new HelloWorld1().start();
	}
}