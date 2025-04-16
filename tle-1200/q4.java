import java.util.*;

public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            ArrayList<Integer> ans=new ArrayList<>();
            for(int i=0;i< (n*(n-1)/2);i++){
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            int x=0;
            int counter=n-1;
            while(x<arr.size()){
                ans.add(arr.get(x));
                x=x+counter;
                // if(x>=arr.size()) break;
                counter--;
            }
            ans.add(arr.get(arr.size()-1));
            // System.out.println("answer  >> ");
            for(int i: ans){
                System.out.print(i+" ");
            }
            System.out.println();
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