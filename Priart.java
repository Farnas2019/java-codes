
package priart;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Priart {
    public static void main(String[] args)throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\inputss.txt"));
        PrintWriter write = new PrintWriter("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\outs.txt");
        
while(input.hasNext()){
int count=0;
String first; 
String second;
int add; char c,d;
 first=input.next();
 second=input.next();
for(int j=0;j<3 ;j++){
    c=first.charAt(j);
    d=second.charAt(j);
 String convert= Character.toString(c);
 String convert2= Character.toString(d);
 add=Integer.parseInt(convert)+Integer.parseInt(convert2);
 if(add>=10){
     count++;
 }
 if(count>1 || count == 1){ 
System.out.println(count+" carry operations");
}else{
   System.out.println("No carry operation"); 
}
         write.close();
         input.close();
}
        }
    }
}
    

   
