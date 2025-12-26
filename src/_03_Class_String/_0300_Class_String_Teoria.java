package _03_Class_String;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_String_Teoria {

    public static void main(String[] args) {

        /* 
        TABLA RESUMEN CLASE String

        +-------------------------+-------------------------------------------+------------------------------+
        |        MÉTODO           |               DESCRIPCIÓN                 |           DEVUELVE           |
        +-------------------------+-------------------------------------------+------------------------------+
        | s.length()              | Longitud del string                       | int                          |
        | s.charAt(index)         | Carácter en la posición index             | char                         |
        | s.equals(otro)          | Compara contenido (sensible a mayúsculas) | boolean                      |
        | s.equalsIgnoreCase(otro)| Compara ignorando mayúsculas/minúsculas   | boolean                      |
        | s.concat(otro)          | Concatenar otro string                    | String                       |
        | s.substring(inicio,fin) | Subcadena desde inicio hasta fin-1        | String                       |
        | s.indexOf(c)            | Posición primera ocurrencia de c          | int (-1 si no existe)        |
        | s.lastIndexOf(c)        | Posición última ocurrencia de c           | int (-1 si no existe)        |
        | s.toUpperCase()         | Convertir a mayúsculas                    | String                       |
        | s.toLowerCase()         | Convertir a minúsculas                    | String                       |
        | s.trim()                | Quitar espacios al inicio y final         | String                       |
        | s.replace(a,b)          | Reemplaza a por b                         | String                       |
        | s.startsWith(prefijo)   | Comprueba prefijo                         | boolean                      |
        | s.endsWith(sufijo)      | Comprueba sufijo                          | boolean                      |
        | s.contains(sub)         | Comprueba si contiene subcadena           | boolean                      |
        | s.split(sep)            | Divide el string según separador          | String[]                     |
        +-------------------------+-------------------------------------------+------------------------------+
         */
        // ============================================================
        // length() - Longitud del string
        // ============================================================
        String texto = "Hola Mundo";
        int longitud = texto.length();
        System.out.println("texto.length() = " + longitud);

        // ============================================================
        // charAt(index) - Carácter en posición
        // ============================================================
        char caracter = texto.charAt(0);
        System.out.println("texto.charAt(0) = " + caracter);

        // ============================================================
        // equals() - Compara contenido
        // ============================================================
        boolean igual = texto.equals("Hola Mundo");
        System.out.println("texto.equals(\"Hola Mundo\") = " + igual);

        // ============================================================
        // equalsIgnoreCase() - Compara ignorando mayúsculas/minúsculas
        // ============================================================
        boolean igualIgnore = texto.equalsIgnoreCase("hola mundo");
        System.out.println("texto.equalsIgnoreCase(\"hola mundo\") = " + igualIgnore);

        // ============================================================
        // concat() - Concatenar strings
        // ============================================================
        String saludo = texto.concat("!!!");
        System.out.println("texto.concat(\"!!!\") = " + saludo);

        // ============================================================
        // substring(inicio, fin) - Subcadena
        // ============================================================
        String sub = texto.substring(5, 10);
        System.out.println("texto.substring(5,10) = " + sub);

        // ============================================================
        // indexOf(c) - Primera ocurrencia
        // ============================================================
        int pos = texto.indexOf('M');
        System.out.println("texto.indexOf('M') = " + pos);

        // ============================================================
        // lastIndexOf(c) - Última ocurrencia
        // ============================================================
        int posUlt = texto.lastIndexOf('o');
        System.out.println("texto.lastIndexOf('o') = " + posUlt);

        // ============================================================
        // toUpperCase() - Mayúsculas
        // ============================================================
        String mayus = texto.toUpperCase();
        System.out.println("texto.toUpperCase() = " + mayus);

        // ============================================================
        // toLowerCase() - Minúsculas
        // ============================================================
        String minus = texto.toLowerCase();
        System.out.println("texto.toLowerCase() = " + minus);

        // ============================================================
        // trim() - Quitar espacios al inicio y final
        // ============================================================
        String textoConEspacios = "   Hola   ";
        String textoTrim = textoConEspacios.trim();
        System.out.println("\"   Hola   \".trim() = \"" + textoTrim + "\"");

        // ============================================================
        // replace(a, b) - Reemplazar caracteres o subcadenas
        // ============================================================
        String reemplazo = texto.replace("Mundo", "Java");
        System.out.println("texto.replace(\"Mundo\",\"Java\") = " + reemplazo);

        // ============================================================
        // startsWith(prefijo) - Comprueba prefijo
        // ============================================================
        boolean empieza = texto.startsWith("Hola");
        System.out.println("texto.startsWith(\"Hola\") = " + empieza);

        // ============================================================
        // endsWith(sufijo) - Comprueba sufijo
        // ============================================================
        boolean termina = texto.endsWith("Mundo");
        System.out.println("texto.endsWith(\"Mundo\") = " + termina);

        // ============================================================
        // contains(sub) - Comprueba si contiene subcadena
        // ============================================================
        boolean contiene = texto.contains("la Mu");
        System.out.println("texto.contains(\"la Mu\") = " + contiene);

        // ============================================================
        // split(sep) - Dividir string
        // ============================================================
        String[] partes = texto.split(" ");
        System.out.println("texto.split(\" \") = [" + partes[0] + ", " + partes[1] + "]");
    }
}
