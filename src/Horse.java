   public class Horse{
    private int weight;
    private int age;
    private String color;
    private char gender;
    private String nickName;



    public Horse(int weight, int age, String color, char gender, String nickName) {
        super();
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.gender = gender;
        this.nickName = nickName;
    }

    public void horse() {
        System.out.println("Horse: " + nickName);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
}
