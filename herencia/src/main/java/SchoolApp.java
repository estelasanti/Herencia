public class SchoolApp{
    public static void main(String[] args) {
        Student student1=new Student("Juan","Perez","juanperez@gmail.com","Iguala,Gro");
        student1.setControlNumber(123456789);
        student1.setCareer("Informatica");
        student1.setGeneralAverage(86.6);

        Teacher teacher1=new Teacher("Maria","Morales","MarioMora@gmail.com","Ruffo Figeroa");
        teacher1.setAdscription("Centro de computation");
        teacher1.setBiocard(1232456);
        teacher1.setAssigned_Hours(36);

        System.out.println("===============Student====================");
        System.out.println("El nombre del Student es: " + student1.getName() + " " + student1.getLastName());
        System.out.println("El email del Student es: "+ student1.getEmail());
        System.out.println("La direccion del Student es: "+ student1.getAddress());
        System.out.println("El numero de control de " + student1.getName() + " es: " +student1.getControlNumber());
        System.out.println("La carrera de " + student1.getName() + " es: " +student1.getCareer() + " y su promedio es " + student1.getGeneralAverage());
        System.out.println("===============Teacher====================");
        System.out.println("El nombre del Teacher es: "+ teacher1.getName() + " " + teacher1.getLastName());
        System.out.println("El email del Teacher es: " + teacher1.getEmail());
        System.out.println("La direcion de la teacher es: " + teacher1.getAddress());
        System.out.println("la adscription de " + teacher1.getAdscription() + ", su biocard " +
                teacher1.getBiocard() + " y sus horas asignadas son " + teacher1.getAssigned_Hours() + " horas");

        //probando la sobrecarga de metods
        System.out.println("Soy una persona: " + student1.toString());
        System.out.println("Soy una persona: " + teacher1.toString());

        System.out.println("El Student: " + student1.soy());
        System.out.println("El Teacher: " + teacher1.soy());
    }
}

