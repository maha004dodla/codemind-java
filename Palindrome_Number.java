import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,i,a;
        n=x.nextInt();
        for(i=0; i<n; i++)
        {
            a=x.nextInt();
            int sum=0,r,m;
            m=a;
            while(m!=0)
            {
                r=m%10;
                m=m/10;
                sum=sum*10+r;
            }
            if(sum==a)
            {
                System.out.println("True");
            }
            else
            {
                System.out.println("False");
            }
        }
    }
}