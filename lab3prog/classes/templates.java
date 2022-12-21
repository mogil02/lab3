package classes;
import java.util.Scanner;

public templates<T> {
	private T ret;
	
	public templates() { }
	public T set() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		this.ret = inpt.next();
		return ret;
	}
}