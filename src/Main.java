public class Main {
    public static void main(String[] args) {
        // Tomas

        ArticuloInsumo articuloInsumo1 = new ArticuloInsumo("Quilmes 1L", 5000,
                2500, 100, 150,false);

        ArticuloInsumo articuloInsumo2 = new ArticuloInsumo("Pizza Especial", 15000,
                7500, 100, 150,true);

        ArticuloManufacturadoDetalle articuloManufacturadoDetalle1 = new ArticuloManufacturadoDetalle(1);

        ArticuloManufacturadoDetalle articuloManufacturadoDetalle2 = new ArticuloManufacturadoDetalle(2);

        DetallePedido detallePedido1 = new DetallePedido(1,0.0);

        DetallePedido detallePedido2 = new DetallePedido(2, 0.0);

        Categoria categoria1 = new Categoria("Empanizados");

        Categoria subcategoria1 = new Categoria("Pizzas");

        Categoria categoria2 = new Categoria("Bebidas");

        Categoria subcategoria2 = new Categoria("Cervezas");

        Categoria subcategoria3 = new Categoria("Gaseosas");

        Categoria subcategoria4 = new Categoria("Lomos");

        articuloManufacturadoDetalle1.setArticuloInsumo(articuloInsumo1);

        articuloManufacturadoDetalle2.setArticuloInsumo(articuloInsumo2);

        detallePedido1.setArticulo(articuloInsumo1);

        detallePedido2.setArticulo(articuloInsumo2);

        // agrego pizzas y lomos a empanizados
        categoria1.agregarSubcategoria(subcategoria1);
        categoria1.agregarSubcategoria(subcategoria4);

        // agrego cervezas y gaseosas a bebidas
        categoria2.agregarSubcategoria(subcategoria2);
        categoria2.agregarSubcategoria(subcategoria3);

        // agrego Pizza Especial a pizzas
        subcategoria1.agregarArticulo(articuloInsumo2);

        // agrego Quilmes 1L a cervezas
        subcategoria2.agregarArticulo(articuloInsumo1);

        // imprimo el detalle de un articulo manufacturado y el articulo manufacturado asociado
        // (detalle de Quilmes)
//        System.out.println(articuloManufacturadoDetalle1);

        // imprimo detalle de un pedido y el articulo asociado
        // pedido1 - quilmes
        // A CONSULTAR: como calcular subtotal
//        System.out.println(detallePedido1);

        // imprimo categoria empanizados. muestra subcategoria lomos y pizzas. pizzas tiene pizza especial y 0 subcategorias
        // A CONSULTAR: pizza especial deberia ser un articulo de empanizados?
//        System.out.println(categoria1);
/// //////////////////////////////////////////////////////////////////////
    }
}