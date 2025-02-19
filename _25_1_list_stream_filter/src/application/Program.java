package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {
	public static void main(String[] args) {

		// List n�o aceita tipo primitivo
		// Tentando criar um alista de <int> d� erro, descomente a linha abaixo pra ver
		// List<int> nums = new ArrayList<>(); 
		// Devemos usar a wrapper correspondente, neste caso, a wrapper class Integer
		List<Integer> nums = new ArrayList<>(); // Neste exerc�cio usaremos uma lista de String, que n�o precisa de wrapper class
		// A lista de inteiros acima foi criada para ficar como lembran�a da necessidade das wrapper classes
		
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add("Adalberto");
		list.add(2, "Marco");

		System.out.println(list.size());
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		list.remove("Anna");
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		list.removeIf(x -> x.charAt(0) == 'M'); // predicado � uma fun��o lambda que retorna true ou false
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("---------------------");

		System.out.println("Index of Bob: " + list.indexOf("Bob")); // Podemos remover um elemento pelo �ndice
		System.out.println("Index of Marco: " + list.indexOf("Marco")); // Quando n�o encontra o elemento, retorna -1

		System.out.println("---------------------");

		// list.stream() converte a lista pro tipo stream que aceita opera��es com express�es lambda
		// filter() via retornar true quando encontar um elemento na condi��o especificada
		// collect(Collectors.toList() converter� o elemento do tipo stream para List
		// resumo: converte pra stream, faz a opera��o lambda e converte de volta pra list
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("---------------------");
		
		// Encontrando um elemento da lista que atenda a um predicado
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
	}
}
