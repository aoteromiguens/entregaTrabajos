public class Tp2{

    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String RESET = "\u001B[0m";

    public static float calcularIndice(float altura ,float peso){
        return peso/(altura*altura);
    }

    public  static void clasificarIndice(float indice){
        if (indice >= 30){
            System.out.print(RED+"obesidad");
            if (indice < 35 ) System.out.print(RED+" moderada");
            else{
                if(indice > 40) System.out.print(RED+" mórvida");
                else System.out.println(RED+" severa");
            }
        }
        else{
            if (indice <= 18.4){
                if (indice < 15) System.out.print(RED+"muy ");
                if (indice < 16) System.out.println(RED+"severa ");
                System.out.print(YELLOW+"delgadez");
            }
            else{
            if ( indice < 25) System.out.println(GREEN+"Peso correcto");
            else System.out.println(YELLOW+"Sobre peso");
            }
        }
        System.out.println(RESET);
    }

    public static void main(String[] args) {
        float altura = 0;
        float peso = 0;
        if (args.length == 2){
            altura = Float.parseFloat(args[0]);
            altura = Float.parseFloat(args[1]);
        }
        else{
            System.out.print("Increse su peso: ");
            peso = new java.util.Scanner(System.in).nextFloat();
            System.out.print("Increse su altura: ");
            altura = new java.util.Scanner(System.in).nextFloat();
        }
        clasificarIndice(calcularIndice(altura ,peso));

    }

    }