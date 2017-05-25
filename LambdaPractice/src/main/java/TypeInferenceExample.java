package main.java;

public class TypeInferenceExample {

	public static void main(String[] args) {
//		StringLengthLambda mylambda = (String s) -> s.length();
//		System.out.println("Lengh is: " + mylambda.getLength("Check out"));
		
		printLambda(s -> s.length());

	}
	
	public static void printLambda(StringLengthLambda l){
		System.out.println(l.getLength("whatever"));
	}
	
	interface StringLengthLambda {
		int getLength(String s);
	}
	

}
