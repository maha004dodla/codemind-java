import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        if(n==0)
        {
            System.out.println("Zero");
        }
        else if(n<0)
        {
            System.out.println("Negative Number");
        }
        else if(n>0)
        {
            System.out.println("Positive Number");
        }
        
    }
}