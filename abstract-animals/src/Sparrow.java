public class Sparrow extends Animals implements FlyingAnimals {
    
    @Override
    public void eat() {
        
        System.out.println("Eating some seeds!");

    }

    @Override
    public void doSound() {
        
        System.out.println("CIP! CIP!");

    }

    @Override
    public void fly() {
        System.out.println("Sparrow is flying!");
    }

}
