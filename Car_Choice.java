import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int n,i;
        n=x.nextInt();
        while(n-->0)
        {
            double a,b,c,d,p,q;
            a=x.nextDouble();
            b=x.nextDouble();
            c=x.nextDouble();
            d=x.nextDouble();
            p=c/a;
            q=d/b;
            if(p<q)
            {
                System.out.println("-1");
            }
            else
            {
                if(p>q)
                {
                    System.out.println("1");
                }
                else
                {
                    System.out.println("0");
                }
            }
        }
    }
}

