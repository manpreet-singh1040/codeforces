import java.util.*;

public class q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String ans="YES";
            String str=sc.next();
            int n=str.length();
            int temp[][]=new int[n][26];
            int size=0;
            for(char c='a';c<='z';c++){
                int cur=0;
                for(int i=0;i<n;i++){
                    if(str.charAt(i)==c) cur++;
                    temp[i][c-'a']=cur;
                }
                if(cur!=0) size++;
            }
            boolean flag=true;
            for(int i=size-1;i<n;i++){
                int min=Integer.MAX_VALUE;
                int max=Integer.MIN_VALUE;
                for(int j=0;j<26;j++){
                    if(i==size-1){
                        min=Math.min(min,temp[i][j]);
                        max=Math.max(max,temp[i][j]);
                    }
                    else{
                        min=Math.min(min,temp[i][j]-temp[i-size][j]);
                        max=Math.max(max,temp[i][j]-temp[i-size][j]);
                    }
                }
                if(max-min>1){
                    ans="NO";
                    break;
                }
            }
            System.out.println(ans);
            t--;
        }
    }
}