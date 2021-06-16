package src.tienda;

import src.clientes.VectorClientes;

public class Principal {

    public static void main(String[] args){
        Principal p = new Principal();
    }

    private VectorClientes vectorClientes = new VectorClientes();

    public Principal(){

        int menu = 0;

        while(menu >= 0){
            System.out.println("Bienvenido a memorabilia \n\n");
            System.out.println("1) Ingreso de clientes");
            System.out.println("-1) Salir");
            System.out.println("\n");
            menu = IngresoDatos.getEntero("Ingrese la opción ", true);

        }

    }

    
}
