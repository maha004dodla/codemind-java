import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        float f=x.nextInt();
        float c=(f-32)*5/9;
        System.out.format("%.2f",c);
    }
}