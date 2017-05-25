package main.java;

public class TypeInferenceExample {

	public static void main(String[] args) {
		StringLengthLambda mylambda = (String s) -> s.length();
		System.out.println("Lengh is: " + mylambda.getLength("Check out"));

	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	

}
