import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j;
        n=sc.nextInt();
        for(i=0; i<n; i++)
        {
            for(j=n-i; j>0; j--)
            {
                System.out.print(((char)(65+n-i-1))+" ");
            }
            System.out.format("
");
        }
    }
}