import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int r,sum=0,pro=1;
        while(n>0)
        {
            r=n%10;
            sum=sum+r;
            pro=pro*r;
            n=n/10;
        }
        if(sum==pro)
        {
            System.out.println("Spy Number");
        }
        else
        {
            System.out.println("Not Spy Number");
        }
    }
}