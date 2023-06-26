import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int result = 0;
	    Scanner in = new Scanner(System.in);
        System.out.print("Если хотите сложить числа, введите 1; вычесть - 2; умножить - 3; разделить - 4: ");
        int n = in.nextInt();
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();
	    if (n==1) {
	        result = a+b;
	    }
	    if (n==2) {
	        result = a-b;
	    }
	    if (n==3) {
	        result = a*b;
	    }
	    if (n==4) {
	        result = a/b;
	    }
	    System.out.println(result);
	    in.close();
	}
}