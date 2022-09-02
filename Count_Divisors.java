import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int l,r,k,i,c=0;
        l=x.nextInt();
        r=x.nextInt();
        k=x.nextInt();
        for(i=l; i<=r; i++)
        {
            if(i%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}