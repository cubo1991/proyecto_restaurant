import java.util.HashSet;
import java.util.Set;

public class Empresa {

    private String nombre;
    private String razonSocial;
    private int cuil;
    private Set<Sucursal> sucursales = new HashSet<>();

    public Empresa (String nombre, String razonSocial, int Cuil) {

        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cuil = Cuil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public Set<Sucursal> getSucursales() {
        return sucursales;
    }

    public void addSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);

    }

    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", razonSocial='" + razonSocial + '\'' +
                ", cuil=" + cuil +
                ", sucursales=" + sucursales +
                '}';
    }
}