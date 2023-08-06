package animals;

public class Dog extends Animal {
    public Dog(String name, int speedOfRun, int speedOfSwim, int stamina) {
        super(name, speedOfRun, speedOfSwim, stamina);
    }

    @Override
    public double swim(int distance) {
        if (stamina < distance * 2) {
            System.out.println("Нельзя выполнить действие: проплыть на " + distance + " м. с запасом выносливости " + stamina + "\n");
            return -1;
        }
        if (distance == 0) {
            System.out.println(name + " стоит на месте\n");
            return 0;
        }
        stamina -= distance * 2;
        if (stamina <= 0) {
            isTired = true;
        }
        System.out.println(name + " проплыл(а) " + distance + " м. затратив " + distance * 2 + " у.е. выносливости\n");
        return (double) distance / speedOfSwim;
    }
}
