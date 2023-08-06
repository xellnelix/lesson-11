package animals;

public class Cat extends Animal {
    public Cat(String name, int speedOfRun, int stamina) {
        super(name, speedOfRun, stamina);
    }

    @Override
    public double swim(int distance) {
        System.out.println("Коты не умеют плавать\n");
        return -1;
    }

}
