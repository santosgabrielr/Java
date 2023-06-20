package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Maria", "maria@gmail.com");
		
		String s1 = "Test";
		String s2 = "Test";
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
		/* instanciar dois objetos diferentes altera sua referência como local da memória
		 * o que retorna um resultado Falso quando comparamos via "==" mesmo os objetos com
		 * valores iguais
		 */
		System.out.println(c1 == c2);
		/* quando instanciamos objetos com valores literais o compilador trata de forma diferente
		 * e retorna True se os valores dos objetos forem iguais
		 */
		System.out.println(s1 == s2);
	}
}
