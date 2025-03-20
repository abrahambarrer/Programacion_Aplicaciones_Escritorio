public class Prueba {

    public void nuevoMetodo() throws NuevaExcepcion{
        throw new NuevaExcepcion("Error detectado");
    }

    public static void main(String[] args) {

        Prueba nuevaPrueba = new Prueba();

        try {
            nuevaPrueba.nuevoMetodo();
        } catch (NuevaExcepcion e) {
            System.out.println(e.getMessage());
        }
    }
}
