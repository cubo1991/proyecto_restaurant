
public class ArticuloManufacturado {

        private String descripcion;
        private int tiempoEstimadoMinutos;
        private String preparacion;


        public ArticuloManufacturado(String descripcion, int tiempoEstimadoMinutos, String preparacion) {
            this.descripcion = descripcion;
            this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
            this.preparacion = preparacion;
        }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getTiempoEstimadoMinutos() {
        return tiempoEstimadoMinutos;
    }

    public void setTiempoEstimadoMinutos(int tiempoEstimadoMinutos) {
        this.tiempoEstimadoMinutos = tiempoEstimadoMinutos;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }
}


