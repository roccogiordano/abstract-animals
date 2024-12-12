public class Eagle extends Animals implements FlyingAnimals {
    
    public Eagle() {}

    @Override
    public void eat() {
        
        System.out.println("Eating some grass!");

    }

    @Override
    public void doSound() {
        
        System.out.println("MOO! MOO!");

    }

    @Override
    public void fly() {
        System.out.println("Eagle is flying!");
    }

}
