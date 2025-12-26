package _03_Class_Math;

/**
 *
 * @author Iván Calvo Sanz
 *
 */
public class _0300_Class_Math_Teoria {

    public static void main(String[] args) {

        /* 
   TABLA RESUMEN CLASE Math

   +-------------------------+-------------------------------------------+------------------------------+
   |        MÉTODO           |               DESCRIPCIÓN                 |           DEVUELVE           |
   +-------------------------+-------------------------------------------+------------------------------+
   | Math.sqrt(x)            | Raíz cuadrada                             | double                       |
   | Math.pow(a, b)          | a elevado a b                             | double                       |
   | Math.abs(x)             | Valor absoluto                            | mismo tipo (int/double/...)  |
   | Math.max(a, b)          | Máximo entre dos valores                  | mismo tipo                   |
   | Math.min(a, b)          | Mínimo entre dos valores                  | mismo tipo                   |
   | Math.round(x)           | Redondeo al entero más cercano            | long (double) / int (float)  |
   | Math.floor(x)           | Redondeo hacia abajo                      | double                       |
   | Math.ceil(x)            | Redondeo hacia arriba                     | double                       |
   | Math.random()           | Aleatorio entre 0 y 1                     | double                       |
   |(int)(Math.random()*n)   | Aleatorio entre 0 y n-1                   | int                          |
   | Math.sin(x)             | Seno (radianes)                           | double                       |
   | Math.cos(x)             | Coseno (radianes)                         | double                       |
   | Math.tan(x)             | Tangente (radianes)                       | double                       |
   | Math.exp(x)             | e elevado a x                             | double                       |
   | Math.log(x)             | Logaritmo natural (ln)                    | double                       |
   | Math.log10(x)           | Logaritmo base 10                         | double                       |
   +-------------------------+-------------------------------------------+------------------------------+

   +-----------+------------------------------+-----------+
   | CONSTANTE |        DESCRIPCIÓN           | DEVUELVE  |
   +-----------+------------------------------+-----------+
   | Math.PI   | Valor de π                   | double    |
   | Math.E    | Número e                     | double    |
   +-----------+------------------------------+-----------+
         */
        // ============================================================
        // Math.sqrt(x) - Raíz cuadrada
        // ============================================================
        double ejemploSqrt = Math.sqrt(9);
        System.out.println("Math.sqrt(9) = " + ejemploSqrt);

        // ============================================================
        // Math.pow(a, b) - Potencia
        // ============================================================
        double ejemploPow = Math.pow(2, 3);
        System.out.println("Math.pow(2,3) = " + ejemploPow);

        // ============================================================
        // Math.abs(x) - Valor absoluto
        // ============================================================
        int ejemploAbs = Math.abs(-7);
        System.out.println("Math.abs(-7) = " + ejemploAbs);

        // ============================================================
        // Math.max(a, b) - Máximo
        // ============================================================
        int ejemploMax = Math.max(10, 25);
        System.out.println("Math.max(10,25) = " + ejemploMax);

        // ============================================================
        // Math.min(a, b) - Mínimo
        // ============================================================
        int ejemploMin = Math.min(10, 25);
        System.out.println("Math.min(10,25) = " + ejemploMin);

        // ============================================================
        // Math.round(x) - Redondeo al entero más cercano
        // ============================================================
        long ejemploRound1 = Math.round(4.6);
        int ejemploRound2 = Math.round(4.3f);
        System.out.println("Math.round(4.6) = " + ejemploRound1);
        System.out.println("Math.round(4.3f) = " + ejemploRound2);

        // ============================================================
        // Math.floor(x) - Redondeo hacia abajo
        // ============================================================
        double ejemploFloor = Math.floor(4.9);
        System.out.println("Math.floor(4.9) = " + ejemploFloor);

        // ============================================================
        // Math.ceil(x) - Redondeo hacia arriba
        // ============================================================
        double ejemploCeil = Math.ceil(4.1);
        System.out.println("Math.ceil(4.1) = " + ejemploCeil);

        // ============================================================
        // Math.random() - Aleatorio entre 0 y 1
        // ============================================================
        double ejemploRandom = Math.random();
        System.out.println("Math.random() = " + ejemploRandom);

        // ============================================================
        // (int)(Math.random()*n) - Aleatorio entre 0 y n-1
        // ============================================================
        int ejemploRandomInt = (int) (Math.random() * 10);
        System.out.println("(int)(Math.random()*10) = " + ejemploRandomInt);

        // ============================================================
        // Math.sin(x) - Seno
        // ============================================================
        double ejemploSin = Math.sin(Math.PI / 2);
        System.out.println("Math.sin(PI/2) = " + ejemploSin);

        // ============================================================
        // Math.cos(x) - Coseno
        // ============================================================
        double ejemploCos = Math.cos(0);
        System.out.println("Math.cos(0) = " + ejemploCos);

        // ============================================================
        // Math.tan(x) - Tangente
        // ============================================================
        double ejemploTan = Math.tan(Math.PI / 4);
        System.out.println("Math.tan(PI/4) = " + ejemploTan);

        // ============================================================
        // Math.exp(x) - e elevado a x
        // ============================================================
        double ejemploExp = Math.exp(1);
        System.out.println("Math.exp(1) = " + ejemploExp);

        // ============================================================
        // Math.log(x) - Logaritmo natural
        // ============================================================
        double ejemploLog = Math.log(10);
        System.out.println("Math.log(10) = " + ejemploLog);

        // ============================================================
        // Math.log10(x) - Logaritmo base 10
        // ============================================================
        double ejemploLog10 = Math.log10(100);
        System.out.println("Math.log10(100) = " + ejemploLog10);

        // ============================================================
        // Math.PI - Constante PI
        // ============================================================
        double ejemploPI = Math.PI;
        System.out.println("Math.PI = " + ejemploPI);

        // ============================================================
        // Math.E - Constante e
        // ============================================================
        double ejemploE = Math.E;
        System.out.println("Math.E = " + ejemploE);
    }
}
