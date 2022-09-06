import java.util.*;
class main
{
    public static void main(String args[]) 
    {
        Scanner x=new Scanner(System.in);
        int n,i;
        n=x.nextInt();
        int a[]=new int[n];
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        Arrays.sort(a);
        for(i=0; i<n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}

