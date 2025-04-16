import java.util.*;

public class q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long ans=-1;
            int arr[]=new int[n];
            TreeMap<Integer,Integer> map=new TreeMap<>();
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                map.put(arr[i],i+1);
            }
            ArrayList<Integer> brr=new ArrayList<>();
            for(Map.Entry<Integer,Integer> i: map.entrySet()){
                brr.add(i.getKey());
            }
            for(int i: brr){
                for(int j: brr){
                    int x=gcd(i,j);
                    if(x==1) ans=Math.max(ans,map.get(i)+map.get(j));
                }
            }
            System.out.println(ans);
            t--;
        }
    }
    static int gcd(int a,int b){
        if(a==0) return b;
        if(b==0) return a;
        else{
            if(a>b) return gcd(a%b,b);
            else return gcd(a,b%a);
        }
    }
}