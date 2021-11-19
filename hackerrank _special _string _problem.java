/*    
A string is said to be a special string if either of two conditions is met:

All of the characters are the same, e.g. aaa.
All characters except the middle one are the same, e.g. aadaa.
A special substring is any substring of a string which meets one of those criteria. Given a string, determine how many special substrings can be formed from it.








*/














import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class hackerrank {

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long a = n;
        int b=0;
        int ev=0;
        int od=0;
        
        for(int i =0;i<n;i++){
            int c =i;
          
            
             for(int j=i+1;j<n;j++){
                 if(ev==1 && od==1){
                     break;
                 }
                 int d =j;
               
            if(((j-i)+1)%2==0 ){
                if(ev==1){
                    continue;
                }
                 char l='1';
                while(i<j){
                    char z= s.charAt(i);
                    char y= s.charAt(j);
                
                    if(z==y &&(l=='1' || z==l)){
                       b++;
                    
                       
                        l=z;
                    }
                    else{
                        ev=1;

                        break;
                    }
                   
                    i++;
                    j--;
                }
            if(b==((d-c)+1)/2){
                a++;
                b=0;
                
              
            }
            i=c;
            j=d;
                
            }
            else{
               char l='1';
                while(j!=i){
                    char z= s.charAt(i);
                    char y= s.charAt(j);
                 
                    if(z==y &&(l=='1' || z==l)){
                        b++;
                      
                        l=z;
                    }
                    else{
                         z= s.charAt((d-c)/2+c);
                         y= s.charAt(((d-c)/2+c)-1);
                        if(z!=y){
                            od=1;
                        }
                       
                       
                        break;
                    }
                    i++;
                    j--;
                }
            if(b==(d-c)/2){
                char z= s.charAt(i);
               char y= s.charAt(j-1);
                 
                  if(z!=y){
                     od=1;
                 }
                a++;
              
                
                b=0;
            }
            i=c;
            j=d;
                
                
            }
            b=0;
            }
            b=0;
            ev=0;
            od=0;
            
        }

       return a;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        long result = substrCount(n, s);
        System.out.println(result);

      //  bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();
// bufferedWriter.close();

        scanner.close();
    }
}

