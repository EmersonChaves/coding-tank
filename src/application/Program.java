package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		System.out.print("Digite a quantidade de temperaturas a serem transformadas: ");
		int quantidade = sc.nextInt();
		System.out.println("Escolha duas unidades de temperatura a serem transformadas. Unidade de origem e unidade a ser transformada: ");
		String unidOrigem = sc.next();
		String unidTransf = sc.next();
		System.out.println("Entre com o valor da temperatura de origem: ");
		Integer tempOrigem = sc.nextInt();
		
		
		if(unidOrigem == "celsius" || unidTransf == "fahrenheit" ) {
			double celsiusParaFahrenheit = CelsiusParaFahrenheit(tempOrigem);
			System.out.println(celsiusParaFahrenheit);
		} else if(unidOrigem == "celsius" || unidTransf == "kelvin" ) {
			double celsiusParakelvin = CelsiusParaKelvin(tempOrigem);
			System.out.println(celsiusParakelvin);
		}else if(unidOrigem == "fahrenheit" || unidTransf == "celsius" ) {
			double fahrenheitParaCelsius = FahrenheitParaCelsius(tempOrigem);
			System.out.println(fahrenheitParaCelsius);
		}else if(unidOrigem == "fahrenheit" || unidTransf == "kelvin" ) {
			double fahrenheitParakelvin = FahrenheitParaKelvin(tempOrigem);
			System.out.println(fahrenheitParakelvin);
		} else if(unidOrigem == "kelvin" || unidTransf == "celsius" ) {
			double kelvinParaCelsius = KelvinParaCelsius(tempOrigem);
			System.out.println(kelvinParaCelsius);
		}else if(unidOrigem == "kelvin" || unidTransf == "fahrenheit" ) {
			double kelvinParaFahrenheit = KelvinParaFahrenheit(tempOrigem);
	     	System.out.println(kelvinParaFahrenheit);
		}else if(unidOrigem == "celsius" || unidTransf == "fahrenheit" ) {
			double celsiusParaFahrenheit = CelsiusParaFahrenheit(tempOrigem);
			System.out.println(celsiusParaFahrenheit);
		}else if(unidOrigem == "celsius" || unidTransf == "kelvin" ) {
			double celsiusParakelvin = CelsiusParaKelvin(tempOrigem);
			System.out.println(celsiusParakelvin);
		}else if(unidOrigem == "fahrenheit" || unidTransf == "celsius" ) {
			double fahrenheitParaCelsius = FahrenheitParaCelsius(tempOrigem);
			System.out.println(fahrenheitParaCelsius);
		}else if(unidOrigem == "fahrenheit" || unidTransf == "kelvin" ) {
			double fahrenheitParakelvin = FahrenheitParaKelvin(tempOrigem);
			System.out.println(fahrenheitParakelvin);
		}else if(unidOrigem == "kelvin" || unidTransf == "celsius" ) {
			double kelvinParaCelsius = KelvinParaCelsius(tempOrigem);
			System.out.println(kelvinParaCelsius);
		}else if(unidOrigem == "kelvin" || unidTransf == "fahrenheit" ) {
			double kelvinParaFahrenheit = KelvinParaFahrenheit(tempOrigem);
	     	System.out.println(kelvinParaFahrenheit);
		}
	
		
		System.out.println("A unidade de origem é: " + unidOrigem);
		System.out.println("A unidade transformada é : " + unidTransf);
		
		
		
		
	
	
	
	
		
		
		
		
		
	
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
	
	
	
	
}
