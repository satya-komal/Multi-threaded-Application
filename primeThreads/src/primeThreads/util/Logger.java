
package primeThreads.util;


import primeThreads.util.Logger;
import primeThreads.util.Logger.DebugLevel;

public class Logger {
	  public static enum DebugLevel { CONSTRUCTOR,RunThreads,Add_Data,Cont_Data,Screen
    };

    static String file;
  
   public static void setName(String s){
		file =s;
	  }
		public static String getName (){
		       return file;	
		}
  		
private static DebugLevel debugLevel;

public static void setDebugValue (int levelIn) {
switch (levelIn) {
case 4: debugLevel = DebugLevel.CONSTRUCTOR; break;
case 3: debugLevel = DebugLevel.RunThreads; break;
case 2: debugLevel = DebugLevel.Add_Data; break;
case 1: debugLevel = DebugLevel.Cont_Data; break;
case 0: debugLevel = DebugLevel.Screen; break;
}
}

public static void setDebugValue (DebugLevel levelIn) {
debugLevel = levelIn;
}

//@return None
public static void writeMessage (String message  ,
      DebugLevel levelIn ) {
if (levelIn == debugLevel)
System.out.println(message);
}

public String toString() {
return "Debug Level is " + debugLevel;
}
}
