public class VariablesAndConstants {
    public static void main(String[] args) {

        // Variables

        String name = "Juanmi";
        System.out.println(name);
        // Dato de tipo texto. // Es una buena practica escribir el nombre de las variables en ingles.
        // Imprimir mi nombre en pantalla.
        name = "Juan Miguel";
        System.out.println(name);
        int age = 18; // tipo de dato primitivo.
        System.out.println(age);

        var JS = "Esto tambien vale";
        // SE PUEDEN CREAR VARIABLES DE DISTINTA NATURALEZA COMO DATO CON LA PALABRA RESERVADA VAR.
        // Esto se incluyó en versiones modernas de JAVA. El tipo de dato lo detecta solo.

        // Constantes.

        String email = "tabletsanchez3@gmail.com"; // Esto no es una constante.
        // PARA LAS CONSTANTES PALABRA RESERVADA "final".
        final String CORREO = "ejemplo@gmail.com"; // Esto si es una constante.
        System.out.println(CORREO);
        // ES UNA BUENA PRACTICA PONER EL NOMBRE DE LAS CONSTANTES EN MAYUSCULAS Y EL DE LAS VARIABLES EN FORMATO LOWERCAMELCASES.

    }
}
