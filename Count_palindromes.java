import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,i,m,r,sum=0,c=0;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            m=a[i];
            sum=0;
            while(m!=0)
            {
                r=m%10;
                m=m/10;
                sum=(sum*10)+r;
            }
            if(sum==a[i])
            {
                c++;
            }
        }
        System.out.println(c);
    }
}