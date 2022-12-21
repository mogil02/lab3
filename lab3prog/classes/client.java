package classes;
import java.util.Scanner;

public class client extends human implements interfacehuman {

	//Конструктор класса без параметров.
	public client() {
		super();
	}

	//Конструктор класса с одним параметром.
	public client(int id) {
		super(id);
	}
	
	//Конструктор класса со всеми параметрами.
	public client(int id, String name) {
		super(id, name);
	}
	
	//Метод ввода.
	public void input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите ФИО клиента: ");
		super.FIO = inpt.nextLine();
		System.out.print("Введите id клиента: ");
		super.id = inpt.nextInt();
	}

	//Метод вывода.
	public void output() {
		System.out.println("ID клиента: " + super.id);
		System.out.println("ФИО клиента: " + super.FIO);
	}
	
	public String toString() {
		return "ID клиента: " + super.id + "\nФИО клиента: " + super.FIO;
	}
}