package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;
import service.CalculationService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();
		
		String path = "C:\\temp\\in.txt";
		
		// abrindo o arquivo pelo caminho designado
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			while (line != null) {
				// vetor que recebe as informações do arquivo CSV e separa por vírgula
				String[] fields = line.split(",");
				list.add(new Product(fields[0], Double.parseDouble(fields[1])));
				line = br.readLine();
			}
			
			Product x = CalculationService.max(list);
			System.out.print("Most expensive: ");
			System.out.println(x);
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}		
	}
}
