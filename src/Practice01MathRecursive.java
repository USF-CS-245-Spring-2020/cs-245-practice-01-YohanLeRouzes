
public class Practice01MathRecursive implements Practice01Math {

	public int fib(int n) throws Exception {
		int fibResult=0; //Declare the result
		if(n<0) //If the given number is less than 0 the result is undefined, throw exception
			throw new Exception("Undefined");
		else if(n==0) //if n is 0 the result is 0
			fibResult=0;
		else if (n==1) //if n is 1 the result is 1
			fibResult=1;
		else
			fibResult=(fib(n-1))+(fib(n-2)); //if n is greater than 1 the result is equal to the sum of fib(n-1) + fib(n-2)
		return fibResult;
	}
	
	public int fact(int n) throws Exception {
		int factResult=0; //Declare the result
		if(n<0) //if n is less than 0 the result is undefined, throw exception
			throw new Exception("Undefined");
		else if(n==0) //if n is 0 the result is 0
			factResult=0;
		else if(n==1) //if n is one the result is 1
			factResult=1;
		else //if n is greater than 1 the result is n times fact(n-1)
			factResult=n*(fact(n-1));
		return factResult;
	}
	
}
