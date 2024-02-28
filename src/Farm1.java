public class Farm1 {
    private String cow;
    private String horse;
    private String sheep;

    public Farm1(String cow, String horse, String sheep) {
        this.cow = cow;
        this.horse = horse;
        this.sheep = sheep;

    }

    public void farm1Cow() {
        System.out.println("1)Cow: " + cow);
        System.out.println("2)Cow " + cow);
        System.out.println("3)Cow: " + cow);
    }


    public void farm2Sheep() {
        System.out.println("1)Sheep: " + sheep);
        System.out.println("2)Sheep: " + sheep);
        System.out.println("3)Sheep: " + sheep);
        System.out.println("4)Sheep: " + sheep);
        System.out.println("5)Sheep: " + sheep);

    }

    public void farm3Horse() {
        System.out.println("1)Horse: " + horse);
        System.out.println("2)Horse: " + horse);
        System.out.println("3)Horse: " + horse);
    }

}
