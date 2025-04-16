import java.util.*;

public class qc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int x=sc.nextInt();
            int arr[]=new int[n];
            // arr[0]=x;
            int i=0;
            while(i<32){
                if( (x & (1<<i)) ==0){
                    break;
                }
                i++;
            }
            int max=0;
            int or=0;
            max=(int)Math.pow(2,i);
            i=0;
            int cur=0;
            while(i<n-1 && cur<max){
                arr[i]=cur;
                or=(or | arr[i]);
                cur++;
                i++;
            }
            while(i<n-1){
                arr[i]=0;
                i++;
            }
            if(i==n-1){
                if(cur!=max){
                    if((or | cur)==x) arr[i]=cur;
                    else arr[i]=x;
                }
                else{
                    arr[i]=x;
                }
            }
            for(int j:arr){
                System.out.print(j+" ");
            }
            System.out.println();
            t--;
        }
    }
}