package classes;
import java.util.Scanner;

public class manager extends human implements interfacehuman {
	protected int wages;

	//Конструктор класса без параметров.
	public manager() {
		super();
		this.wages = 0;
	}

	//Конструктор класса с одним параметром.
	public manager(int id) {
		super(id);
		this.wages = 0;
	}
	
	//Конструктор класса со всеми параметрами.
	public manager(int id, int wages, String name) {
		super(id, name);
		this.wages = wages;
	}
	
	//Метод ввода.
	public void input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите ФИО менеджера: ");
		super.FIO = inpt.nextLine();
		System.out.print("Введите id менеджера: ");
		super.id = inpt.nextInt();
		System.out.print("Введите премию менеджера за сделку: ");
		wages = inpt.nextInt();
	}

	//Метод вывода.
	public void output() {
		System.out.println("ID менеджера: " + super.id);
		System.out.println("ФИО менеджера: " + super.FIO);
		System.out.println("Премия менеджера за сделку: " + this.wages);
	}
	
	public String toString() {
		return "ID менеджера: " + super.id + "\nФИО менеджера: " + super.FIO
		+ "\nПремия менеджера за сделку: " + wages;
	}
}