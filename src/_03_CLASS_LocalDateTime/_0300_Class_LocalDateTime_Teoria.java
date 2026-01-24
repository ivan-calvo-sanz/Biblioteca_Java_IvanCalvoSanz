package _03_CLASS_LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _0300_Class_LocalDateTime_Teoria {

    public static void main(String[] args) {

        /* ==========================
           CLASE LocalDateTime
           ==========================
           - Representa fecha + hora (yyyy-MM-ddTHH:mm:ss.nanos)
           - NO tiene zona horaria
           - Inmutable (no se puede modificar el objeto original)
         */

 /*
        TABLA RESUMEN CLASE LocalDateTime

        +----------------------------------+---------------------------------------------+------------------+
        |             MÉTODO               |                DESCRIPCIÓN                  |     DEVUELVE     |
        +----------------------------------+---------------------------------------------+------------------+
        | LocalDateTime.now()              | Fecha y hora actual                         | LocalDateTime    |
        | LocalDateTime.of(...)            | Crear fecha y hora específica               | LocalDateTime    |
        | LocalDateTime.parse(str)         | Parsear String ISO                          | LocalDateTime    |
        | getYear()                        | Devuelve año                                | int              |
        | getMonthValue()                  | Devuelve mes (1-12)                         | int              |
        | getDayOfMonth()                  | Devuelve día del mes                        | int              |
        | getHour()                        | Devuelve hora                               | int              |
        | getMinute()                      | Devuelve minuto                             | int              |
        | getSecond()                      | Devuelve segundo                            | int              |
        | plusXxx() / minusXxx()           | Sumar / restar tiempo                       | LocalDateTime    |
        | withXxx()                        | Cambiar campo concreto                      | LocalDateTime    |
        | isBefore(otro)                   | Comprueba si es anterior                    | boolean          |
        | isAfter(otro)                    | Comprueba si es posterior                   | boolean          |
        | isEqual(otro)                    | Comprueba si es igual                       | boolean          |
        | format(DateTimeFormatter)        | Formatea a String                           | String           |
        | ChronoUnit.X.between(a,b)        | Diferencia entre fechas/horas               | long             |
        +----------------------------------+---------------------------------------------+------------------+
         */
        // ============================================================
        // LocalDateTime.now() - Fecha y hora actual
        // ============================================================
        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Ahora: " + ahora);

        // Obtener SOLO la fecha (LocalDate)
        LocalDate ahoraSoloFecha = ahora.toLocalDate();
        System.out.println("Fecha (sin hora): " + ahoraSoloFecha);

        // Obtener SOLO la hora (LocalTime)
        LocalTime ahoraSoloHora = ahora.toLocalTime();
        System.out.println("Hora (sin fecha): " + ahoraSoloHora);

        // ============================================================
        // LocalDateTime.of() - Fecha y hora específica
        // ============================================================
        LocalDateTime fechaHoraFija = LocalDateTime.of(2026, 3, 15, 14, 30, 45);
        System.out.println("Fecha y hora fija: " + fechaHoraFija);

        // ============================================================
        // LocalDateTime.parse() - Parsear String ISO
        // ============================================================
        LocalDateTime parseada = LocalDateTime.parse("2026-03-15T10:15:30");
        System.out.println("Fecha y hora parseada: " + parseada);

        // ============================================================
        // Getters
        // ============================================================
        System.out.println("Año: " + ahora.getYear());
        System.out.println("Mes: " + ahora.getMonthValue());
        System.out.println("Día: " + ahora.getDayOfMonth());
        System.out.println("Hora: " + ahora.getHour());
        System.out.println("Minuto: " + ahora.getMinute());
        System.out.println("Segundo: " + ahora.getSecond());

        // ============================================================
        // plus / minus (fecha y hora)
        // ============================================================
        LocalDateTime dentroDe2Dias = ahora.plusDays(2);
        LocalDateTime hace3Horas = ahora.minusHours(3);
        LocalDateTime dentroDe90Min = ahora.plusMinutes(90);

        System.out.println("Dentro de 2 días: " + dentroDe2Dias);
        System.out.println("Hace 3 horas: " + hace3Horas);
        System.out.println("Dentro de 90 minutos: " + dentroDe90Min);

        // ============================================================
        // withXxx() - Modificar campos (INMUTABLE)
        // ============================================================
        LocalDateTime base = LocalDateTime.of(2026, 5, 10, 12, 45, 30);

        LocalDateTime cambioFecha = base.withDayOfMonth(1);
        LocalDateTime cambioHora = base.withHour(8);
        LocalDateTime cambioMinuto = base.withMinute(0);
        LocalDateTime cambioSegundo = base.withSecond(0);

        System.out.println("Base:           " + base);
        System.out.println("Cambio fecha:   " + cambioFecha);
        System.out.println("Cambio hora:    " + cambioHora);
        System.out.println("Cambio minuto:  " + cambioMinuto);
        System.out.println("Cambio segundo: " + cambioSegundo);

        // ============================================================
        // Comparaciones
        // ============================================================
        LocalDateTime futuro = ahora.plusDays(1);

        System.out.println("¿ahora es antes? " + ahora.isBefore(futuro));
        System.out.println("¿ahora es después? " + ahora.isAfter(futuro));
        System.out.println("¿son iguales? " + ahora.isEqual(futuro));

        // ============================================================
        // Formatear LocalDateTime
        // ============================================================
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String formateado = ahora.format(formatter);
        System.out.println("Formateado: " + formateado);

        // ============================================================
        // ChronoUnit - Diferencias entre fechas/horas
        // ============================================================
        long dias = ChronoUnit.DAYS.between(ahora, futuro);
        long horas = ChronoUnit.HOURS.between(ahora, futuro);
        long minutos = ChronoUnit.MINUTES.between(ahora, futuro);

        System.out.println("Días entre fechas: " + dias);
        System.out.println("Horas entre fechas: " + horas);
        System.out.println("Minutos entre fechas: " + minutos);
    }
}
