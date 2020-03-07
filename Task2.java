
package task2;
import java.util.Scanner;
public class Task2 {

    public static void main(String[] args) {
         Scanner reader=new Scanner(System.in);
        int num;
        int y;
        int z;
        String initial="";
        String result="";
       
        
        System.out.println(" Enter the number ");
        num=reader.nextInt();
        z=num;
        
        while (Math.abs(num)>0)
        {
            initial+= Math.abs(num) %10;
            num=num/10;
        }
        
      
        
        for(int x=initial.length()-1 ;  x >= 0 ;  x--)
        {
            result+=initial.charAt(x);
        }
        
        if ( z < 0)       result="-"+result;
        
        System.out.println(" After conversion the type , the result is " + result);
        
        
        
        
        }
    
}
       
   
    

