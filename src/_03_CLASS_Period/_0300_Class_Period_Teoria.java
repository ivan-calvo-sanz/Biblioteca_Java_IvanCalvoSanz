package _03_CLASS_Period;

import java.time.LocalDate;
import java.time.Period;

public class _0300_Class_Period_Teoria {

    public static void main(String[] args) {

        /* ==========================
           CLASE Period
           ==========================
           - Representa un intervalo de tiempo en años, meses y días.
           - Inmutable (los métodos devuelven nuevas instancias).
           - No mide horas, minutos ni segundos.
         */

 /*
        TABLA RESUMEN CLASE Period

        +-----------------------+-------------------------------------------+------------------+
        |        MÉTODO         |                DESCRIPCIÓN                |      DEVUELVE    |
        +-----------------------+-------------------------------------------+------------------+
        | Period.ofYears(n)     | Crear periodo de n años                   | Period           |
        | Period.ofMonths(n)    | Crear periodo de n meses                  | Period           |
        | Period.ofDays(n)      | Crear periodo de n días                   | Period           |
        | Period.of(y,m,d)      | Crear periodo completo                    | Period           |
        | Period.between(a,b)   | Diferencia entre dos fechas               | Period           |
        | getYears()            | Devuelve años del periodo                 | int              |
        | getMonths()           | Devuelve meses del periodo                | int              |
        | getDays()             | Devuelve días del periodo                 | int              |
        | plusYears(n)          | Sumar años al periodo                     | Period           |
        | minusYears(n)         | Restar años al periodo                    | Period           |
        | plusMonths(n)         | Sumar meses al periodo                    | Period           |
        | minusMonths(n)        | Restar meses al periodo                   | Period           |
        | plusDays(n)           | Sumar días al periodo                     | Period           |
        | minusDays(n)          | Restar días al periodo                    | Period           |
        +-----------------------+-------------------------------------------+------------------+
         */
        // ============================================================
        // Crear Period
        // ============================================================
        Period p1 = Period.ofYears(2);
        Period p2 = Period.ofMonths(5);
        Period p3 = Period.ofDays(10);
        Period p4 = Period.of(1, 2, 15); // 1 año, 2 meses, 15 días

        System.out.println("Periodo 1 (años): " + p1);
        System.out.println("Periodo 2 (meses): " + p2);
        System.out.println("Periodo 3 (días): " + p3);
        System.out.println("Periodo 4 (y,m,d): " + p4);

        // ============================================================
        // Diferencia entre fechas - Period.between
        // ============================================================
        LocalDate fechaInicio = LocalDate.of(2020, 1, 1);
        LocalDate fechaFin = LocalDate.of(2023, 4, 10);

        Period diferencia = Period.between(fechaInicio, fechaFin);
        System.out.println("Diferencia entre " + fechaInicio + " y " + fechaFin + ": " + diferencia);
        System.out.println("Años: " + diferencia.getYears());
        System.out.println("Meses: " + diferencia.getMonths());
        System.out.println("Días: " + diferencia.getDays());

        // ============================================================
        // Operaciones con Period (suma y resta)
        // ============================================================
        Period periodo = Period.of(1, 6, 10); // 1 año, 6 meses, 10 días
        Period suma = periodo.plusYears(2).plusMonths(3).plusDays(5);
        Period resta = periodo.minusYears(1).minusMonths(2).minusDays(3);

        System.out.println("Periodo original: " + periodo);
        System.out.println("Suma de periodo: " + suma);
        System.out.println("Resta de periodo: " + resta);

        // ============================================================
        // Aplicar Period a una fecha
        // ============================================================
        LocalDate fecha = LocalDate.of(2025, 1, 16);

        LocalDate fechaMasPeriodo = fecha.plus(periodo);
        LocalDate fechaMenosPeriodo = fecha.minus(periodo);

        System.out.println("Fecha original: " + fecha);
        System.out.println("Fecha + periodo: " + fechaMasPeriodo);
        System.out.println("Fecha - periodo: " + fechaMenosPeriodo);

        // ============================================================
        // Combinación de Period con LocalDate (inmutable)
        // ============================================================
        LocalDate nuevaFecha = fecha.plus(Period.ofYears(2).plusMonths(3));
        System.out.println("Fecha + 2 años y 3 meses: " + nuevaFecha);
    }
}
