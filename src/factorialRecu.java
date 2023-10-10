import java.util.Scanner;

public class factorialRecu{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese un número para calcular su factorial: ");
		double num = sc.nextDouble();

		new factorialRecu(num);

		sc.close();
	}

    public factorialRecu(double num){
		double numero = num;

		if(numero>=0){
		// De Forma Recursiva
		System.out.println(
			"El factorial de "+numero+
			" es: "+getFactorialRecursivo(numero)+" De Forma Recursiva");

		// Utilizando un Ciclo
		System.out.println(
			"El factorial de "+numero+
			" es: "+getFactorialConCiclo(numero)+" Utilizando un Ciclo");
		}else{
			System.out.println("\'ERROR\' no existen factoriales negativas");
		}
	}

	// Método recursivo
	public double getFactorialRecursivo(double n){
		if(n==0){
			return 1;
		} else {
			return n*getFactorialRecursivo(n-1);
		}
	}

	// Método ciclo
	public double getFactorialConCiclo(double n){
		double acumulado = 1;
		for(double i=n; i>=1; i--){
			acumulado *= i;
		}
		return acumulado;
	}
}