package classes;
import java.util.Scanner;

public class manager {
	private int manager_id;
	private String manager_FIO;
	private int manager_wages;

	//Конструктор класса без параметров.
	public manager() {
		manager_id = 0;
		manager_wages = 0;
		manager_FIO = "Имя не указано.";
	}

	//Конструктор класса с одним параметром.
	public manager(int id) {
		manager_id = id;
		manager_wages = 0;
		manager_FIO = "Имя не указано.";
	}
	
	//Конструктор класса со всеми параметрами.
	public manager(int id, int wages, String name) {
		manager_id = id;
		manager_wages = wages;
		manager_FIO = name;
	}
	
	//Метод ввода.
	public void manager_input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите ФИО менеджера: ");
		manager_FIO = inpt.nextLine();
		System.out.print("Введите id менеджера: ");
		manager_id = inpt.nextInt();
		System.out.print("Введите премию менеджера за сделку: ");
		manager_wages = inpt.nextInt();
	}

	//Метод вывода.
	public void manager_output() {
		System.out.println("ID менеджера: " + manager_id);
		System.out.println("ФИО менеджера: " + manager_FIO);
		System.out.println("Премия менеджера за сделку: " + manager_wages);
	}
}