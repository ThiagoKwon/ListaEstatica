package lista.estatica.pacote;

public class Main {

	public static void main(String[] args) {

		Lista<String> lista = new Lista<String>(5);

		lista.add("THIAGO");
		lista.add("BRENO");
		lista.add("CAROL", 4);
		lista.add("PED");
		lista.add("ARY", 3);
		lista.remove(2);
		lista.add("VAMP");
		// lista.showList();
		// System.out.println(lista.findByPosition("BRENO"));
		lista.remove(lista.findByData("THIAGO"));
		lista.showList();

	}

}
