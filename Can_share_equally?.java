import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        if(a==0 && b%2==0)
        {
            System.out.println("YES");
        }
        else if(a==0 && b%2!=0)
        {
            System.out.println("NO");
        }
        else if((a+(2*b))%2==0)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}