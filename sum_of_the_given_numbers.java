import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=0; i<n; i++)
        {
            int a=x.nextInt();
            int b=x.nextInt();
            int c=a+b;
            System.out.println(c);
        }
    }
}