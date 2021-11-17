
/*Theatre Square in the capital city of Berland has a rectangular shape with the size n × m meters. On the occasion of the city's anniversary, a decision was taken to pave the Square with square granite flagstones. Each flagstone is of the size a × a.

What is the least number of flagstones needed to pave the Square? It's allowed to cover the surface larger than the Theatre Square, but the Square has to be covered. It's not allowed to break the flagstones. The sides of flagstones should be parallel to the sides of the Square.

Input
The input contains three positive integer numbers in the first line: n,  m and a (1 ≤  n, m, a ≤ 109).

Output
Write the needed number of flagstones.*/




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
