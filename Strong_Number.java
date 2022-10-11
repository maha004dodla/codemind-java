import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int r,sum=0,fact=1,m=n;
        while(m!=0)
        {
            r=m%10;
            m=m/10;
            fact=1;
            for(int i=1; i<=r; i++)
            {
                fact*=i;
            }
            sum=sum+fact;
        }
        if(sum==n)
        {
            System.out.printf("The number %d is a strong number",n);
        }
        else
        {
            System.out.printf("The number %d is not a strong number",n);
        }
    }
}