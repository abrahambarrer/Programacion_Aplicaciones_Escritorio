public class Prueba2 {

    public void nuevoMetodo() throws NuevaExcepcion{
        throw new NuevaExcepcion("Error detectado");
    }

    public static void main(String[] args) {

        Prueba2 nuevaPrueba = null;

        try {
            nuevaPrueba.nuevoMetodo();
        } catch (NuevaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
