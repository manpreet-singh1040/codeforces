public class c979 {
    public static void main(String[] args) {
        java.util.Scanner m=new java.util.Scanner(System.in);
        int t=m.nextInt();
        // int[] ans=new int[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            boolean ans=false;
            String s=m.next();
            if(s.charAt(0)=='1'){
                ans=true;
                i++;
                System.out.println("YES");
                continue;
            }
            for(int j=0;j<n-1;j++)
            {
                char x=s.charAt(j);
                char y=s.charAt(j+1);
                if(j%2==0)
                {
                    if(ans)
                    {
                        //System.out.println("YES");
                        break;
                    }
                    else{
                        if(y=='1')
                        {
                            ans=true;
                        }
                        else{
                            ans=false;
                        }
                    }
                }
                else{
                    
                    if(ans && y=='1')
                    {
                        ans=true;
                        break;
                    }
                    if(!ans && y=='0')
                    {
                        ans=false;
                    }
                    if(ans && y=='0')
                    {
                        ans=false;
                    }
                    if(!ans  && y=='1')
                    {
                        ans=false;
                    }
                }
            }
            if(ans) System.out.println("Yes");
            else System.out.println("No");
            //System.out.println(i);
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
}
