import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(int i=n-1; i>=n/2; i--)
        {
            System.out.print(a[i]+" ");
        }
        for(int i=0; i<n/2; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}