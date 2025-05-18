import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

public class Sucursal {

    private String nombre;
    private LocalTime horarioApertura;
    private LocalTime horarioCierre;

    private Empresa empresa;
    private Set<Promocion> promociones = new HashSet<>();
    private Set<ArticuloManufacturado> articuloManufacturados = new HashSet<>();

    public Sucursal (String nombre, LocalTime horarioApertura, LocalTime horarioCierre) {
        this.nombre = nombre;
        this.horarioApertura = horarioApertura;
        this.horarioCierre = horarioCierre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getHorarioApertura() {
        return horarioApertura;
    }

    public void setHorarioApertura(LocalTime horarioApertura) {
        this.horarioApertura = horarioApertura;
    }

    public LocalTime getHorarioCierre() {
        return horarioCierre;
    }

    public void setHorarioCierre(LocalTime horarioCierre) {
        this.horarioCierre = horarioCierre;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public void addPromocion (Promocion promocion){
        this.promociones.add(promocion);
    }

    public Set<ArticuloManufacturado> getArticuloManufacturados(){
        return articuloManufacturados;
    }

    public void addArticuloManufacturado(ArticuloManufacturado articulo){
        this.articuloManufacturados.add(articulo);
    }
}