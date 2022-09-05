import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int s,flag=0;
        s=n*n;
        while(n>0)
        {
            if(n%10!=s%10)
            {
                System.out.println("Not an Automorphic Number");
                flag=1;
                break;
            }
            n=n/10;
            s=s/10;
        }
        if(flag==0)
        {
            System.out.println("Automorphic Number");
        }
    }
}