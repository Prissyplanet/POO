public class Concepto {
    private String concepto;
    private String definicion;
    public Concepto(String concepto, String definicion) {
        this.concepto = concepto;
        this.definicion = definicion;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }
}
