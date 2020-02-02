
package even.numbers;
import java.util.*;

public class EvenNumbers {

   public static void main(String[] args) {
       int count=0;
       Scanner input = new Scanner(System.in);
       String Num = input.next();
       int add; char b;
       for (int i =0; i<10; i++){
         b = Num.charAt(i);
         String convert = Character.toString(b);
         add = Integer.parseInt(convert);
         if (add%2==0){
         
           System.out.println(count +=1);
         }
         
       }
   }
}
