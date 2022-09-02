import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int a,b,i,j,s1=0,s2=0,m,n;
        a=x.nextInt();
        b=x.nextInt();
        m=a;
        n=b;
        for(i=1; i<m; i++)
        {
            if(m%i==0)
            {
                s1=s1+i;
            }
        }
        for(j=1; j<n; j++)
        {
            if(n%j==0)
            {
                s2=s2+j;
            }
        }
        if(s1==b && s2==a)
        {
            System.out.println("Amicable");
        }
        else
        {
            System.out.println("Not Amicable");
        }
        
    }
}