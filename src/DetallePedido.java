public class DetallePedido {
    private Integer cantidad;
    private Double subTotal;
    private Articulo articulo;
    private Promocion promocion;

    public DetallePedido(Integer cantidad, Articulo articulo) {
        this.cantidad = cantidad;
        this.articulo = articulo;
//        this.calcularSubtotal(); tiene que calcular precio x cantidad de cada insumo
        // calcularSubtotal();
            // una u otra.
    }

    public DetallePedido(Integer cantidad, Promocion promocion) {
        this.cantidad = cantidad;
        this.promocion = promocion;
//        this.calcularSubtotal(); tiene que poner precio x cantidad de la promo solita. mas facil.
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Articulo getArticulo() {
        return articulo;
    }

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;
    }

    @Override
    public String toString() {
        return "DetallePedido{" +
                "cantidad=" + cantidad +
                ", subTotal=" + subTotal +
                ", articulo=" + articulo +
                '}';
    }
}