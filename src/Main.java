public class Main {
    public static void main(String[] args) {
        System.out.println("conversor de temperaturas");
        double celsius = 1.8;
        double fahrenheit = (celsius * 1.8) + 32;
        int temperaturaCompleta = (int) fahrenheit;
        String mensaje = """
                La temperatura grados celsius es: %.1f
                La temperatura equivalente en grados fahrenheit es: %.1f
                """.formatted(celsius,fahrenheit );
        System.out.println(mensaje);
        System.out.printf(String.format("la temperaturaCompleta es: %f%n", fahrenheit ));

    }
    }
