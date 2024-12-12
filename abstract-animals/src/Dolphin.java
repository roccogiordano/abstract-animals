// Dolphin Class

public class Dolphin extends Animals implements SwimmingAnimals {


    // Dolphin Methods

    public Dolphin() {}
    
    @Override
    public void eat() {
        
        System.out.println("Eating some fish!");

    }

    @Override
    public void doSound() {
        
        System.out.println("HIHI! HIHI!");

    }

    @Override
    public void swim() {
        System.out.println("Dolphin is swimming!");
    }

    //

    
}

//
