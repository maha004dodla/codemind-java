import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int arr[]=new int[n];
        int i,sum=0;
        for(i=0; i<n; i++)
        {
            arr[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            sum=sum+arr[i];
        }
        float avg=(float)sum/n;
        System.out.format("%.2f",avg);
    }
}