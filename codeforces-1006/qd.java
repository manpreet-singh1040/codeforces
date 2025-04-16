import java.util.*;

public class qd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[]=new int[n];
            int l=-1;
            int r=-1;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int max=0;
            for(int i=0;i<n;i++){
                int pr=0;
                int curMax=0;
                int maxi=-1;
                for(int j=i+1;j<n;j++){
                    if(arr[j]<arr[i]) pr++;
                    if(arr[j]>arr[i]) pr--;
                    if(pr>curMax){
                        curMax=pr;
                        maxi=j;
                    }
                }
                // System.out.println((i+1)+"  "+curMax+" "+max);
                if(curMax>max){
                    l=i;
                    r=maxi;
                    max=curMax;
                }
            }
            if(l==r && l==-1){
                l=0;
                r=0;
            }
            l++;
            r++;
            System.out.println(l+" "+r);
            t--;
        }
    }
}