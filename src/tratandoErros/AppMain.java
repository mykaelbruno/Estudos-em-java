package tratandoErros;

public class AppMain {
    public static void main(String[] args) {
        Animal animal = new Animal("Roberto", 12);
        System.out.println(animal);
        try {
            animal.setIdade(-3);
            System.out.println(animal);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("deu erro");
        animal.setIdade(-123);
        System.out.println(animal);
    }
}
