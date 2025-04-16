import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if(map.containsKey(arr[i])) map.put(arr[i],map.get(arr[i])+1);
                else map.put(arr[i],1);
            }
            int ans=0;
            int prev=-1;
            int cur=0;
            for(Map.Entry<Integer,Integer> i: map.entrySet()){
                if(i.getKey()!=prev+1){
                    ans+=i.getValue();
                    cur=i.getValue();
                }
                else{
                    if(i.getValue()<cur){
                        cur=i.getValue();
                    }
                    if(i.getValue()>cur){
                        ans+=(i.getValue()-cur);
                        cur=i.getValue();
                    }
                }
                prev=i.getKey();
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }

    static long gcd(long a, long b) {
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