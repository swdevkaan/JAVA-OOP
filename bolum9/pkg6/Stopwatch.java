package bolum9.pkg6;

public class Stopwatch {
        
        private long startTime;
        private long endTime;
        
      public Stopwatch(){
          
          startTime = System.currentTimeMillis();
      }
       
 




public long getstartTime(){
     return startTime;
    
}

public long getendTime(){
    
    
    return endTime;
}
 
public void stop(){
    
    endTime=System.currentTimeMillis();
    
}

public void start(){
    startTime=System.currentTimeMillis();
}



public long getElapsedTime(){
    return endTime-startTime;
}



}



