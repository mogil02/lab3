package classes;
import java.util.Scanner;

public class deal {
	private car Car;
	private client Client;
	private manager Manager;
	private service Service;
	
	//Конструктор класса без параметров.
	public deal() {
		Manager = new manager();
		Client = new client();
		Service = new service();
		Car = new car();
	}

	//Конструктор класса с одним параметром.
	public deal(car Cr) {
		Car = Cr;
		Manager = new manager();
		Client = new client();
		Service = new service();
	}
	
	//Конструктор класса со всеми параметрами.
	public deal(car Cr, client Cl, manager Mn, service Sv) {
		Car = Cr;
		Client = Cl;
		Manager = Mn;
		Service = Sv;
	}
	
	//Метод ввода.
	public void deal_input() {
		Car.car_input();
		Manager.manager_input();
		Client.client_input();
		Service.service_input();
	}

	//Метод вывода.
	public void deal_output() {
		Car.car_output();
		Manager.manager_output();
		Client.client_output();
		Service.service_output();
	}
	
	//Метод подсчёта суммы, потраченной клиентом за сделку.
	public Integer sum_costs() {
		Integer sum = Car.get_cost() + Service.get_cost();
		return sum;
	}

}