import java.util.*;
 public class q29{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
           int n=sc.nextInt();
           int arr[]=new int[n];
           for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
           }
           boolean flag=true;
           Stack<Integer> stack=new Stack<>();
           for(int i=0;i<n;i++){
            if(stack.isEmpty()) stack.add(i);
            else{
                if(arr[stack.peek()]>arr[i] && stack.size()>=2){
                    System.out.println("YES");
                    int temp=stack.pop()+1;
                    System.out.println((stack.peek()+1)+" "+temp+" "+(i+1 ));
                    flag=false;
                    break;
                }
                else{
                    while( !stack.isEmpty() && arr[stack.peek()]>arr[i]){
                        stack.pop();
                    }
                    stack.add(i);
                }
            }
           }
           
           if(flag) System.out.println("NO");
           
            t--;
        }
        sc.close();
    }
}
