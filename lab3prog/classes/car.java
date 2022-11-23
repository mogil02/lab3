package classes;
import java.util.Scanner;

public class car {
	private int car_cost;
	private String car_brand;
	private specifications Spec;

	//Конструктор класса без параметров.
	public car() {
		car_cost = 0;
		car_brand = "Нет названия";
		Spec = new specifications();
	}

	//Конструктор класса с одним параметром.
	public car(String brand) {
		car_cost = 0;
		car_brand = brand;
		Spec = new specifications();
	}
	
	//Конструктор класса со всеми параметрами.
	public car(int cost, String brand, specifications spec) {
		car_cost = cost;
		car_brand = brand;
		Spec = spec;
	}
	
	//Метод ввода.
	public void car_input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите название авто: ");
		car_brand = inpt.nextLine();
		Spec.spec_input();
		System.out.print("Введите цену на авто: ");
		car_cost = inpt.nextInt();
	}

	//Метод вывода.
	public void car_output() {
		System.out.println("Название авто: " + car_brand);
		System.out.println("Стоимость авто: " + car_cost);
		Spec.spec_output();
	}
	
	//Метод вывода цены.
	public int get_cost() {
		return car_cost;
	}
	
	//Метод установки цены автомобиля.
	public void set_cost(int car_cost) {
		this.car_cost = car_cost;
	}
}