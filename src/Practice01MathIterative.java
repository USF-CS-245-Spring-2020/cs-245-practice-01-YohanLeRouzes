
public class Practice01MathIterative implements Practice01Math {

	public int fib(int n) throws Exception {
		 int nMinusTwo, nMinusOne=0, currentN=0; //Declare variables
		 if(n<0) //if n is less than 0 result is undefined, throw exception
				throw new Exception("Undefined");
		 //currentN is already 0 so no change if n is 0
		 else if(n>0) //if n is greater than 0, set currentN as 1
			 currentN=1;		 
	        for(int i=1;i<n;i++) { //Declare i=1, as long as i is less than n every variable is decreasing by 1

	            nMinusTwo = nMinusOne;
	            nMinusOne = currentN;
	            currentN = nMinusTwo + nMinusOne; //nMinusTwo is added to nMinusOne

	        }
	        return currentN;
	    
	}
	
	public int fact(int n) throws Exception {
		  if(n<=0) //if n is less or equal to 0 result is undefined, throw exception
			throw new Exception("Undefined");
		  int result = 1; //declare result variable
		  for (int j=1;j<=n;j++) //declare j=1, result is multiplied by j as long as j is less or equal to n
		    result *= j;
		  return result;
	}
	
}
