import java.util.Scanner;

public class b970 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        String[] ans=new String[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            String str=m.next();
            int q=(int)Math.sqrt(n);
            if(q*q!=n)
            {
                ans[i]="NO";
            }
            else{
                boolean flag=true;
                for(int j=0;j<str.length();j++)
                {
                    int r=j/q;
                    int c=j%q;
                    if(r==q-1 || r==0 || c==0 || c==q-1)
                    {
                        if(str.charAt(j)-'1'!=0)
                        {
                            flag=false;
                            break;
                        }
                    }
                    else{
                        if(str.charAt(j)-'0'!=0)
                        {
                            flag=false;
                            break;
                        }
                    }
                }
                if(flag)
                {
                    ans[i]="YES";
                }
                else{
                    ans[i]="NO";
                }
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
