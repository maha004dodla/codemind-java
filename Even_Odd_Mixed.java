import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int m,r,e=0,o=0;
        m=n;
        while(m!=0)
        {
            r=m%10;
            if(r%2==0)
            {
                e++;
            }
            else
            {
                o++;
            }
            m=m/10;
        }
        if(e==0)
        {
            System.out.println("Odd");
        }
        else if(o==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Mixed");
        }
    }
}