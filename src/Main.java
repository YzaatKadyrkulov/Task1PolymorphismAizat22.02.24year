
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /**
         *
         */
        Cow cow = new Cow();

        Sheep sheep = new Sheep();


        Farm farm = new Farm("Ak-Beshim","Jdanka","Mustank","NameOfSheep","Kylychbek");
        System.out.println("Farm: ");
        farm.address();
        System.out.println();
        farm.farmCows();
        System.out.println();
        farm.farmHorses();
        System.out.println();
        farm.farmSheep();
        System.out.println();
        farm.ownerName();
        System.out.println();

        Farm1 farm1Cow = new Farm1("Jdanka", "White horse", "White sheep");
        Farm1 farm2Sheep = new Farm1("Verka", "Black horse", "Black sheep");
        Farm1 farm3Horse = new Farm1("Akchandyr", "Brown horse", "Brown sheep");
        System.out.println("Farm1: ");
        farm1Cow.farm1Cow();
        System.out.println();
        farm2Sheep.farm2Sheep();
        System.out.println();
        farm3Horse.farm3Horse();
        System.out.println();


        Farm2 farm4 = new Farm2("yellow sheep", "blue cow", "pink horse");

        System.out.println("Farm2");
        farm4.farm2();
        System.out.println();

        cow.setWeight(1);
        cow.setAge(3);
        cow.setGender('J');
        cow.setNickName("Jdanka");

        sheep.setWeight(3);
        sheep.setAge(1);
        sheep.setGender('J');
        sheep.setNickName("Verka");

        Horse horse = new Horse(3,8,"white",'M',"Black kashka");
        System.out.println("Horse: ");
        horse.horse();
        System.out.println();


        System.out.println("Cow: ");
        System.out.println("cow.getWeight() = " + cow.getWeight());
        System.out.println("cow.getAge() = " + cow.getAge());
        System.out.println("cow.getGender() = " + cow.getGender());
        System.out.println("cow.NickName() = " + cow.getNickName());

        System.out.println();
        System.out.println("Sheep: ");
        System.out.println("sheep.getWeight() = " + sheep.getWeight());
        System.out.println("sheep.getAge() = " + sheep.getAge());
        System.out.println("sheep.getGender() = " + sheep.getGender());
        System.out.println("sheep.NickName() = " + sheep.getNickName());




    }


    }





