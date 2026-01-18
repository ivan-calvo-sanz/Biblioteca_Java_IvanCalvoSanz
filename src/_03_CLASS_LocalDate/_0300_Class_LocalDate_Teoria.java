package _03_CLASS_LocalDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class _0300_Class_LocalDate_Teoria {

    public static void main(String[] args) {

        /* ==========================
           CLASE LocalDate
           ==========================
           - Representa solo fecha (día, mes, año), sin hora.
           - Inmutable (los métodos devuelven nuevas instancias).
           - Parte del paquete java.time (Java 8+)
         */

 /* 
        TABLA RESUMEN CLASE LocalDate

        +-----------------------------+---------------------------------------------+------------------+
        |         MÉTODO              |                DESCRIPCIÓN                  |      DEVUELVE    |
        +-----------------------------+---------------------------------------------+------------------+
        | LocalDate.now()             | Fecha actual                                | LocalDate        |
        | LocalDate.of(año, m, d)     | Crear fecha específica                      | LocalDate        |
        | LocalDate.parse(str)        | Parsear String ISO yyyy-MM-dd               | LocalDate        |
        | getYear()                   | Devuelve año                                | int              |
        | getMonthValue()             | Devuelve mes 1-12                           | int              |
        | getDayOfMonth()             | Devuelve día del mes                        | int              |
        | plusDays(n)                 | Sumar días                                  | LocalDate        |
        | minusDays(n)                | Restar días                                 | LocalDate        |
        | plusWeeks(n)                | Sumar semanas                               | LocalDate        |
        | minusWeeks(n)               | Restar semanas                              | LocalDate        |
        | plusMonths(n)               | Sumar meses                                 | LocalDate        |
        | minusMonths(n)              | Restar meses                                | LocalDate        |
        | plusYears(n)                | Sumar años                                  | LocalDate        |
        | minusYears(n)               | Restar años                                 | LocalDate        |
        | isBefore(otraFecha)         | Compara si es anterior                      | boolean          |
        | isAfter(otraFecha)          | Compara si es posterior                     | boolean          |
        | isEqual(otraFecha)          | Compara si son iguales                      | boolean          |
        | format(DateTimeFormatter)   | Formatea fecha a String                     | String           |
        | ChronoUnit.DAYS.between(a,b)| Días entre dos fechas                       | long             |
        +-----------------------------+---------------------------------------------+------------------+
         */
        // ============================================================
        // LocalDate.now() - Fecha actual
        // ============================================================
        LocalDate hoy = LocalDate.now();
        System.out.println("Hoy: " + hoy);

        // ============================================================
        // LocalDate.of(año, mes, día) - Fecha específica
        // ============================================================
        LocalDate fechaFija = LocalDate.of(2026, 1, 16);
        System.out.println("Fecha fija: " + fechaFija);

        // ============================================================
        // LocalDate.parse("yyyy-MM-dd") - Parsear String ISO
        // ============================================================
        LocalDate parseada = LocalDate.parse("2026-01-16");
        System.out.println("Parseada: " + parseada);

        // ============================================================
        // getYear(), getMonthValue(), getDayOfMonth()
        // ============================================================
        System.out.println("Año: " + hoy.getYear());
        System.out.println("Mes: " + hoy.getMonthValue());
        System.out.println("Día: " + hoy.getDayOfMonth());

        // ============================================================
        // plusDays / minusDays / plusWeeks / minusWeeks / plusMonths / minusMonths / plusYears / minusYears
        // ============================================================
        LocalDate mañana = hoy.plusDays(1);
        LocalDate semanaPasada = hoy.minusWeeks(1);
        LocalDate dentroDeUnMes = hoy.plusMonths(1);
        LocalDate haceDosAños = hoy.minusYears(2);
        System.out.println("Mañana: " + mañana);
        System.out.println("Semana pasada: " + semanaPasada);
        System.out.println("Dentro de un mes: " + dentroDeUnMes);
        System.out.println("Hace dos años: " + haceDosAños);

        // ============================================================
        // Comparaciones: isBefore, isAfter, isEqual
        // ============================================================
        LocalDate otraFecha = LocalDate.of(2026, 12, 31);
        System.out.println("¿hoy es antes de otraFecha? " + hoy.isBefore(otraFecha));
        System.out.println("¿hoy es después de otraFecha? " + hoy.isAfter(otraFecha));
        System.out.println("¿hoy es igual a fechaFija? " + hoy.isEqual(fechaFija));

        // ============================================================
        // Formatear fecha
        // ============================================================
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = hoy.format(formatter);
        System.out.println("Hoy formateado: " + fechaFormateada);

        // ============================================================
        // Días entre fechas - ChronoUnit.DAYS.between
        // ============================================================
        long diasEntre = ChronoUnit.DAYS.between(hoy, otraFecha);
        System.out.println("Días entre hoy y otraFecha: " + diasEntre);

        // ============================================================
        // ChronoUnit - Operaciones avanzadas con fechas
        // ============================================================
        // Sumar usando ChronoUnit
        LocalDate dentroDe10Dias = hoy.plus(10, ChronoUnit.DAYS);
        LocalDate dentroDe3Semanas = hoy.plus(3, ChronoUnit.WEEKS);
        LocalDate dentroDe6Meses = hoy.plus(6, ChronoUnit.MONTHS);
        LocalDate dentroDe5Anios = hoy.plus(5, ChronoUnit.YEARS);

        System.out.println("Dentro de 10 días: " + dentroDe10Dias);
        System.out.println("Dentro de 3 semanas: " + dentroDe3Semanas);
        System.out.println("Dentro de 6 meses: " + dentroDe6Meses);
        System.out.println("Dentro de 5 años: " + dentroDe5Anios);

        // ============================================================
        // Restar usando ChronoUnit
        // ============================================================
        LocalDate hace15Dias = hoy.minus(15, ChronoUnit.DAYS);
        LocalDate hace2Meses = hoy.minus(2, ChronoUnit.MONTHS);
        LocalDate hace1Anio = hoy.minus(1, ChronoUnit.YEARS);

        System.out.println("Hace 15 días: " + hace15Dias);
        System.out.println("Hace 2 meses: " + hace2Meses);
        System.out.println("Hace 1 año: " + hace1Anio);

        // ============================================================
        // Diferencias entre fechas con ChronoUnit
        // ============================================================
        long dias = ChronoUnit.DAYS.between(hoy, otraFecha);
        long semanas = ChronoUnit.WEEKS.between(hoy, otraFecha);
        long meses = ChronoUnit.MONTHS.between(hoy, otraFecha);
        long anios = ChronoUnit.YEARS.between(hoy, otraFecha);

        System.out.println("Días entre fechas: " + dias);
        System.out.println("Semanas entre fechas: " + semanas);
        System.out.println("Meses entre fechas: " + meses);
        System.out.println("Años entre fechas: " + anios);
    }
}
