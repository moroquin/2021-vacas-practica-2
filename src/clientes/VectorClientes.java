package src.clientes;

import src.tienda.*;

public class VectorClientes {
    private Cliente[] clientes = new Cliente[50];
    private int siguienteCodigo;

    public VectorClientes(){
        siguienteCodigo = 1;
    }

    //agregar clientes
    public void agregarCliente(String nombre, int telefono){
        if (siguienteCodigo > 50){
            System.out.println("Límite de clientes alcanzado");
        }
        else{
            clientes[(siguienteCodigo-1)] = new Cliente(siguienteCodigo, nombre, telefono);
        }
    }

    public void agregarCliente(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre del cliente");
        int telefono = IngresoDatos.getEntero("Ingrese el número de telefono", false);
        agregarCliente(nombre, telefono);
    }



    // fin agregar clientes

    public void mostrarClientes(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < siguienteCodigo; i++) {
            System.out.println("-"+i+") "+clientes[i].getInformacion());
            
        }

        System.out.println("\n\n");
    }

    
}
