package BasicJava;

import java.util.Scanner;

public class loopingstatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Question1
		for(int i= 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//question2
		int sum = 0;
		System.out.println("Enter the value of n: ");
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("Sum of n numbers is "+sum);
		
		
		//Question3
		System.out.println("Enter the value of num to check the m-table: ");
		int num = sc.nextInt();
		int product1 = 1;
		for(int i=1; i<=n; i++) {
			product1 = num *i;
			System.out.printf("%d*%d=%d",i,num,product1);
			System.out.println();
		}
		
		//Question4
		System.out.println("Enter the value of num to check the m-table: ");
		int m = sc.nextInt();
		int product2 = 1;
		for(int i=m; i>=1; i--) {
			product2 = m *i;
			System.out.printf("%d*%d=%d",i,m,product2);
			System.out.println();
		}
		
		//Question4
		System.out.println("Enter the number till which the table should go: ");
		int d = sc.nextInt();
		int prod = 1;
		for(int i=d; i>=1; i--) {
			prod = 10 * i;
			System.out.printf("%d*10=%d",i,prod);
			System.out.println();
		}
		
		//Question5
		System.out.println("Enter a number to check factorial: ");
		int w = sc.nextInt();
		int factf = 1;
		for(int i=1; i<=w; i++) {
			factf = factf * i;
		}
		System.out.printf("Factorial of %d is %d",w,factf);
		System.out.println();
		
		//Question6
		System.out.println("Enter a number to check factorial: ");
		int x = sc.nextInt();
		int factw = 1;
		for(int i=1; i<=x; i++) {
			factw = factw * i;
		}
		System.out.printf("Factorial of %d is %d",x,factw);
		System.out.println();
		
		//Question9
		System.out.println("Enter a number to check m_table: ");
		int y = sc.nextInt();
		int sum8 = 0;
		int prod8 = 1;
		for(int i=1; i<=y; i++) {
			prod8 = 8 * i;
			sum8 += prod8;
		}
		System.out.println("Sum is: "+sum8);

	}

}

