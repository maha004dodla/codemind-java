import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=x.nextInt();
        }
        int i,flag=0;
        int a=x.nextInt();
        int b=x.nextInt();
        for(i=0; i<n; i++)
        {
            if(arr[i]>=a && arr[i]<=b)
            {
                System.out.print(arr[i]+" ");
                flag=1;
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
    }
}