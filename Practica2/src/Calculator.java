public class Calculator {
    public static void main(String[] args) throws Exception {

        if (args.length != 3){
            System.out.println("Programa soportado: op1 operator op2");
            System.exit(1);
        }

        int operando1 = 0, operando2 = 0, result = 0;
        
        try {
            operando1 = Integer.parseInt(args[0]);
        } catch (MatchException e){
            System.out.println("Error: " + args[0]);
            System.exit(1);
        }
        try {
            operando2 = Integer.parseInt(args[2]);
        } catch (MatchException e) {
            System.out.println("Error: " + args[2]);
            System.exit(1);
        }

        switch (args[1].charAt(0)) {
            case '+': result = operando1 + operando2;
                break;
            case '-': result = operando1 - operando2;
                break;
            case '.': result = operando1 * operando2;
                break;
            case '/': result = operando1 / operando2;
                break;
        }
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}