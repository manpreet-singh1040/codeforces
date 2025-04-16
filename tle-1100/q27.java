import java.util.*;

public class q27 {
    public static void main(String[] args) {
        StringBuilder finalAns=new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String ans="NO";
            int k=sc.nextInt();
            int arr[]=new int[n];
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                if( map.containsKey(arr[i]) ) map.put(arr[i], map.get(arr[i])+1 );
                else map.put(arr[i],1);
            }
            // Arrays.sort(arr);
            for(int i:arr){
                if(map.containsKey(i+k)){
                    if((k==0 && map.get(i)>1) || k!=0){
                        ans="YES";
                        break;
                    }
                }
            }
            finalAns.append(ans);
            finalAns.append("\n");
            t--;
        }
        sc.close();;
        System.out.println(finalAns);
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