
package primeThreads.threadMgmt;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class WorkerThread implements Runnable  {
	public static BufferedReader br = null;
	FileProcessor fp ;
	Results rs ;
	IsPrime ip ;

	@SuppressWarnings("resource")
	String curLine;
	String xy;
	public void run() throws NullPointerException {
		Logger.writeMessage("Called run() method ", Logger.DebugLevel.RunThreads);
//		String ab = Logger.getName();
//		try {
//			if(br==null)  br=new BufferedReader(new FileReader(ab));
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			xy = fp.readLineFromFile (br);
//			if (xy.length()!= 0)   curLine= xy;
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} finally {
//			ip.checkPrime(curLine);
//		}
		try{
			while((xy = fp.readLineFromFile(br)) != null){
				if(xy.length() != 0){
					
					curLine = xy;
					//System.out.println("inside run: "+rs.getV());
					ip.checkPrime(curLine);
					//System.out.println("curLine is "+ curLine);
				}
			}
		}
		catch(IOException e){
			e.printStackTrace();
		}
			
	}

	
	void createThreads(int b){
		String ab = Logger.getName();
		try {
			if(br==null)  br=new BufferedReader(new FileReader(ab));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread[] thread = new Thread[b];             //b - no of threads to create 
		for (int i = 0; i <b ; i++) {
			
			thread[i] = new Thread( new WorkerThread(fp,rs,ip));  
			thread[i].start();
		}
           
		
		for(int i = 0; i <b ; i++){
			try {
				thread[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//System.out.println(rs.getV());
	}

	WorkerThread(FileProcessor a, Results b,IsPrime c){
		fp=a;
		rs=b;
		ip=c;
		Logger.writeMessage("Called Worker Thread Constructor", Logger.DebugLevel.CONSTRUCTOR);	
		//System.out.println("called worker thread constructor");
	}
	
}

