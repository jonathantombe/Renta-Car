import java.util.List;
import java.util.ArrayList;
public class Agencia {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private List<Reserva> reservas;

    public Agencia(int id,String nombre, String direccion, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.reservas = new ArrayList<>();
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;

    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public List<Reserva> getReservas(){
        return reservas;
    }

    public void Agregar(){
        System.out.println("Agencia agregada");
    }

    public void Eliminar(){
        System.out.println("Agencia eliminidad");
    }

    public void Listar(){
        System.out.println("Lista de agencias consultadas");
    }

    public void Actualizar(){
        System.out.println("Agencia actualizada");
    }

    public void Consultar(){
        System.out.println("Consultar agencia");
    }

    @Override
    public String toString(){
        return "Agencia [id=" + id + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + "]";
    }


}
