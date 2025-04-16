import java.util.*;

public class q17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k=sc.nextInt();
            int arr[][]=new int[n][n];
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j]=sc.nextInt();
                }
            }
            String ans="YES";
            boolean flag=true;
            for(int i=0;i<n && flag;i++){
                for(int j=0;j<n/2 && flag;j++){
                    if(arr[i][j]!=arr[n-1-i][n-1-j]){
                        if(k>0) k--;
                        else{
                            ans="NO";
                            flag=false;
                            break;
                        }
                    }
                }
            }
            if(flag){
                if(n%2==1){
                    for(int i=0;i<n/2;i++){
                        if(arr[i][n/2]!=arr[n-1-i][n/2]){
                            if(k>0) k--;
                            else{
                              ans="NO";
                              flag=false;
                              break;
                           }
                        }
                    }
                }
                if(n%2==0 && k%2==1) ans="NO";
            }
            System.out.println(ans);
            t--;
        }
    }
}