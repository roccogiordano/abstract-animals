public class Main {


    // Call to Interfaces Methods
    
    public static void makeItFly(FlyingAnimals flyingAnimal) {

        flyingAnimal.fly();

    }

    public static void makeItSwim(SwimmingAnimals swimmingAnimal) {

        swimmingAnimal.swim();

    }

    //


    public static void main(String[] args) {


        // Objects Instances
        
        Dog dog = new Dog();

        Eagle eagle = new Eagle();

        Dolphin dolphin = new Dolphin();
        
        Sparrow sparrow = new Sparrow();

        //


        // Objects Methods

        dog.eat();
        dog.doSound();

        eagle.eat();
        eagle.doSound();
        makeItFly(eagle);

        dolphin.eat();
        dolphin.doSound();
        makeItSwim(dolphin);

        sparrow.eat();
        sparrow.doSound();
        makeItFly(sparrow);

        Animals.sleep();

        //
        

    }
}
