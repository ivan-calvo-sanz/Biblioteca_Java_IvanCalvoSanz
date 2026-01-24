package _03_CLASS_Duration;

import java.time.Duration;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class _0300_Class_Duration_Teoria {

    public static void main(String[] args) {

        /* ==========================
           CLASE Duration
           ==========================
           - Representa un intervalo de tiempo en horas, minutos, segundos y nanosegundos.
           - Inmutable (los métodos devuelven nuevas instancias).
           - Ideal para medir tiempo exacto, temporizadores, cronómetros.
         */

 /*
        TABLA RESUMEN CLASE Duration

        +------------------------+-------------------------------------------+------------------+
        |        MÉTODO          |                DESCRIPCIÓN                |      DEVUELVE    |
        +------------------------+-------------------------------------------+------------------+
        | Duration.ofHours(n)    | Crear duración en horas                   | Duration         |
        | Duration.ofMinutes(n)  | Crear duración en minutos                 | Duration         |
        | Duration.ofSeconds(n)  | Crear duración en segundos                | Duration         |
        | Duration.ofMillis(n)   | Crear duración en milisegundos            | Duration         |
        | Duration.ofNanos(n)    | Crear duración en nanosegundos            | Duration         |
        | Duration.between(a,b)  | Diferencia entre dos instantes            | Duration         |
        | plusHours(n)           | Sumar horas al duration                   | Duration         |
        | minusHours(n)          | Restar horas al duration                  | Duration         |
        | plusMinutes(n)         | Sumar minutos                             | Duration         |
        | minusMinutes(n)        | Restar minutos                            | Duration         |
        | plusSeconds(n)         | Sumar segundos                            | Duration         |
        | minusSeconds(n)        | Restar segundos                           | Duration         |
        | toHours()              | Convertir duración a horas                | long             |
        | toMinutes()            | Convertir duración a minutos              | long             |
        | toSeconds()            | Convertir duración a segundos             | long             |
        +------------------------+-------------------------------------------+------------------+
         */
        // ============================================================
        // Crear Durations
        // ============================================================
        Duration d1 = Duration.ofHours(2);
        Duration d2 = Duration.ofMinutes(30);
        Duration d3 = Duration.ofSeconds(45);
        Duration d4 = Duration.ofMillis(500);
        Duration d5 = Duration.ofNanos(1000);

        System.out.println("Duración 1 (2 horas): " + d1);
        System.out.println("Duración 2 (30 minutos): " + d2);
        System.out.println("Duración 3 (45 segundos): " + d3);
        System.out.println("Duración 4 (500 ms): " + d4);
        System.out.println("Duración 5 (1000 nanos): " + d5);

        // ============================================================
        // Duración entre dos horas LocalTime
        // ============================================================
        LocalTime inicio = LocalTime.of(8, 0);
        LocalTime fin = LocalTime.of(10, 30);

        Duration entreHoras = Duration.between(inicio, fin);
        System.out.println("Duración entre " + inicio + " y " + fin + ": " + entreHoras);
        System.out.println("Horas: " + entreHoras.toHours());
        System.out.println("Minutos: " + entreHoras.toMinutes());
        System.out.println("Segundos: " + entreHoras.toSeconds());

        // ============================================================
        // Duración entre dos LocalDateTime
        // ============================================================
        LocalDateTime dtInicio = LocalDateTime.of(2026, 1, 16, 8, 0);
        LocalDateTime dtFin = LocalDateTime.of(2026, 1, 16, 12, 45);

        Duration entreDateTime = Duration.between(dtInicio, dtFin);
        System.out.println("Duración entre " + dtInicio + " y " + dtFin + ": " + entreDateTime);
        System.out.println("Horas: " + entreDateTime.toHours());
        System.out.println("Minutos: " + entreDateTime.toMinutes());
        System.out.println("Segundos: " + entreDateTime.toSeconds());

        // ============================================================
        // Operaciones con Duration (suma y resta)
        // ============================================================
        Duration duracion = Duration.ofHours(3).plusMinutes(20);
        Duration suma = duracion.plusMinutes(40).plusSeconds(30);
        Duration resta = duracion.minusHours(1).minusMinutes(15);

        System.out.println("Duración original: " + duracion);
        System.out.println("Suma de duración: " + suma);
        System.out.println("Resta de duración: " + resta);

        // ============================================================
        // Conversión de Duration
        // ============================================================
        System.out.println("Duración original en horas: " + duracion.toHours());
        System.out.println("Duración original en minutos: " + duracion.toMinutes());
        System.out.println("Duración original en segundos: " + duracion.toSeconds());
    }
}
