package fauna;

public class Lion {

    private String food = "Mięso";
    private int hunger = 5;
    private AnimalPosition position
            = new AnimalPosition(0, 0);
    private AnimalTerritory territory;

    public Lion(double territoryX, double territoryY) {
        this.territory = new AnimalTerritory(
                territoryX, territoryY);
    }

    // HungerException
    public void makeNoise() {
        if (hunger > 8) {
            System.out.println("Jestem głodny. Nie mam sił hałasować");
            return;
        }

        System.out.println("Roarrr");
        hunger++;
    }

    public void eat() {
        if (hunger == 0) {
            System.out.println("Jestem najedzony. Nie mam ochoty nic jeść");
            return;
        }

        System.out.println("Antylopa na obiad :)");
        hunger--;
    }

    public void sleep() {
        if (hunger >= 8) {
            System.out.println("Nie zasnę z pustym żołądkiem. Muszę coś zjeść");
            return;
        }

        System.out.println("Idę spać...");
        hunger = 10;
    }

    public void travel(double x, double y) {
        if (!territory.canTravel(x, y)) {
            System.out.println("Nie mogę tego zrobić. To nie moje terytorium");
            return;
        }

        System.out.printf("Idę z punktu (%.2f, %.2f) do punktu (%.2f, %.2f)\n",
                position.getX(), position.getY(), x, y);

        position.setX(x);
        position.setY(y);
    }

    @Override
    public String toString() {
        return "Lion{" +
                "food='" + food + '\'' +
                ", hunger=" + hunger +
                ", position=" + position +
                ", territory=" + territory +
                '}';
    }
}
