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
    public void makeNoise() throws AnimalHungerException {
        if (hunger > 8) {
            throw new AnimalHungerException(
                    "Jestem głodny. Nie mam sił hałasować");
        }

        System.out.println("Roarrr");
        hunger++;
    }

    public void eat() throws AnimalHungerException {
        if (hunger == 0) {
            throw new AnimalHungerException(
                    "Jestem najedzony. Nie mam ochoty nic jeść");
        }

        System.out.println("Antylopa na obiad :)");
        hunger--;
    }

    public void sleep() throws AnimalHungerException {
        if (hunger >= 8) {
            throw new AnimalHungerException(
                    "Nie zasnę z pustym żołądkiem. Muszę coś zjeść");
        }

        System.out.println("Idę spać...");
        hunger = 10;
    }

    public void travel(double x, double y) throws AnimalTravelException {
        if (!territory.canTravel(x, y)) {
            throw new AnimalTravelException(
                    "Nie mogę tego zrobić. To nie moje terytorium");
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
