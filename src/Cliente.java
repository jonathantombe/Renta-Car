import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int codigo;
    private String dni;
    private String nombre;
    private String direccion;
    private String telefono;
    private Cliente avaladoPor;
    private List<Reserva> reservas;

    public Cliente(int codigo, String dni, String nombre, String direccion, String telefono, Cliente avaladoPor){
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.avaladoPor = avaladoPor;
        this.reservas = new ArrayList<>();
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getDni(){
        return dni;
    }

    public void setDni(String Dni){
        this.dni = Dni;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = this.nombre;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public String getTelefono(){
        return  telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public Cliente getAvaladoPor(){
        return avaladoPor;
    }

    public void setAvaladoPor(Cliente avaladoPor){
        this.avaladoPor = avaladoPor;
    }

    public void realizar(Reserva reserva){
        reservas.add(reserva);
        System.out.print("El cliente" + nombre + "ah realizado una opcion.");
    }
    public void calseldar(Reserva reserva){
        reservas.remove(reserva);
        System.out.print("El cliente" + nombre + "ah canselado una apcion");

    }
    public void listar(){
        System.out.print("se a listado la informacion para el cliente" + nombre + ".");
    }

    public void cancelar(Reserva reserva) {
        reservas.remove(reserva);
        System.out.println("Reserva cancelada por el cliente " + nombre);
    }

    public void Listar(){
        System.out.println("Listado de las reservas para el cliente" + nombre );
        for(Reserva reserva : reservas){
            System.out.println(reserva);
        }
    }

    public void actualizar(){
        System.out.print("");
    }

    public void consultar(){
        System.out.print("");
    }

    public String toString(){
        return "Cliente [codigo=" + codigo + ", dni=" + dni + ", nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", avaladoPor=" + (avaladoPor != null ? avaladoPor.getNombre() : "None") + "]";
    }




}
