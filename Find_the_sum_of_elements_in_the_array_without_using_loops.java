import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int i,sum=0,n;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            sum=sum+a[i];
        }
        System.out.println(sum);
        
    }
}