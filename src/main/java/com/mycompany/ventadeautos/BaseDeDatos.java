package com.mycompany.ventadeautos;

import java.util.Scanner;

public class BaseDeDatos {

    Scanner entrada = new Scanner(System.in);
    Cliente[] nuevoCliente = new Cliente[10];

    public void inicio() {
        while (true) {
            System.out.println("---------Menu principal---------");
            System.out.println("1) Agregar cliente");
            System.out.println("2) Imprimir cliente");
            System.out.println("3) Modificar cliente");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    AgregarCliente();
                    break;
                case 2:
                    imprimirCliente();
                    break;
            }
        }
    }

    public void AgregarCliente() {

        while (true) {
            Auto[] coche = new Auto[20];
            System.out.println("Ingrese los datos del cliente: ");
            System.out.println("");

            System.out.println("Nombre: ");
            String nombre = entrada.nextLine();
            System.out.println("direccion: ");
            String direccion = entrada.nextLine();
            System.out.println("edad: ");
            int edad = entrada.nextInt();
            entrada.nextLine();

            while (true) {

                System.out.println("Datos del auto: ");
                System.out.println("");

                System.out.println("Ingrese el id: ");
                String id = entrada.nextLine();
                System.out.println("Ingrese la marca: ");
                String marca = entrada.nextLine();
                System.out.println("Ingrese el modelo: ");
                String modelo = entrada.nextLine();
                System.out.println("Ingrese el año del auto: ");
                String año = entrada.nextLine();
                System.out.println("Ingrese el tipo");
                String tipo = entrada.nextLine();
                System.out.println("");

                Auto nuevo = new Auto(id, marca, modelo, año, tipo);

                for (int i = 0; i < coche.length; i++) {
                    if (coche[i] == null) {
                        coche[i] = nuevo;
                        break;
                    }
                }

                System.out.println("Desea agregar otro auto:");
                System.out.println("1) si 0 2) no");
                int opcionAuto = entrada.nextInt();
                entrada.nextLine();

                if (opcionAuto == 2) {
                    break;
                }
            }

            Cliente nuevoClientes = new Cliente(nombre, direccion, edad, coche);

            for (int i = 0; i < nuevoCliente.length; i++) {
                if (nuevoCliente[i] == null) {
                    nuevoCliente[i] = nuevoClientes;
                    break;
                }
            }

            System.out.println("Desea agregar otro cliente:");
            System.out.println("1) si 0 2) no");
            int opcion = entrada.nextInt();
            entrada.nextLine();

            if (opcion == 2) {
                break;
            }

        }
    }

    public void imprimirCliente() {
        System.out.println("");
        System.out.println("Los datos de los clientes son:");

        for (int i = 0; i < nuevoCliente.length; i++) {
            if (nuevoCliente[i] != null) {
                System.out.println("Nombre: " + nuevoCliente[i].getNombre());
                System.out.println("Direccion" + nuevoCliente[i].getDireccion());
                System.out.println("Edad" + nuevoCliente[i].getEdad());
                System.out.println("Datos autos: ");
                for (int j = 0; j < nuevoCliente[i].getAutomovil().length; j++) {
                    if (nuevoCliente[i].getAutomovil()[j] != null) {
                        System.out.println("El id del auto es: " + nuevoCliente[i].getAutomovil()[j].getId());
                        System.out.println("La marca del autos es: " + nuevoCliente[i].getAutomovil()[j].getMarca());
                        System.out.println("El modelo del auto es: " + nuevoCliente[i].getAutomovil()[j].getModelo());
                        System.out.println("El año del auto es: " + nuevoCliente[i].getAutomovil()[j].getAño());
                        System.out.println("El tipo del auto es: " + nuevoCliente[i].getAutomovil()[j].getTipo());
                        System.out.println("");
                    }
                }

                System.out.println("");
            }
        }
    }

}
