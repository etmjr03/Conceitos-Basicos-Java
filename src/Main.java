import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		int num = 32;
		double num2 = 10.12345;
		String nome = "maria";
		int idade = 31;
		double salario = 4000.50;
		
		System.out.println(num);
		System.out.println(num2);
		System.out.printf("%.2f\n", num2);
		System.out.printf("%.4f\n", num2);
		
		// printf utiliza o formado o teclado utilizado no pc, no caso de
		// teclado com porotuguês br, o separador se dá por ",".
		// Locale.setDefault(Locale.US);
		System.out.printf("%.2f\n", num2);
		System.out.printf("O número é : %.2f\n", num2);
		System.out.printf("%s tem %d anos e recebe o valor de R$: %.1f\n", nome, idade, salario);
		
		// Primeiro exercício de fixação
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:\n%s, which price is $ %.2f.\n", product1, price1);
		System.out.printf("%s, which price is $ %.2f.\n\n", product2, price2);
		System.out.printf("Record: %d years old, code %s and gender: %c\n\n", age, code, gender);
		System.out.printf("Measure with eight decimal places: %.8f\nRouded (three decimal places): %.3f\n", measure, measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f", measure);
	}

}
