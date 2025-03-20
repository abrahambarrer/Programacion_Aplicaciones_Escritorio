public class ExceptionAB {

    public static void a(){
        int operacion = 2 / 0;
    }

    public static void b() {
        a();
        int[] arreglo = {1, 2};
        System.out.println(arreglo[2]);
    }

    public static void main(String[] args) {
        try {
            b();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
