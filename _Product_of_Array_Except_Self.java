import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,j,pro=1;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            pro*=a[i];
        }
        for(i=0; i<n; i++)
        {
            System.out.print((pro/a[i])+" ");
        }
    }
}