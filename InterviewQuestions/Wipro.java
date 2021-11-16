import java.util.ArrayList;

public class Wipro {
     
    

    public static void main(String[] args) {
        int[] arr= { 0, 0, 1, 0, 1, 1, 1,1,1,1,  1, 0,1,1,1,1 };
        ArrayList<Integer> a= new ArrayList<>();
        int i =0;
        for(;i<arr.length;i++){

            if(arr[i]==0){
                a.add(i);
            }

        }
        if(arr[arr.length-1]==1){
            a.add(arr.length);
        }
       
        int d =0;
        int f =0;
        for(int j =0;j<a.size()-1;j++){

            if(a.get(j)!=a.get(j+1)+1 && j<a.size()-2){
              int x = a.get(j+2)-a.get(j);
              if(x>d){
                  d=x;
                  f= a.get(j+1);
              }

            }

        }
        System.out.println(f);
         
    }
}
