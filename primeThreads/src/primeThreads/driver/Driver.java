
package primeThreads.driver;

import java.io.BufferedReader;
import java.io.IOException;

import primeThreads.store.Results;
import primeThreads.threadMgmt.CreateWorkers;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;


public class Driver {
	public static void main(String[] args)throws IOException {

		Logger.setName(args[0]);

		int d=Integer.parseInt(args[2]);
		Logger.setDebugValue(d);

		if(args.length !=3){
			System.out.println("The no of command line arguments has to be 3");
			System.err.println("Error: Program takes 3 arguments");
		}
		else {
			int x = Integer.parseInt(args[1]);     //No_Threads
			int y = Integer.parseInt(args[2]);     //Debug Value

			if( 1<=x && x<=5 ){	
				if(0<=y && y<=4){

					FileProcessor fp =new FileProcessor();
					Results rs =new Results();
					IsPrime ip = new IsPrime();

					CreateWorkers cw =new CreateWorkers(fp,rs,ip);
					cw.startWorkers(x);
					//System.out.println(rs.getV());
					rs.writeSumToScreen();
					rs.printVector();
				}
				else{
					System.out.println("ERROR: The Debug value has to be >=0 and <=4");	
				}
			}
			else{
				System.out.println("ERROR: The num_Threads has to be <=5 && >=1");				
			}
		}		
	} 
} 



