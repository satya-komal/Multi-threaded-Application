
package primeThreads.threadMgmt;

import primeThreads.store.Results;
import primeThreads.util.FileProcessor;
import primeThreads.util.IsPrime;
import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class CreateWorkers  {

	FileProcessor fp ;
	Results rs ;
	IsPrime ip ;

	public void startWorkers(int a){
		WorkerThread wt = new WorkerThread(fp,rs,ip);
		wt.createThreads(a);
	}
	public CreateWorkers(){
		
	}
	public CreateWorkers( FileProcessor a, Results b,IsPrime c){
		fp=a;
		rs=b;
		ip=c;
		Logger.writeMessage("Called CreateWorker constructor", Logger.DebugLevel.CONSTRUCTOR);
	}
}