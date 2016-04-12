
package primeThreads.store;

import java.util.Vector;

import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class Results implements StdoutDisplayInterface {

	public int sum=0;
	private static Vector<Integer> v = new Vector<Integer>(10, 5);

	public void addNum(int In){
		//System.out.println(In);
		v.add(In);
		Logger.writeMessage(In +" is added to vector data structure", Logger.DebugLevel.Add_Data);
	}

	public void printVector(){
		int l= v.size();
		for(int i=0;i<l;i++){
			sum =sum+ v.get(i);
			Logger.writeMessage("The contents of vector data structure are:" +v.get(i) , Logger.DebugLevel.Cont_Data);

		}
	}


	public void writeSumToScreen() {
		//System.out.println(v.size());
		int l= v.size();
		//System.out.println("vector size is "+ l);
		for(int i=0;i<l;i++){
			sum =sum+ v.get(i);
		}
		Logger.writeMessage("The sum of all the prime numbers is " + sum, Logger.DebugLevel.Screen);
	}

	public Vector<Integer> getV(){
		return v;
	}
} 


