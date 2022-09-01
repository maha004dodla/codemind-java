import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        if(a%2==0 || b%2==0)
        {
            System.out.println("Player 1");
        }
        else
        {
            System.out.println("Player 2");
        }
        
    }
}