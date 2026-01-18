package _03_CLASS_LocalTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _0300_Class_LocalTime_Teoria {

    public static void main(String[] args) {

        /* ==========================
           CLASE LocalTime
           ==========================
           - Representa solo hora (HH:mm:ss.nanos) sin fecha.
           - Inmutable (una vez creado el objeto, NO se puede modificar)
         */

 /*
        TABLA RESUMEN CLASE LocalTime

        +-----------------------------+---------------------------------------------+------------------+
        |           MÉTODO            |                DESCRIPCIÓN                  |     DEVUELVE     |
        +-----------------------------+---------------------------------------------+------------------+
        | LocalTime.now()             | Hora actual                                 | LocalTime        |
        | LocalTime.of(h, m)          | Crear hora específica                       | LocalTime        |
        | LocalTime.of(h, m, s)       | Crear hora con segundos                     | LocalTime        |
        | LocalTime.parse(str)        | Parsear String ISO HH:mm:ss                 | LocalTime        |
        | getHour()                   | Devuelve hora                               | int              |
        | getMinute()                 | Devuelve minuto                             | int              |
        | getSecond()                 | Devuelve segundo                            | int              |
        | plusHours(n)                | Sumar horas                                 | LocalTime        |
        | minusHours(n)               | Restar horas                                | LocalTime        |
        | plusMinutes(n)              | Sumar minutos                               | LocalTime        |
        | minusMinutes(n)             | Restar minutos                              | LocalTime        |
        | plusSeconds(n)              | Sumar segundos                              | LocalTime        |
        | minusSeconds(n)             | Restar segundos                             | LocalTime        |
        | withHour(h)                 | Cambiar solo la hora                        | LocalTime        |
        | withMinute(m)               | Cambiar solo los minutos                    | LocalTime        |
        | withSecond(s)               | Cambiar solo los segundos                   | LocalTime        |
        | withNano(n)                 | Cambiar nanosegundos                        | LocalTime        |
        | isBefore(otraHora)          | Compara si es anterior                      | boolean          |
        | isAfter(otraHora)           | Compara si es posterior                     | boolean          |
        | isEqual(otraHora)           | Compara si son iguales                      | boolean          |
        | format(DateTimeFormatter)   | Formatea hora a String                      | String           |
        | ChronoUnit.X.between(a,b)   | Diferencia entre horas                      | long             |
        +-----------------------------+---------------------------------------------+------------------+
         */
        // ============================================================
        // LocalTime.now() - Hora actual
        // ============================================================
        LocalTime ahora = LocalTime.now();
        System.out.println("Ahora: " + ahora);

        // ============================================================
        // LocalTime.of() - Hora específica
        // ============================================================
        LocalTime horaFija = LocalTime.of(14, 30);
        LocalTime horaConSegundos = LocalTime.of(8, 15, 45);
        System.out.println("Hora fija: " + horaFija);
        System.out.println("Hora con segundos: " + horaConSegundos);

        // ============================================================
        // LocalTime.parse("HH:mm:ss") - Parsear String ISO
        // ============================================================
        LocalTime parseada = LocalTime.parse("21:45:30");
        System.out.println("Hora parseada: " + parseada);

        // ============================================================
        // getHour(), getMinute(), getSecond()
        // ============================================================
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minuto: " + ahora.getMinute());
        System.out.println("Segundo: " + ahora.getSecond());

        // ============================================================
        // plus / minus (horas, minutos, segundos)
        // ============================================================
        LocalTime dentroDe2Horas = ahora.plusHours(2);
        LocalTime hace30Min = ahora.minusMinutes(30);
        LocalTime dentroDe45Seg = ahora.plusSeconds(45);

        System.out.println("Dentro de 2 horas: " + dentroDe2Horas);
        System.out.println("Hace 30 minutos: " + hace30Min);
        System.out.println("Dentro de 45 segundos: " + dentroDe45Seg);

        // ============================================================
        // withXxx() - Modificar campos (INMUTABLE)
        // ============================================================
        LocalTime horaBase = LocalTime.of(10, 15, 30);

        // Cambia SOLO la hora (minutos y segundos se mantienen)
        LocalTime cambioHora = horaBase.withHour(18);

        // Cambia SOLO los minutos
        LocalTime cambioMinuto = horaBase.withMinute(45);

        // Cambia SOLO los segundos
        LocalTime cambioSegundo = horaBase.withSecond(5);

        // Cambia SOLO los nanosegundos
        LocalTime cambioNano = horaBase.withNano(0);

        System.out.println("Hora base:        " + horaBase);
        System.out.println("Cambio de hora:   " + cambioHora);
        System.out.println("Cambio de minuto: " + cambioMinuto);
        System.out.println("Cambio de segundo:" + cambioSegundo);
        System.out.println("Cambio de nano:   " + cambioNano);

        // Encadenando withXxx()
        LocalTime horaRedondeada = horaBase
                .withHour(8)
                .withMinute(0)
                .withSecond(0)
                .withNano(0);

        System.out.println("Hora redondeada:  " + horaRedondeada);

        // ============================================================
        // Comparaciones
        // ============================================================
        LocalTime otraHora = LocalTime.of(23, 0);
        System.out.println("¿ahora es antes de otraHora? " + ahora.isBefore(otraHora));
        System.out.println("¿ahora es después de otraHora? " + ahora.isAfter(otraHora));

        // ============================================================
        // Formatear hora
        // ============================================================
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaFormateada = ahora.format(formatter);
        System.out.println("Hora formateada: " + horaFormateada);

        // ============================================================
        // ChronoUnit - Operaciones avanzadas con horas
        // ============================================================
        LocalTime dentroDe90Min = ahora.plus(90, ChronoUnit.MINUTES);
        LocalTime hace3Horas = ahora.minus(3, ChronoUnit.HOURS);

        System.out.println("Dentro de 90 minutos: " + dentroDe90Min);
        System.out.println("Hace 3 horas: " + hace3Horas);

        // ============================================================
        // Diferencias entre horas con ChronoUnit
        // ============================================================
        long horas = ChronoUnit.HOURS.between(ahora, otraHora);
        long minutos = ChronoUnit.MINUTES.between(ahora, otraHora);
        long segundos = ChronoUnit.SECONDS.between(ahora, otraHora);

        System.out.println("Horas entre horas: " + horas);
        System.out.println("Minutos entre horas: " + minutos);
        System.out.println("Segundos entre horas: " + segundos);
    }
}
