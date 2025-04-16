import java.util.Scanner;

public class a968 {
    public static void main(String[] args) {
        Scanner m=new Scanner(System.in);
        int t=m.nextInt();
        String ans[]=new String[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            String str=m.next();
            if(str.charAt(0)==str.charAt(n-1))
            {
                ans[i]="NO";
            }
            else{
                ans[i]="YES";
            }
            i++;
        }
        for(int j=0;j<t;j++)
        {
            System.out.println(ans[j]);
        }
        m.close();
    }
}
