package src.clientes;

/**
 * Cliente
 */
public class Cliente {
    private int id;
    private String nombre;
    private int telefono;

    public Cliente(int id, String nombre, int telefono){
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Cliente(int id, String nombre){
        this(id, nombre, 0);
    }

    //getters y setters

    public int getId(){
        return id;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;
    }



    //fin getters y setters
    
}