import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long ans=0;
            ArrayList<int []> arr1=new ArrayList<>();
            ArrayList<int []> arr2=new ArrayList<>();
            ArrayList<int []> arr3=new ArrayList<>();
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                arr1.add(new int[]{x,i});
            }
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                arr2.add(new int[]{x,i});
            }
            for(int i=0;i<n;i++){
                int x=sc.nextInt();
                arr3.add(new int[]{x,i});
            }
            Comparator< int []> comp=(a,b)->{
                if(a[0]==b[0]){
                    if(a[1]>=b[1]) return 1;
                    else return -1;
                }
                if(a[0]>=b[0]) return -1;
                else return 1;
            };
            Collections.sort(arr1,comp);
            Collections.sort(arr2,comp);
            Collections.sort(arr3,comp);
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int k=0;k<3;k++){

                        if(arr1.get(i)[1]!= arr2.get(j)[1] && arr2.get(j)[1] != arr3.get(k)[1] && arr1.get(i)[1]!=arr3.get(k)[1]){
                            long temp=arr1.get(i)[0];
                            temp+=arr2.get(j)[0];
                            temp+=arr3.get(k)[0];
                            ans=Math.max(ans,temp);
                        }

                    }
                }
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