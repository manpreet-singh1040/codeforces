import java.util.*;

public class q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            String ans="NO";
            boolean flag=true;
            int i=0;
            int j=n-1;
            while(i<=j){
                if(arr[i]!=arr[j]){
                    flag=false;
                    break;
                }
                i++;
                j--;
            }
            if(flag){
                ans="YES";
            }
            else{
                int x=arr[i];
                int y=arr[j];
                ArrayList<Integer> temp1=new ArrayList<>();
                ArrayList<Integer> temp2=new ArrayList<>();
                for(int ii:arr){
                    if(ii!=x) temp1.add(ii);
                }
                for(int ii:arr){
                    if(ii!=y) temp2.add(ii);
                }
                if( checkPalindrome(temp2) || checkPalindrome(temp1) || temp1.size()==0 || temp2.size()==0){
                    ans="YES";
                }

            }
            System.out.println(ans);
            t--;
        }
    }
    static boolean checkPalindrome(ArrayList<Integer> arr){
        int i=0;
        int j=arr.size()-1;
        while(i<=j){
            if(arr.get(i)!=arr.get(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}