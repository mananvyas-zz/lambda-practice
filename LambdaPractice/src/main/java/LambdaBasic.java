package main.java;

public class LambdaBasic {

	public static void main(String[] args) {
		MyLambda basic = () -> System.out.println("whats up!!");
		MyAdd addFunction = (int a, int b) -> a+b;
	}
	
}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int addFunction(int a, int b);
}