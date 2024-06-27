public class Animal {
    public void animalSound() {
        System.out.println("Things animals have in common");
    }
}

class Pig extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The pig says: oin oin");
    }
}

class Dog extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Cat extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The cat says: meow");
    }
}

class Chicken extends Animal {
    @Override
    public void animalSound() {
        System.out.println("The chicken says: cluck cluck");
    }
}

