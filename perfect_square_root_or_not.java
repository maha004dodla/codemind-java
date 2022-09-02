import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int i,n,flag=0;
        n=x.nextInt();
        for(i=1; i*i<=n; i++)
        {
            if(i*i==n)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        
        
    }
}