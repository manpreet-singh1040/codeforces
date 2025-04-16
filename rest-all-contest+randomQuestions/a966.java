import java.util.*;
public class a966 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        String ans[]=new String[t];
        int i=0;
        while(i<t)
        {
            int temp=m.nextInt();
            if(temp<=101)
            {
                ans[i]="no";
            }
            else{
                ArrayList<Integer> digits=new ArrayList<>();
                while(temp>0)
                {
                    digits.add(temp%10);
                    temp=temp/10;
                }
                int n=digits.size();
                if(digits.get(n-1)==1 && digits.get(n-2)==0 && digits.get(n-3)!=0)
                {
                    if(digits.get(n-3)==1 && n==3)
                    {
                        ans[i]="no";
                    }
                    else{
                        ans[i]="yes";
                    }
                }
                else{
                    ans[i]="no";
                }
            }
            i++;
        }
        for(String q:ans)
        {
            System.out.println(q);
        }
        m.close();
    }
}
