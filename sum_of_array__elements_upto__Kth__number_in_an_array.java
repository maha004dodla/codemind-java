import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=x.nextInt();
        }
        int i,sum=0;
        int k=x.nextInt();
        for(i=0; i<k; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}