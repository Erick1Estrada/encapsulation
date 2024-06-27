public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();  // Crear un objeto Animal
        Animal myPig = new Pig();        // Crear un objeto Pig
        Animal myDog = new Dog();        // Crear un objeto Dog
        Animal myCat = new Cat();        // Crear un objeto Cat
        Animal myChicken = new Chicken(); // Crear un objeto Chicken

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myChicken.animalSound();

        System.out.println("name");

        // Crear una instancia de la clase interna Erick
        Main main = new Main();
        Erick erickInstance = main.new Erick();
        erickInstance.setName("erick");
        System.out.println(erickInstance.getName());
    }

    public class Erick {
        private String nombre;

        // Modificar el atributo
        public void setName(String nombre) {
            this.nombre = nombre;
        }

        // Obtener el nombre
        public String getName() {
            return this.nombre;
        }
    }
}

