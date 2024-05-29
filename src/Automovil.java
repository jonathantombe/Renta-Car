public class Automovil {
    private int id;
    private String matricula;
    private String modelo;
    private String color;
    private String marca;
    private Garaje garaje;



    public Automovil(int id, String matricula, String modelo, String color, String marca, Garaje garaje) {
        this.id = id;
        this.matricula = matricula;
        this.color = color;
        this.marca = marca;
        this.garaje = garaje;
        this.modelo = modelo;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getMatricula(){
        return matricula;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Garaje getGaraje(){
        return garaje;
    }
    public void setGaraje(Garaje garaje){
        this.garaje = garaje;
    }

    public void Asignar(){
        System.out.println("Automovil asignado al garaje.");
    }

    public void Actualizar(){
        System.out.println("informacion del movil actualizada.");
    }

    public void Eliminar(){
        System.out.println("Automovil eliminado.");
    }

    public void Consultar(){
        System.out.println("Informacion del auto movil consultada.");
    }

    @Override
    public String toString(){
        return "Automovil [id=" + id + ", matricula=" + matricula + ", modelo=" + modelo + ", color=" + color + ", marca=" + marca + ", garaje=" + garaje.getId ()+ "]";
    }


}
