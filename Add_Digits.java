import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n,r,sum=0;
        n=x.nextInt();
        while(n!=0)
        {
            r=n%10;
            n=n/10;
            sum=sum+r;
            if(n==0 && sum>9)
            {
                n=sum;
                sum=0;
            }
        }
        System.out.println(sum);
    }
}