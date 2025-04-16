public class b979 {
    public static void main(String[] args) {
        java.util.Scanner m=new java.util.Scanner(System.in);
        int t=m.nextInt();
        // int[] ans=new int[t];
        int i=0;
        while(i<t)
        {
            int n=m.nextInt();
            StringBuilder str=new StringBuilder();
            str.append("0");
            if(n==1)
            {
                System.out.println(str.toString());
                i++;
                continue;
            }
            if(n==2)
            {
                System.out.println("01");
                i++;
                continue;
            }
            str.append("1");
            int j=2;
            while(j<n)
            {
                str.append("0");
                j++;
            }
            System.out.println(str.toString());
            i++;
        }
        // for(int j:ans)
        // {
        //     System.out.println(j);
        // }
        m.close();
    }
}
