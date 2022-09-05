import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int i,flag=0;
        for(i=2; i*i<=n; i++)
        {
            if(n%i==0)
            {
                System.out.println("not a prime");
                flag=1;
                break;
            }
        }
        if(flag==0)
        {
            System.out.println("prime");
        }
        
    }
}