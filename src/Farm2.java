public class Farm2 {
    private String sheep;
    private String cow;
    private String horse;

    public Farm2() {
    }

    public Farm2(String sheep, String cow, String horse) {
        this.sheep = sheep;
        this.cow = cow;
        this.horse = horse;
    }
    public void farm2() {
        System.out.println("1)Cow: " + cow);
        System.out.println("2)Horse: " + horse);
        System.out.println("3)Sheep: " + sheep);
    }
}