public class ImprimirStackTrace {
    public static void main(String[] args) throws Exception {

        try {
            throw new Exception("Este es un mensaje de error");
        } catch (Exception e) {
            System.out.println("Mensaje de la excepción: " + e.getMessage());

            e.printStackTrace();

        }
        finally {
            System.out.println("Este es un mensaje de error en el bloque finally.");
        }
    }
}