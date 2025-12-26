package _05_Enumerados;

// ============================================================
// Enum con atributos, constructor y métodos
// ============================================================
enum Color {

    ROJO("FF0000"),
    VERDE("00FF00"),
    AZUL("0000FF");

    ////////////////////////////////////////
    // ATRIBUTOS DEL ENUM
    ////////////////////////////////////////
    private String rgb;

    ////////////////////////////////////////
    // CONSTRUCTORES DEL ENUM
    ////////////////////////////////////////
    private Color(String rgb) {
        this.rgb = rgb;
    }

    ////////////////////////////////////////
    // GETTERS & SETTERS
    ////////////////////////////////////////
    public String getRgb() {
        return rgb;
    }

    public void setRgb(String rgb) {
        this.rgb = rgb;
    }

    ////////////////////////////////////////
    // METODO toString
    ////////////////////////////////////////
    @Override
    public String toString() {
        return "Color{" + "rgb=" + rgb + '}';
    }

}
