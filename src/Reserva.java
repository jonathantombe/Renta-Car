import java.util.Date;

public class Reserva {
    private int id;
    private Date fechaInicio;
    private Date fechaFin;
    private float precioTotal;
    private boolean entregado;
    private Cliente cliente;
    private Agencia agencia;

    public Reserva(int id, Date fechaInicio, Date fechaFin, float precioTotal, boolean entregado, Cliente cliente, Agencia agencia){
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precioTotal = precioTotal;
        this.entregado = entregado;
        this.cliente = cliente;
        this.agencia = agencia;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Date getFechaInicio(){
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin(){
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin){
        this.fechaFin = fechaFin;
    }

    public float getPrecioTotal(){
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal){
        this.precioTotal = precioTotal;
    }

    public boolean isEntregado(){
        return entregado;
    }

    public void setEntregado(boolean entregado){
        this.entregado = entregado;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Agencia getAgencia(){
        return agencia;
    }

    public void setAgencia(Agencia agencia){
        this.agencia = agencia;
    }

    @Override
    public String toString(){
        return "Reserva{" + "id=" + id + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", precioTotal=" + precioTotal + ", entregado=" + entregado + ", cliente=" +  cliente.getNombre() + ", agencia=" +  agencia.getNombre() + '}';

    }

    public void Agregar(){
        System.out.print("Reserva agregada");
    }
    public void Eliminar(){
        System.out.print("Reserva eliminada");
    }
    public void Calcular(){
        System.out.print("Costo total calculado");
    }
    public void Actualizar(){
        System.out.print("reserva actualizada");
    }

    public void Consultar(){
        System.out.println("consultar serva");
    }

}