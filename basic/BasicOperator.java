package basic;

public class BasicOperator {
	public static void show() {
		int numOne = 21;
		int numTwo = 5;

		float sum = numOne + numTwo;
		float difference = numOne - numTwo;
		float product = numOne * numTwo;
		float quotient = (float)numOne / numTwo;

		System.out.println("numOne = " + numOne + ", numTwo = " + numTwo);

		System.out.println("sum = " + sum);
		System.out.println("difference = " + difference);
		System.out.println("product = " + product);
		System.out.println("quotient = " + quotient);

		System.out.println("++numOne => " + (++numOne) + ", --numTwo => " + (--numTwo));

		System.out.println(numOne == numTwo);
		System.out.println(numOne != numTwo);
		System.out.println(numOne > numTwo);
		System.out.println(numOne < numTwo);

		// constant
		final String NAME = "Mike";
		System.out.println(NAME instanceof String);

		System.out.println((numOne > numTwo) ? "bigger" : "not bigger");
	}
}
