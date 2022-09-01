import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int arr[]=new int[n];
        int i,sum=0,c=0;
        for(i=0; i<n; i++)
        {
            arr[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            sum=sum+arr[i];
        }
        int avg=sum/n;
        for(i=0; i<n; i++)
        {
            if(arr[i]>=avg)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}