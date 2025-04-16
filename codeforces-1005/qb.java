import java.util.*;

public class qb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
           int n=sc.nextInt();
           int arr[]=new int[n];
           int temp[]=new int[n+1];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            temp[arr[i]]++;
           }
           int l=-1;
           int r=-1;
           int ans[]=new int[2];
           ans[0]=-1;
           ans[1]=-1;
           for(int i=0;i<n;i++){
            if(temp[arr[i]]==1){
                if(l==-1){
                    l=i;
                }
                r=i;
            }
            else{
                if(ans[1]-ans[0]<=r-l && l!=-1){
                    ans[0]=l;
                    ans[1]=r;
                }
                l=-1;
                r=-1;
            }
            // System.out.println(l+" "+r);
            // System.out.println(ans[0]+" "+ans[1]);
           }
           if(ans[1]-ans[0]<=r-l && l!=-1){
            ans[0]=l;
            ans[1]=r;
           }
           if(ans[0]==-1 || ans[1]==-1){
            System.out.println(0);
           }
           else{
            System.out.println((ans[0]+1)+" "+(ans[1]+1));
           }
            t--;
        }
        sc.close();
    }
    
}