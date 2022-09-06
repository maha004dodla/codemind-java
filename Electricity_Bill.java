//electricity bill
import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        String a=x.nextLine();
        String b=x.nextLine();
        int c=x.nextInt();
        double charge,amount,m=0,n;
        if(c<=199)
        {
            amount=c*1.20;
        }
        else if(c>200 && c<=400)
        {
            amount=c*1.50;
        }
        else if(c>400 && c<=600)
        {
            amount=c*1.80;
        }
        else
        {
            amount=c*2.00;
        }
        if(amount>400)
        {
            m=(amount*0.15)+amount;
        }
        else
        {
            m=amount+100;
        }
        System.out.format("%.2f",m);
    }
}