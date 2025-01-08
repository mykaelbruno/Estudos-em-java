package POO;

public class CelularTestar {
    public static void main(String[] args) {
        Celular s24_ultra = new Celular("Samsung", "S24 Ultra", 12, 128, 7);

        System.out.println("Informações do celular cadastrado: " + s24_ultra.getMarca() + " " + s24_ultra.getModelo() + " " +s24_ultra.getRam());

        s24_ultra.memoria();
        s24_ultra.print();
    }
}
