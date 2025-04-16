import java.util.*;

public class q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr1[]=new int[n];
            int arr2[]=new int[n];
            for(int i=0;i<n;i++){
                arr1[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=sc.nextInt();
            }
            int l=0;
            int r=n-1;
            while(l<n){
                if(arr1[l]!=arr2[l])break;
                l++;
            }
            while(r>=0){
                if(arr1[r]!=arr2[r]) break;
                r--;
            }
            // System.out.println("answerr --> "+l+" "+r);
            if(l==n && r==-1){
                l=0;
                r=0;
                int curl=0;
                int curr=0;
                for(int i=1;i<n;i++){
                    if(arr1[i-1]<=arr1[i]){
                        curr=i;
                    }
                    else{
                        if(r-l< curr-curl){
                            l=curl;
                            r=curr;
                        }
                        curl=i;
                        curr=i;
                    }
                }
                if(r-l< curr-curl){
                    l=curl;
                    r=curr;
                }
            }
            else{
                int x=l;
                int y=r;
                while(x-1>=0 && arr2[x]>=arr2[x-1]){
                    x--;
                }
                l=x;
                while(y+1<n && arr2[y]<=arr2[y+1]){
                    y++;
                }
                r=y;
            }
            l++;
            r++;
            System.out.println(l+" "+r);
            t--;
        }
    }

    static int gcd(int a, int b) {
        if (a % b == 0)
            return b;
        else {
            if (a >= b)
                return gcd(a % b, b);
            else
                return gcd(b % a, a);
        }
    }
}