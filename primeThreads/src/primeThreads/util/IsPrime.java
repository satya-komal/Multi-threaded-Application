
package primeThreads.util;

import primeThreads.store.Results;

public class IsPrime {

	Results rs =new Results();
	public synchronized void checkPrime(String Line){
        int a=0;
		try{
			 a =Integer.parseInt(Line);
			 //System.out.println("Line is : "+ Line);
		}catch(NullPointerException n){
			System.out.println("NULL Pointer Exception");
		}

		if( a%2 !=0) {
			//System.out.println("Prime no :"+ a);
			rs.addNum(a);
		}
	}
}
