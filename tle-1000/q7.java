import java.util.*;

public class q7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int brr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++){
                brr[i]=sc.nextInt();
            }
            long ans=0;
            int temp1[]=new int[2*n];
            int temp2[]=new int[2*n];
            int cur=arr[0];
            int len=0;
            for(int i: arr){
                if(i==cur){
                    len++;
                }
                else{
                    temp1[cur-1]=Math.max(temp1[cur-1],len);
                    cur=i;
                    len=1;
                }
            }
            temp1[cur-1]=Math.max(temp1[cur-1],len);
            cur=brr[0];
            len=0;
            for(int i: brr){
                if(i==cur){
                    len++;
                }
                else{
                    temp2[cur-1]=Math.max(temp2[cur-1],len);
                    cur=i;
                    len=1;
                }
            }
            temp2[cur-1]=Math.max(temp2[cur-1],len);
            for(int i=0;i<n*2;i++){
                ans=Math.max(ans,(temp1[i]+temp2[i]));
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
}