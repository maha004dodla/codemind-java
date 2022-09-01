import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        int k=x.nextInt();
        int arr[]=new int[n];
        int i,c=0;
        for(i=0; i<n; i++)
        {
            arr[i]=x.nextInt();
        }
        for(i=0; i<n; i++)
        {
            if(arr[i]%k==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
}