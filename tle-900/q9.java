import java.util.*;
 public class q9{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            Integer arr[]=new Integer[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                arr[i]=Math.abs(arr[i]-i-1);
            }
            Arrays.sort(arr,Collections.reverseOrder());
            // int ans=1;
            int cur=findHCF(arr[0], arr[1]);
            for(int i=2;i<n;i++){
                if(arr[i]!=0){
                    cur=findHCF(cur, arr[i]);
                }
                else{
                    break;
                }
            }
            System.out.println(cur);
            
           
            t--;
        }
        sc.close();
    }
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
 }