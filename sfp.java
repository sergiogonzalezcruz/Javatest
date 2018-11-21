package comienzo;
import java.util.Scanner;

class sfp 
{
	public static void main(String[] args) 
	{
			// TODO Auto-generated method stub
			int n, result = 0;
			Scanner a = new Scanner(System.in);
			System.out.print("Ingrese número: ");
			n = a.nextInt();
			result = fp(n);
			System.out.printf("El resultado final es %d", result);
	}	
		
	private static int fp(int x)
	{
		int i, sum = 0;
		for(i = 1; i <= x; i ++)
		{
			if (x % i == 0)
			{
				System.out.printf("%d \n", i);
				sum = i + sum;
			}
		}
		return sum;
	}
}