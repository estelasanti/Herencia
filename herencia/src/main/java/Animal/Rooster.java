package Animal;
public class Rooster extends Animal {
    public Rooster() {
    }
    public Rooster(String name, String color, int age,String type) {
        super(name, color, age,type);
    }
    @Override
    public String talk() {
        String s = "El animal " + this.getName() + " dice: Kikiriki";
        return s;
    }
    public String toString (){
        return "El animal "+this.getName()+" de color " + this.getColor() +" y tiene "+ this.getAge()+" años y dice kikiriki";
    }


}

