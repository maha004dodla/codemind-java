import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int a[]=new int[n];
        int i,min;
        for(i=0; i<n; i++)
        {
            a[i]=x.nextInt();
        }
        min=a[0];
        for(i=0; i<n; i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println(min);
        
    }
}