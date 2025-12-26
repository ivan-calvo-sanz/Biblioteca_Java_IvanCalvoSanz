package _05_Enumerados;

public class _0500_Enumerados_Teoia {

    // CONCEPTOS BASICOS ENUMERADOS
    /**
     * Son un tipo especial de clase que permite definir un conjunto de
     * constantes con nombre. Son muy útiles cuando una variable solo puede
     * tomar un número concreto de valores predefinidos (por ejemplo: días de la
     * semana, estados de un pedido, niveles de prioridad, etc.).
     */
    /**
     * NO se Instancián con la sentencia "new"
     */
    public static void main(String[] args) {

        /*
   TABLA RESUMEN ENUM (Java)

   +---------------------------+-------------------------------------------+------------------------------+
   |        ELEMENTO           |               DESCRIPCIÓN                 |           DEVUELVE           |
   +---------------------------+-------------------------------------------+------------------------------+
   | enum Nombre { A, B, C }   | Define un tipo con valores fijos          | tipo enum                    |
   | Nombre.A                  | Acceso a un valor del enum                | Nombre                       |
   | values()                  | Devuelve todos los valores del enum       | array de enum                |
   | valueOf("A")              | Convierte String en enum                  | enum                         |
   | name()                    | Nombre literal del enum                   | String                       |
   | ordinal()                 | Posición (empieza en 0)                   | int                          |
   | switch(enum)              | Uso del enum en switch                    | —                            |
   +---------------------------+-------------------------------------------+------------------------------+
         */
        // ============================================================
        // Uso básico de un enum
        // ============================================================
        Dia hoy = Dia.LUNES;
        System.out.println("Hoy es: " + hoy);

        // ============================================================
        // values() - recorrer todos los valores
        // ============================================================
        for (Dia d : Dia.values()) {
            System.out.println("Dia: " + d);
        }

        // ============================================================
        // valueOf(String) - convertir String a enum
        // ============================================================
        Dia diaConvertido = Dia.valueOf("MIERCOLES");
        System.out.println("valueOf(\"MIERCOLES\") = " + diaConvertido);

        // ============================================================
        // name() - nombre del enum
        // ============================================================
        System.out.println("name() = " + hoy.name());

        // ============================================================
        // ordinal() - posición del enum
        // ============================================================
        System.out.println("ordinal() = " + hoy.ordinal());

        // ============================================================
        // switch con enum
        // ============================================================
        switch (hoy) {
            case LUNES:
                System.out.println("Empieza la semana");
                break;
            case VIERNES:
                System.out.println("Fin de semana cerca");
                break;
            default:
                System.out.println("Día normal");
        }

        // ============================================================
        // Enum con atributos y métodos
        // ============================================================
        Color c = Color.ROJO;
        System.out.println("Color: " + c);
        System.out.println("Codigo RGB: " + c.getRgb());
    }
}
