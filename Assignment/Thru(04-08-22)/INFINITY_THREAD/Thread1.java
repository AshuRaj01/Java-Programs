package lab04_08;

import java.util.Scanner;

public class Thread1  extends Thread
{
    String msg = "";
    Thread1(String msg)
    {
         this.msg = msg;
    }
    public void run()
    {        //infinity loop
              while (true)
              {
                   System.out.println(msg);
              }
    }
    
   
}
