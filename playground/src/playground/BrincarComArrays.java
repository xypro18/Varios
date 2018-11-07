package playground;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntUnaryOperator;

public class BrincarComArrays {

	public static int[] gerarInteiros(int tamanho) {
		int[] numeros = new int[tamanho];
		
		Arrays.setAll(numeros, i -> new Random().nextInt(100));
		
//		for (int i = 0; i < tamanho; i++) {
//			numeros[i] = new Random().nextInt(100);
//		}
		return numeros;
	}

	public static int maior(int[] valores) {
		int maior = valores[0];
		for (int x:valores) {
			if (x > maior) {
				maior = x;
			}
		}
		return maior;
	}
	
	private static void imprimeInteiros(int[] valores) {
		for (int i:valores) {
			System.out.print(i+",");
		}
	}
	
	public static int somaDigitosRec2(int numero) {
		return numero < 10 ? numero : numero % 10 + somaDigitosRecursivo(numero/10);
	}
	
	public static int somaDigitosRecursivo(int numero) {
		if (numero<10) {
			return numero;
		}
		return numero % 10 + somaDigitosRecursivo(numero/10);
	}
	
	public static int somaDigitos(int numero) {
		int soma = 0;
		while (numero>0) {
			int resto = numero % 10;
			numero /= 10;
			soma += resto;
		}
		return soma;
	}
	
	public static int somaDigitosVersaoComString(int numero) {
		int soma = 0;
		String s = String.valueOf(numero);
		 for (int i = 0; i< s.length(); i++) {
			 soma += Character.getNumericValue(s.charAt(i));
		 }
		return soma;
	}

	public static void main(String ...args) {
//		int[] inteiroGerados = gerarInteiros(10);
//		imprimeInteiros(inteiroGerados);
//		System.out.print("\n\nO maior inteiro é: " + maior(inteiroGerados));
//		System.out.print(somaDigitosVersaoComString(2376));
//		System.out.print(somaDigitos(2376));
//		System.out.print(somaDigitosRecursivo(2376));
		System.out.print(somaDigitosRec2(110));
		
		
	}



}
