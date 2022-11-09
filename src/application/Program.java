package application;


import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		

			
	System.out.print("Digite a quantidade de temperaturas a serem transformadas: ");
	int quantidade = sc.nextInt();
	
	
	for(int i =0; i < quantidade ; i++) {
		
	System.out.println("Escolha duas unidades de temperatura a serem transformadas. Unidade de origem e unidade a ser transformada: ");
	String unidOrigem = sc.next();
	String unidTransf = sc.next();
	System.out.println("Entre com o valor da temperatura de origem: ");
	Integer tempOrigem = sc.nextInt();
	
	
	
	double conversao = conversao(unidOrigem, unidTransf, tempOrigem);
	double media = tempOrigem + conversao / 2; 
	
	try{
	System.out.println("A unidade de origem é: " + unidOrigem);
	System.out.println("A unidade transformada é : " + unidTransf);
	System.out.println("A temperatura transformada é:  " + conversao);
	System.out.println("A media das temperaturas é : media");
				
			
		} catch(NullPointerException e) {
		System.out.println("Error: " + e.getMessage());			
	
		}

	}		
	
    sc.close();
		
		
		
	
	}


	
	public static  double CelsiusParaFahrenheit(double celsius) {
	double fahrenheit = (celsius * 1.8) + 32;
	return fahrenheit;
	}
	
	public static  double CelsiusParaKelvin(double celsius) {
	double kelvin = celsius + 273;
	return kelvin;
	}
	
	public static  double FahrenheitParaCelsius(double fahrenheit) {
	double celsius = (fahrenheit -32) / 1.8;
	return celsius;
	}
	
	public static  double FahrenheitParaKelvin(double fahrenheit) {
	double kelvin = (fahrenheit-32)* 5/9 + 273.15;
	return kelvin;
	}

	public static  double KelvinParaCelsius(double kelvin) {
	double celsius = kelvin -273;
	return celsius;
	}
	
	public static  double KelvinParaFahrenheit(double kelvin) {
	double fahrenheit = (kelvin - 273.15) * 9/5 + 32;
	return fahrenheit;
	}
	
	
	

	public static  double conversao(String unidOrigem, String unidTransf , double tempOrigem  ) {
		
		double retorno = 0;
		if(unidOrigem == "celsius" || unidTransf == "fahrenheit" ) {
			double retorno1 = CelsiusParaFahrenheit(tempOrigem);
			retorno = retorno1;
		} 
		if(unidOrigem == "celsius" || unidTransf == "kelvin" ) {
			double retorno1 = CelsiusParaKelvin(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "fahrenheit" || unidTransf == "celsius" ) {
			double retorno1 = FahrenheitParaCelsius(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "fahrenheit" || unidTransf == "kelvin" ) {
			double retorno1 = FahrenheitParaKelvin(tempOrigem);
			retorno = retorno1;
		} 
		if(unidOrigem == "kelvin" || unidTransf == "celsius" ) {
			double retorno1 = KelvinParaCelsius(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "kelvin" || unidTransf == "fahrenheit" ) {
			double retorno1 = KelvinParaFahrenheit(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "celsius" || unidTransf == "fahrenheit" ) {
			double retorno1 = CelsiusParaFahrenheit(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "celsius" || unidTransf == "kelvin" ) {
			double retorno1 = CelsiusParaKelvin(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "fahrenheit" || unidTransf == "celsius" ) {
			double retorno1 = FahrenheitParaCelsius(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "fahrenheit" || unidTransf == "kelvin" ) {
			double retorno1 = FahrenheitParaKelvin(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "kelvin" || unidTransf == "celsius" ) {
			double retorno1 = KelvinParaCelsius(tempOrigem);
			retorno = retorno1;
		}
		if(unidOrigem == "kelvin" || unidTransf == "fahrenheit" ) {
			double retorno1 = KelvinParaFahrenheit(tempOrigem);
			retorno = retorno1;
	}
		
		
		return retorno;
	 
		
	}
}
	
	

