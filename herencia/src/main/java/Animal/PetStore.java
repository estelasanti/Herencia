package Animal;
public class PetStore {
    public static void main(String[] args) {
        Cat garfield = new Cat("Garfield", "Naranja", 5, "Gato");
        Dog firulais = new Dog("Firulais", "Manchado", 3, "Perro");
        Rooster claudio = new Rooster("Claudio", "Blanco con rojo", 1, "Gallo");

        System.out.println("Ejemplo de poliformismo");
        System.out.println(garfield.talk());
        System.out.println(firulais.talk());
        System.out.println(claudio.talk());
        System.out.println(" invocando al metodo toString de la clase animal");
        System.out.println(garfield.toString());
        System.out.println(firulais.toString());
        System.out.println(claudio.toString());
    }
}