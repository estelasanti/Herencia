package AbstracAnimal;
public class PetStore {
    public static void main(String[] args) {
        Cat garfield=new Cat("Garfield", "Naranja",5);
        Cat felix=new Cat("Felix","Gris",3);
        Dog firulais=new Dog("Firulais"," Manchado",3);
        Rooster federico=new Rooster("Federico", "blanco",2);

        System.out.println("--Ejemplo de poliformismo usando clase abstracta--");
        System.out.println("Invocando al metodo toString:");
        System.out.println(garfield.toString());
        System.out.println(felix.toString());
        System.out.println(firulais.toString());
        System.out.println(federico.toString());
    }
}
