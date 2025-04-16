import java.util.*;

public class q30{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
           Integer ans[]=new Integer[n];
           for(int i=0;i<n;i++){
            ans[i]=sc.nextInt();
           }
           Comparator<Integer> comp=(a,b)->{ return b-a;};
           Arrays.sort(ans,comp );
            for(int i:ans){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
    
}