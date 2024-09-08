import java.util.Scanner;
class Fib
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number of terms:");
        int n=s.nextInt();
        int a=0;
        int b=1;
        int c;
        System.out.print(a+" ");
        System.out.print(b+" " );
        for(int i=2;i<n;i++)
        {
            c=a+b;
            System.out.print(c+" " );
            a=b;
            b=c;
        }
    }
}
