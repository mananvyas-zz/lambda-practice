package main.java;

public class LambdaBasic {

	public static void main(String[] args) {
		MyLambda basic = () -> System.out.println("whats up!!");
		MyAdd add = (int a, int b) -> a+b;
		
		basic.foo();
		
		int result = add.addFunction(2, 3);
		System.out.println(result);
	}
	
}

interface MyLambda {
	void foo();
}

interface MyAdd {
	int addFunction(int a, int b);
}