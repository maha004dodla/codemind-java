import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,flag=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(n%2==0)
            {
                System.out.print(a[i]+" ");
            }
            if(n%2!=0)
            {
                System.out.print(a[i]+" ");
                flag=1;
            }
        }
        if(flag==1)
        {
            System.out.print("0");
        }
    }
}