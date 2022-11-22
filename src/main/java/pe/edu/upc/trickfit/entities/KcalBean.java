package pe.edu.upc.trickfit.entities;


public class KcalBean {
    private String idReceta_Alimento;
    private String tituloReceta;
    private String totalCal;
    public KcalBean() {
    }

    public KcalBean(String idReceta_Alimento, String tituloReceta, String totalCal) {
        this.idReceta_Alimento = idReceta_Alimento;
        this.tituloReceta = tituloReceta;
        this.totalCal = totalCal;
    }

    public String getIdReceta_Alimento() {
        return idReceta_Alimento;
    }

    public void setIdReceta_Alimento(String idReceta_Alimento) {
        this.idReceta_Alimento = idReceta_Alimento;
    }

    public String getTituloReceta() {
        return tituloReceta;
    }

    public void setTituloReceta(String tituloReceta) {
        this.tituloReceta = tituloReceta;
    }

    public String getTotalCal() {
        return totalCal;
    }

    public void setTotalCal(String totalCal) {
        this.totalCal = totalCal;
    }
}
