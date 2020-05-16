package aplication7;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Pedro");
		list.add("João");
		list.add("Ana");
		list.add(2, "Marco");

		System.out.println(list.size());

		System.out.println();

		for (String j : list) {
			System.out.println(j);
		}

		System.out.println("----------------------");

		list.removeIf(j -> j.charAt(0) == 'M');
		for (String j : list) {
			System.out.println(j);
		}

		System.out.println("----------------------");
		System.out.println("Index of Bob: " + list.indexOf("João"));

		System.out.println("----------------------");
		List<String> result = list.stream().filter(j -> j.charAt(0) == 'A').collect(Collectors.toList());
		for (String j : result) {
			System.out.println(j);
		}
		
		System.out.println("----------------------");
		String name = list.stream().filter(j -> j.charAt(0) == 'R').findFirst().orElse(null);
		System.out.println(name);

	}

}
