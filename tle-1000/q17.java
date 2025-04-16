import java.util.*;

public class q17{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            int fst=fsb(n-1);
            int temp=(int)Math.pow(2,fst);
            // System.out.println("the max iss "+temp );
            int x=temp;
            while(x<=n-1){
                arr.add(x);
                x++;
            }
            Collections.reverse(arr);
            arr.add(0);
            for(int i=1;i<temp;i++){
                arr.add(i);
            }
            for(int i: arr){
                System.out.print(i+" ");
            }
            System.out.println();
            t--;
        }
        sc.close();
    }
    static int fsb(int x){
        int ans=0;
        while(x>0){
            ans++;
            x=(x>>1);
        }
        return ans-1;
    }
}