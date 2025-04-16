import java.util.Scanner;
public class a970 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        String[] ans=new String[t];
        int i=0;
        while(i<t)
        {
            int a=m.nextInt();
            int b=m.nextInt();
            if(b%2==0 && a%2==0)
            {
                ans[i]="YES";
            }
            else if(b%2==0 && a%2!=0)
            {
                ans[i]="NO";
            }
            else if(b%2!=0 && a%2==0)
            {
                if(a!=0)
                {
                    ans[i]="YES";
                }
                else{
                    ans[i]="NO";
                }
            }
            else
            {
                ans[i]="NO";
            }
            i++;
        }
        for(String j:ans)
        {
            System.out.println(j);
        }
        m.close();
    }
}