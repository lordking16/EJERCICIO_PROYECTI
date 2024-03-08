import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, RepeticionException {
        //USO DEL MÉTODO contarLetraEnTexto
        contarLetraEnTexto('l', "lala lele lili llo");
    }

    //Crear un método que cuente cuantas veces se encuentra una letra determinada en el texto si la letra aparece
    // más de 10 veces lanzar una excepción.
    public static int  contarLetraEnTexto(char letra, String texto) throws RepeticionException {
        int repeticionesCaracter = 0;
        try {
            char[] caracteres = texto.toCharArray();
            for (char c : caracteres) {
                if (c == letra) {
                    repeticionesCaracter += 1;
                    if (repeticionesCaracter == 10) {
                        throw new RepeticionException("Ya se ha encontrado 10 veces el caracter");
                    }
                }
            }
            System.out.println("El caracter: " + letra + " apareció " + repeticionesCaracter +" veces\n");
        } catch (RepeticionException repeticionException) {
            System.out.println(repeticionException.getMessage());
        }
        return repeticionesCaracter;
    }
}

