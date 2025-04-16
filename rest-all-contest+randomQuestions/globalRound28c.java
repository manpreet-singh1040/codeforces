import java.util.Scanner;

public class globalRound28c {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String str=sc.next();
            int n=str.length();
            int x=-1;
            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)=='0')
                {
                    x=i;
                    break;
                }
            }
            if(x==-1)
            {
                System.out.println("1 "+n+" 1 1");
            }
            else{
                int i=x;
                int j=x-1;
                while(i<n && j>=0 && str.charAt(i)=='0')
                {
                    i++;
                    j--;
                }
                j++;
                System.out.println("1 "+n+" "+(j+1)+" "+(j+n-x));
            }
            
            t--;
        }
        sc.close();
    }
}
