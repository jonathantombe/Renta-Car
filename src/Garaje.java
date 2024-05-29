public class Garaje {
    private int id;
    private String direccion;
    private int capacidad;

    public Garaje(int id, String direccion, int capacidad){
        this.id = id;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getDireccion(){
        return direccion;
    }

    public void setDireccion(String direccion){
        this.direccion = direccion;
    }

    public int getCapcidad(){
        return capacidad;
    }

    public void setCapacidad(int capacidad){
        this.capacidad = capacidad;
    }

    public void Asignar(){
        System.out.println("Automovil asignado al garaje");
    }

    public void Eliminar(){
        System.out.println("Garaje eliminado");
    }

    public void Actualizar(){
        System.out.println("informacion del garaje actualizada");
    }

    public void Consultar(){
        System.out.println("informacion del garaje consultada");
    }

    @Override
    public String toString() {
        return "Garaje [id=" + id + ", direccion=" + direccion + ", capacidad=" + capacidad + "]";
    }
}
