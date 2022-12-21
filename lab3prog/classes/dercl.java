package classes;
import java.util.Scanner;

public class dercl extends client {
	protected char gender;
	protected int age;
	
	public dercl() {
		super();
		gender = 'M';
		age = 0;
	}
	public dercl(int id, String name, char gender, int age) {
		super(id, name);
		this.gender = gender;
		this.age = age;
	}
	public void set_gender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}
		else {
			this.gender = 'M';
			System.out.println("Выставлено значение по умолчанию \"M\".");
		}
	}
	public void set_age(int age) {
		this.age = age;
	}
	public void input() {
		super.input();
		Scanner inpt = new Scanner(System.in, "Cp866");
		System.out.print("Введите пол клиента: ");
		this.gender = inpt.next().charAt(0);
		System.out.print("Введите возраст клиента: ");
		this.age = inpt.nextInt();
	}
	public void output() {
		super.output();
		System.out.println("Возраст клиента: " + this.age);
		System.out.println("Пол клиента: " + this.gender);
	}

	public String toString() {
		return super.toString() + "\nВозраст клиента: " + this.age + "\nПол клиента: " + this.gender;
	}
	
	public Object clone() throws CloneNotSupportedException {
        	return super.clone();
    	}
}