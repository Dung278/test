
import java.util.*;
public class abc {
	public static int sum(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a,b;
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap a :");
		a = kb.nextInt();
		System.out.print("\nNhap b :");
		b=kb.nextInt();
		System.out.print("\nSum of " + a +" + "+ b +" = " + sum(a,b));
		System.out.print("\nHello world");
	}
}
