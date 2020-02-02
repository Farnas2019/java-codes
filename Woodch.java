package woodch;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Woodch {

       public static void main(String[] args) throws FileNotFoundException{
       
           Scanner input = new Scanner(new File("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\woodch\\input.txt"));
           PrintWriter write = new PrintWriter("C:\\Users\\Farnas\\Documents\\NetBeansProjects\\woodch\\output.txt");
            while(input.hasNext()){
           int solution = 0 ; 
           int L = input.nextInt();
           int N = input.nextInt();
           int integer[] = new int[3];
           int p = L/2;
           for(int i=0; i<3;  i++)
           {
               integer[i]= input.nextInt();
           }
           if (L==0)
               break;
           if(L<1000 && N<50 && L!=0){
               solution = ( integer[0] + integer[1] + integer [2] + p);
           }
          write.println("The Price is" +solution );
           } 
       
        write.close();
        input.close();
           
    }
    
}
