package classes;
import java.util.Scanner;

public class car {
	private int cost;
	private String brand;
	private specifications Spec;

	//Конструктор класса без параметров.
	public car() {
		this.cost = 0;
		this.brand = "Нет названия";
		Spec = new specifications();
	}

	//Конструктор класса с одним параметром.
	public car(String brand) {
		this.cost = 0;
		this.brand = brand;
		Spec = new specifications();
	}
	
	//Конструктор класса со всеми параметрами.
	public car(int cost, String brand, specifications spec) {
		this.cost = cost;
		this.brand = brand;
		Spec = spec;
	}
	
	//Метод ввода.
	public void input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите название авто: ");
		brand = inpt.nextLine();
		Spec.input();
		System.out.print("Введите цену на авто: ");
		cost = inpt.nextInt();
	}

	//Метод вывода.
	public void output() {
		System.out.println("Название авто: " + brand);
		System.out.println("Стоимость авто: " + cost);
		Spec.output();
	}
	
	//Метод вывода цены.
	public int get_cost() {
		return cost;
	}
	
	//Метод установки цены автомобиля.
	public void set_cost(int cost) {
		this.cost = cost;
	}
	
	public String toString() {
		return "Название авто: " + brand + "\nСтоимость авто: " + cost + Spec.toString();
	}
}