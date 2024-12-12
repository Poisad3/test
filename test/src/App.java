public class App {
    static String nombre = "javier";

    public static void main(String[] args) throws Exception {

        int resultado = add(10, 20); // inicializa la variable resultado con el valor de la suma de 10 y 20
        System.out.println("Resultado: " + resultado);

        resultado = add(30, 40);
        System.out.println("Resultado: " + resultado);
        System.out.println("Hola mundo2" + nombre);

    }

    public static int add(int a, int b) { // metodo que recibe dos parametros y retorna la suma de los mismos
        String nombre = "javier";
        nombre = "javier3";
        System.out.println("Hola " + nombre);
        return a + b;

    }

}
