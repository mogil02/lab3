package classes;
import java.util.Scanner;

public class client {
	private int client_id;
	private String client_FIO;

	//Конструктор класса без параметров.
	public client() {
		client_id = 0;
		client_FIO = "Имя не указано.";
	}

	//Конструктор класса с одним параметром.
	public client(int id) {
		client_id = id;
		client_FIO = "Имя не указано.";
	}
	
	//Конструктор класса со всеми параметрами.
	public client(int id, String name) {
		client_id = id;
		client_FIO = name;
	}
	
	//Метод ввода.
	public void client_input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите ФИО клиента: ");
		client_FIO = inpt.nextLine();
		System.out.print("Введите id клиента: ");
		client_id = inpt.nextInt();
	}

	//Метод вывода.
	public void client_output() {
		System.out.println("ID клиента: " + client_id);
		System.out.println("ФИО клиента: " + client_FIO);
	}
}