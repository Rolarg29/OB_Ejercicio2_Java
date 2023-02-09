public class Main {
    public static void main(String[] args) {
        calcularIva(200);
    }
    /**
     * Crear una función que reciba precio y devuelva el precio con el IVA incluido
     */
    public static void calcularIva(double precio) {
        double iva = 0.16;
        double subtotal = precio * iva;
        System.out.print("El precio con iva incluido es: $");
        System.out.println(subtotal + precio);
    }
}