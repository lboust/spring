package hello;

public class Principal {

	public static void main(String[] args) {
		Empile<Integer> e = new Empile<Integer>();
		e.mettre(10);
		e.mettre(20);
		System.out.println(e.donner());
		System.out.println(e.donner());

	}

}
