import java.util.*;

public class qc {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            int ans=n;
            int x=n;
            boolean flag=false;
            int fid=-1;
            int fn=0;
            int max=1000;
            while(x>0){
                int temp=x%10;
                arr.add(x%10);
                x=x/10;
                if(temp==7){
                    flag=true;
                    break;
                }
                if(temp!=0 && fid!=-1){
                    fid=arr.size()-1;
                    fn=temp;
                }
                if(arr.size()>1){
                    int y;
                    if(temp<=7){
                        y=7-temp;
                    }
                    else{
                        y= (temp==8) ? 8:7;
                    }
                    if(y>arr.get(0)) y++;
                    max=Math.min(max,y);
                }
            }
            if(!flag){
                if(arr.get(0)==0 && fn==8){
                    ans=1;
                }
                else{
                    ans=Math.min(ans,max);
                    if(arr.get(0)>=7){
                        ans=Math.min(ans,arr.get(0)-7);

                    }
                    else{
                        ans=Math.min(ans,arr.get(0)+3);
                    }
                    if(arr.get(1)==8){
                        ans=Math.min(ans,1+arr.get(0));
                    }
                    
                }
                // ans--;
            }
            else ans=0;
            if(ans>7) ans=7;
            System.out.println(ans);
            t--;
        }
    }
    static long check(int arr[],int k){
        long ans=0;
        long max=Long.MIN_VALUE;
        long min=Long.MAX_VALUE;
        long cur=0;
        for(int i=0;i<arr.length;i++){
            cur+=arr[i];
            if((i+1)%k==0){
                max=Math.max(max,cur);
                min=Math.min(min,cur);
                cur=0;
            }
        }
        ans=max-min;
        return ans;
    }
}