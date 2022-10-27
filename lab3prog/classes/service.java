package classes;
import java.util.Scanner;

public class service {
	private int service_cost;
	private String service_name;

	//Конструктор класса без параметров.
	public service() {
		service_cost = 0;
		service_name = "Нет названия";
	}

	//Конструктор класса с одним параметром.
	public service(String name) {
		service_cost = 0;
		service_name = name;
	}
	
	//Конструктор класса со всеми параметрами.
	public service(int cost, String name) {
		service_cost = cost;
		service_name = name;
	}
	
	//Метод ввода.
	public void service_input() {
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите название доп. услуги: ");
		service_name = inpt.nextLine();
		System.out.print("Введите стоимость доп. услуги: ");
		service_cost = inpt.nextInt();
	}

	//Метод вывода.
	public void service_output() {
		System.out.println("Название доп. услуги: " + service_name);
		System.out.println("Стоимость доп. услуги: " + service_cost);
	}
	
	//Метод вывода цены.
	public int get_cost() {
		return service_cost;
	}
}