import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,j,c=0;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=n-1; i>0; i--)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
                c++;
                break;
            }
        }
        if(c==0)
        {
            System.out.println("10");
        }
    }
}