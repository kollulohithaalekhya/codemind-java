import java.util.Scanner;
public class Demo
{
    public static void main(String[] args)
    {
        int a;
        Scanner read= new Scanner(System.in);
        a=read.nextInt();
        int c=(a*(a+1))/2;
        System.out.println(c);
    }
}