
package langtran;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Langtran {

   
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(System.in); //(new File("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\langtran\\input.txt"));
        PrintWriter write = new PrintWriter("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\langtran\\outs.txt");
  while (input.hasNext()) { 
   String a = input.nextLine();
   String b="";   
    
   int lenght = a.length();
   for (int i=lenght-1; i>=0; i--){
   b= b+a.charAt(i);
    
   }
   write.println(b);
   System.out.print(b);
     }
  write.close();
  input.close();
    }
   
}
