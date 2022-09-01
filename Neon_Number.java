import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int m=x.nextInt();
        int r,sum=0,pro=1;
        int s=m;
        int n=s*s;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==s)
        {
            System.out.println("Neon Number");
        }
        else
        {
            System.out.println("Not Neon Number");
        }
    }
}