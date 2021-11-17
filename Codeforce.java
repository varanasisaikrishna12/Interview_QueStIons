import java.util.Scanner;

public class Codeforce {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        long n = a.nextInt();
        long m = a.nextInt();
        long b = a.nextInt();

        if(n<b && m<b){
            System.out.println("1");
        }
        else if(n<=b){
            if(m%b==0){
              System.out.println(m/b);
            }
            else{
                System.out.println(m/b+1);
            }
          
        }
        else if(m<=b){
            if(n%b==0){
              System.out.println(n/b);
            }
            else{
                System.out.println(n/b+1);
            }
          
        }

        

        else if(n%b==0 && m%b==0){
            if(n==m && m==b){
                System.out.println("1");
            }
            else if(n==m){
                  System.out.println((m*n)/(b*b));
            }
            else{
                System.out.println((m/b)*(n/b));
            }
        }

       else{
           if(n%b==0){
            System.out.println((m/b+1)*(n/b));
           }
           else if(m%b ==0){
            System.out.println((m/b)*(n/b+1));
           }
           else{
            System.out.println((m/b+1)*(n/b+1));
           }
        
       }



    }
}
