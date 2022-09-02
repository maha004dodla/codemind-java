import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int i,n,sum=0;
        n=x.nextInt();
        for(i=1; i<n; i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        if(sum>12)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        
    }
}