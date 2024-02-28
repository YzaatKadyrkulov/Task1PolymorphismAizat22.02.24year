public class Farm {
    private String address;
    private String cows;
    private String horses;
    private String sheep;
    private String ownerName;


    public Farm(String address, String cows, String horses, String sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    public void address() {
        System.out.println("Address: " + address);
    }

    public void farmCows() {
        System.out.println("1)Cow: " + cows);
        System.out.println("2)Cow " + cows);
    }

    public void farmHorses() {
        System.out.println("1)Horse: " + horses);
        System.out.println("2)Horse: " + horses);
    }

    public void farmSheep() {
        System.out.println("1)Sheep: " + sheep);
        System.out.println("2)Sheep: " + sheep);
    }
    public void ownerName() {
        System.out.println("1)ownerName: " + ownerName);
}

    }