import java.util.*;
 public class q16{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            // int n=sc.nextInt();
            String str1=sc.next();
            String str2=sc.next();
            // System.out.println("the words are --> "+str1+" ---> "+str2);
            String ans="YES";
            ArrayList<Stack<Integer>> arr=new ArrayList<>();
            for(int i=0;i<26;i++){
                arr.add(new Stack<Integer>());
            }
            for(int i=0;i<str1.length();i++){
                arr.get(str1.charAt(i)-'A').add(i);
            }
            int cur=str1.length()+1;
            for(int i=str2.length()-1;i>=0;i--){
                int x=str2.charAt(i)-'A';
                if(arr.get(x).isEmpty()){
                    // System.out.println("exiting here -->"+i);
                    ans="NO";
                    break;
                }
                if(arr.get(x).peek()>cur){
                    // System.out.println("exiting here -->"+i);
                    ans="NO";
                    break;
                }
                cur=arr.get(x).pop();
            }
            System.out.println(ans);
            t--;
        }
        sc.close();
    }
    static int sol(int i,int j,int [] arr){
        int ans=0;
        int x=arr[j];
        int y=arr[i];
        while(y>=x && y!=0){
            y=(y>>1);
            ans++;
        }
        arr[j]=x;
        arr[i]=y;
        return ans;
    }
 }