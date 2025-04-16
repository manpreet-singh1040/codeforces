import java.util.*;

public class q11{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=1;
        while(t > 0 ){
           int n=sc.nextInt();
           Integer arr[]=new Integer[n];
           int d=sc.nextInt();
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           if(n==1 ){
            if(arr[0]<=d) System.out.println(0);
            else System.out.println(1);
            break; 
           }
        //    Comparator<Integer> comp=(a,b)->{
        //     if(a>b) return -1;
        //     else if(a==b) return 0;
        //     return 1;
        //    };
           Arrays.sort(arr,(a, b) -> Integer.compare(b, a));
        //    Long cur=(long)0;
           int ans=0;
           int j=0;
           int x=n;
           for(int i=0;i<n && x>0;i++){
             x--;
             long cur=arr[i];
             while(cur<=d && x>0){
                cur+=arr[i];
                x--;
             }
            //  System.out.println("qwerty  "+cur);
             if(cur>d){ ans++;}

           }
           System.out.println(ans);
            t--;
        }
        sc.close();
    }
}