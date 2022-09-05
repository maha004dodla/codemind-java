import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int tab,i;
        for(i=1; i<=b; i++)
        {
            if(i%2!=0)
            {
                tab=a*i;
                System.out.printf("%d x %d = %d
",a,i,tab);
            }
        }
        
    }
}