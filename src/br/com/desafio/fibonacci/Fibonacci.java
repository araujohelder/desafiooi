package br.com.desafio.fibonacci;


/**
 * 
 * @author helder.araujo
 * @since 09.06.2018
 *
 */
public class Fibonacci {
	
	private static int f;
	private static int[] aux = new int[100000];
    
    public static long fibo(int n) 
    {      
        f = 1;
        return recursion(n);
    }
    
	private static long recursion(int n) 
	{
		if (n < 0) 
		{
			return aux[0];
		} 
		else 
		{
			if (f < 3) {
				aux[n] = f - 1;
				f++;
			} 
			else 
			{
				aux[n] = aux[n + 1] + aux[n + 2];
			}
			return recursion(n - 1);
		}
	}
    
    public static void main(String[] args) 
    {
    	int value = 8181; 
    	System.out.println("Valor f(8181) : ");
    	for (int i = 0; i <= value; i++) 
    	{
            System.out.print("(" + i + "): \n" + Fibonacci.fibo(i) + "\t");
        }
    }

}
