package animals;

public abstract class Animal {
	String name;
	int speedOfRun, speedOfSwim, stamina, swimCoefficient;
	boolean isTired;

	public Animal(String name, int speedOfRun, int speedOfSwim, int stamina, int swimCoefficient) {
		this.name = name;
		this.speedOfRun = speedOfRun;
		this.speedOfSwim = speedOfSwim;
		this.stamina = stamina;
		this.swimCoefficient = swimCoefficient;
		isTired = false;
	}

	public Animal(String name, int speedOfRun, int stamina) {
		this.name = name;
		this.speedOfRun = speedOfRun;
		this.stamina = stamina;
		speedOfSwim = 0;
		swimCoefficient = 0;
		isTired = false;
	}

	public double run(int distance) {
		if (stamina < distance) {
			System.out.println("Нельзя выполнить действие: пробежать на " + distance + " м. с запасом выносливости " + stamina + "\n");
			return -1;
		}
		if (distance == 0) {
			System.out.println(name + " стоит на месте\n");
			return 0;
		}
		stamina -= distance;
		if (stamina <= 0) {
			isTired = true;
			stamina = 0;
		}
		System.out.println(name + " пробежал(а) " + distance + " м. затратив " + distance + " у.е. выносливости\n");
		return (double) distance / speedOfRun;
	}

	public double swim(int distance) {
		if (swimCoefficient == 0) {
			System.out.println("Коты не умеют плавать\n");
			return -1;
		}
		if (stamina < distance * swimCoefficient) {
			System.out.println("Нельзя выполнить действие: проплыть на " + distance + " м. с запасом выносливости " + stamina + "\n");
			return -1;
		}
		if (distance == 0) {
			System.out.println(name + " стоит на месте\n");
			return 0;
		}
		stamina -= distance * swimCoefficient;
		if (stamina <= 0) {
			isTired = true;
			stamina = 0;
		}
		System.out.println(name + " проплыл(а) " + distance + " м. затратив " + distance * swimCoefficient + " у.е. выносливости\n");
		return (double) distance / speedOfSwim;
	}

	public void info() {
		System.out.println("Кличка: " + name + "\n" + "Скорость бега: " + speedOfRun + " м./c.\n" + "Скорость плавания: " + speedOfSwim + " м./c.\n" + "Выносливость: " + stamina + " у.е.");
		if (isTired) {
			System.out.println("Состояние: усталость");
		} else {
			System.out.println("Состояние: бодрствование");
		}
		System.out.println();
	}
}
