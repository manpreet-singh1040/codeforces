import java.util.*;

public class q9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            long n=sc.nextLong();
            long ans[]=new long[2];
            if(n%2==0){
                ans[0]=n/2;
                ans[1]=n/2;
            }
            else{
                ArrayList<Integer> arr=new ArrayList<>();
                for(int i=3;i<=(int)Math.sqrt(n) && n>0;i+=2){
                    if(n%i==0){
                        arr.add(i);
                        n=n/i;
                        i-=2;
                    }
                }
                if(n>0){
                    arr.add((int)n);
                }
                // ans=arr.get(arr.size()-1)-1;
                long temp=1;
                for(int i=1;i<arr.size();i++){
                    temp=(temp*arr.get(i));
                }
                ans[0]=temp;
                ans[1]=temp*(arr.get(0)-1);
            }
            // Arrays.sort(ans);
            System.out.println(ans[0]+" "+ans[1]);
            t--;
        }
        sc.close();
    }
    static void copy(int arr1[],int arr2[]){
        for(int i=0;i<26;i++){
            arr1[i]=arr2[i];
        }
    }
}