package Main.Java;

import java.util.Scanner;

class UserData {
	static void data() {
		String input;
		int age;

		do {
			System.out.println("Input name: ");
			input = inputVerifier();
		} while (input.isEmpty());
		String name = input;

		do {
			System.out.println("Input city: ");
			input = inputVerifier();
		} while (input.isEmpty());
		String city = input;

		do {
			System.out.println("Input age: ");
			age = ageVerifier();
		} while (age == 0);

		do {
			System.out.println("Input hobby: ");
			input = inputVerifier();
		} while (input.isEmpty());
		String hobby = input;

		System.out.print("\n----------------------------------\n" +
						 "Вариант 1 (табличный):\n" +
						 "Имя: " + name + "\n" +
						 "Город: " + city + "\n" +
						 "Возраст: " + age + "\n" +
						 "Хобби: " + hobby + "\n" +
						 "----------------------------------\n" +
						 "Вариант 2 (текстовый):\n" +
						 "Человек по имени " + name + " живет в городе " + city + ".\n" +
						 "Этому человеку " + age + " лет и любит он заниматься " + hobby + ".\n" +
						 "----------------------------------\n" +
						 "Вариант 3 (иной):\n" +
						 name + " - имя\n" +
						 city + " - город\n" +
						 age + " - возраст\n" +
						 hobby + " - хобби\n" +
						 "----------------------------------");
	}

	private static String inputVerifier() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if (s.equals("q") || s.equals("Q") || s.equals("quit") || s.equals("Quit"))
		{
			System.exit(111);
		}
		return s;
	}

	private static int ageVerifier() {
		Scanner sc = new Scanner(System.in);
		String s;
		int i;
		if (sc.hasNextInt())
		{
			i = sc.nextInt();
			if (i > 0 && i < 150)
			{
				return i;
			}
			else
			{
				s = sc.nextLine();
				if (s.equalsIgnoreCase("q") || s.equalsIgnoreCase("quit"))
				{
					System.exit(222);
				}
			}
		}
		return 0;
	}
}
