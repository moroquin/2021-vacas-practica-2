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
        siguienteCodigo++;
    }

    public void agregarCliente(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre del cliente");
        int telefono = IngresoDatos.getEntero("Ingrese el número de telefono", false);
        agregarCliente(nombre, telefono);
    }



    // fin agregar clientes

    public void mostrarClientes(){
        System.out.println("\n\n Clientes de memorabilia");
        for (int i = 0; i < (siguienteCodigo-1); i++) {
            System.out.println("-"+i+") "+clientes[i].getInformacion());
            //System.out.println("-"+i+") "+clientes[i].getId() + " nombre "+clientes[i].getNombre()+ " telefono "+clientes[i].getTelefono());
            
        }

        System.out.println("\n\n");
    }


    //Ordenamiento
    public void ordenarPorNombre(boolean ascendente){
        boolean cambio = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente)
                    cambio= (clientes[j].getNombre().compareTo(clientes[j+1].getNombre()) > 0 );
                else 
                    cambio= (clientes[j].getNombre().compareTo(clientes[j+1].getNombre()) < 0 );

                if(cambio ){
                    //clientes i va antes que clientes j <0 descendente
                    Cliente aux = clientes[j];
                    clientes[j] = clientes[j+1];
                    clientes[j+1]= aux;
                }
            }
        }

    }


    
}
