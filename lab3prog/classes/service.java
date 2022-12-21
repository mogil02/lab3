package classes;
import java.util.Scanner;

public class service {
	private int cost;
	private String name;

	//Конструктор класса без параметров.
	public service() {
		this.cost = 0;
		this.name = "Нет названия";
	}

	//Конструктор класса с одним параметром.
	public service(String name) {
		this.cost = 0;
		this.name = name;
	}
	
	//Конструктор класса со всеми параметрами.
	public service(int cost, String name) {
		this.cost = cost;
		this.name = name;
	}
	
	//Метод ввода.
	public void input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите название доп. услуги: ");
		this.name = inpt.nextLine();
		System.out.print("Введите стоимость доп. услуги: ");
		this.cost = inpt.nextInt();
	}

	//Метод вывода.
	public void output() {
		System.out.println("Название доп. услуги: " + this.name);
		System.out.println("Стоимость доп. услуги: " + this.cost);
	}
	
	//Метод вывода цены.
	public int get_cost() {
		return this.cost;
	}
	
	public String toString() {
		return "Название доп. услуги: " + this.name + "\nСтоимость доп. услуги: " + this.cost;
	}
}