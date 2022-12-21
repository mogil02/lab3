package classes;
import java.util.Scanner;

public abstract class human {
	protected int id;
	protected String FIO;
	
	public human() {
		this.id = 0;
		this.FIO = "Имя не указано.";
	}
	
	public human(int id) {
		this.id = id;
		this.FIO = "Имя не указано.";
	}
	
	public human(int id, String name) {
		this.id = id;
		this.FIO = name;
	}
}