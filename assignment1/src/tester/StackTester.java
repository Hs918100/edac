package tester;

import java.util.Arrays;
import java.util.Scanner;

import com.app.StackIntImpl;
import com.app.StackIntf;

public class StackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of stack");
        StackIntf stack= new StackIntImpl(sc.nextInt());
//        QueueIntf queue= new QueueIntImpl(sc.nextInt());
        boolean exit = false;
        while(!exit)
        {
        	System.out.println("1.Push 2.Pop 3.Show 4.exit");
            switch (sc.nextInt()){
                case 1:
                	 System.out.println("Enter the number");
                     stack.push(sc.nextInt());
                     break;
                        
                case 2:
                    System.out.println(stack.pop());
                    break;
                case 3:
                	System.out.println(Arrays.toString(stack.peek()));
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