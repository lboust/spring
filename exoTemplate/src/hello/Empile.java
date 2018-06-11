package hello;


public class Empile<T> {
	
	T[]data =  (T[]) new Object[10];
	int position = 0;

	
	public void mettre(T t) {
		data[position++] = t;
	}

	public T donner() {
		return data[--position];
	}
}
