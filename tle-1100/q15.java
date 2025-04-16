import java.util.*;

public class q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String str=sc.next();
            int n=str.length();
            long ans=0;
            ArrayList<Integer> arr=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0') arr.add(i);
            }
            if(arr.size()==0){
                ans=((long)n)*n;
            }
            else{
                long x=arr.get(0);
                x+=(n-arr.get(arr.size()-1)-1);
                if(x%2==0){
                    ans=Math.max(ans,(x/2)*(x/2+1));
                }
                else{
                    x++;
                    ans=Math.max(ans,(x/2)*(x/2));
                }
                // ans=x*x;
                long prev=arr.get(0);
                for(int i=1;i<arr.size();i++){
                    long len=arr.get(i)-prev-1;
                    if(len%2==0){
                        ans=Math.max(ans,(len/2)*(len/2+1));
                    }
                    else{
                        len++;
                        ans=Math.max(ans,(len/2)*(len/2));
                    }
                    prev=arr.get(i);
                }
            }
            System.out.println(ans);
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