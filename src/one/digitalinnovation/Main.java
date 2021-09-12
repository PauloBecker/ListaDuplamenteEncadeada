package one.digitalinnovation;

public class Main {

	public static void main(String[] args) {

		ListaDuplamenteEncadeada<String> minhaListEncadeada = new ListaDuplamenteEncadeada<String>();
		
		minhaListEncadeada.add("c1");
		minhaListEncadeada.add("c2");
		minhaListEncadeada.add("c3");
		minhaListEncadeada.add("c4");
		minhaListEncadeada.add("c5");
		minhaListEncadeada.add("c6");
		minhaListEncadeada.add("c7");
		
		System.out.println(minhaListEncadeada);
		
		minhaListEncadeada.remove(3);
		
		minhaListEncadeada.add(3, "99");
		
		System.out.println(minhaListEncadeada);
		System.out.println(minhaListEncadeada.get(3));
	}

}
