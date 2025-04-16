import java.util.*;

public class q8{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t > 0 ){
            int n=sc.nextInt();
            long ans=0;
            String str=sc.next();
            int temp[][]=new int[n][26];
            int cur[]=new int[26];
            for(int i=0;i<n;i++){
                cur[str.charAt(i)-'a']++;
                copy(temp[i],cur);
            }
            for(int i=1;i<n;i++){
                int sum=0;
                for(int j: temp[i-1]){
                    if(j!=0) sum++;
                }
                for(int j=0;j<26;j++){
                    if(temp[n-1][j]-temp[i-1][j]>0) sum++;
                }
                ans=Math.max(ans,sum);
            }
            System.out.println(ans);
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