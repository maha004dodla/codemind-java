import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int n,m,i,b,flag=0;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        b=x.nextInt();
        for(i=0; i<n; i++)
        {
            if(a[i]==b)
            {
                flag=1;
                System.out.println(i);
            }
        }
        if(flag==0)
        {
            System.out.println("-1");
        }
    }
}
