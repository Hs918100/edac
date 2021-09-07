package tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.QueueIntImpl;
import com.app.QueueIntf;



public class QueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of queue");
        QueueIntf queue= new QueueIntImpl(sc.nextInt());
        boolean exit = false;
        while(!exit)
        {
        	System.out.println("1.enque 2.deque 3.Show 4.exit");
            switch (sc.nextInt()){
                case 1:
                	 System.out.println("Enter the number");
                     queue.addQ(sc.nextInt());
                     break;
                        
                case 2:
                    System.out.println(queue.deleteQ());
                    break;
                case 3:
                	System.out.println(Arrays.toString(queue.peek()));
                	break;
                default:
                           System.out.println("Invalid input");
                    break;
//            
                case 4:
                	sc.close();
                	exit=true;
                	break;
             
            }
        }
    }
}