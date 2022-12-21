package classes;
import java.util.Scanner;

public class specifications {
	private int power;
	private int speed;
	private int t_id;
	private double volume;

	//Конструктор класса без параметров.
	public specifications() {
		power = 0;
		speed = 0;
		t_id = 1;
		volume = 0;
	}

	//Конструктор класса с одним параметром.
	public specifications(int pow) {
		power = pow;
		speed = 0;
		t_id = 1;
		volume = 0;
	}
	
	//Конструктор класса со всеми параметрами.
	public specifications(int pow, int spd, int id, double vol) {
		power = pow;
		speed = spd;
		t_id = id;
		volume = vol;
	}
	
	//Метод ввода.
	public void input() {
		Scanner inpt = new Scanner(System.in);
		System.out.print("Введите мощность двигателя: ");
		power = inpt.nextInt();
		System.out.print("Введите максимальную скорость: ");
		speed = inpt.nextInt();
		System.out.print("Введите номер трансмиссии\n1) - Механика\n2) - Гидромеханика\n3) - Робот\n4) - Вариатор\nВвод: ");
		try {
		t_id = inpt.nextInt();
		if (t_id > 4 || t_id < 1) throw new Exception("Введённое число не соответсвует условию.Число по умолчанию 1.");
		}
		catch (Exception ex) {
			System.out.println(ex.getMessage());
			t_id = 1;
		}
		System.out.print("Введите объём двигателя: ");
		volume = inpt.nextDouble();
	}

	//Метод вывода.
	public void output() {
		System.out.println("Мощность двигателя: " + power);
		System.out.println("Максимальная скорость: " + speed);
		System.out.println("Коробка передач: " + trans_name(t_id));
		System.out.println("Объём двигателя: " + volume);
	}
	
	//Прикладная функция вывода названия коробки передач.
	public String trans_name(int id) {
		if (id == 1) return "Механика";
		else if (id == 2) return "Гидромеханика";
		else if (id == 3) return "Робот";
		else if (id == 4) return "Вариатор";
		else return "Ошибка";
	}
	
	public String toString() {
		return "Мощность двигателя: " + power + "\nМаксимальная скорость: " + speed
		+ "\nКоробка передач: " + trans_name(t_id) + "\nОбъём двигателя: " + volume;
	}
}