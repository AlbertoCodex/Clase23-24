package com.politecnico.alquilervehiculos.control;

import com.politecnico.alquilervehiculos.model.*;
import com.politecnico.alquilervehiculos.view.*;

import java.util.HashMap;

public class MainController {
    private static MainController mySingleController;
    private static Empresa miEmpresa;

    private MainController() {
        miEmpresa = new Empresa();
    }
    //Get instance
    public static MainController getSingleton() {
        if (MainController.mySingleController == null) {
            mySingleController = new MainController();
        }
        return mySingleController;
    }
    public void agregarCliente(String nombre,String apellidos,String email,String telefono,String dni,String numero,String fecha,String cvv) {
        Cliente nuevoCliente = new Cliente(nombre, apellidos, email, telefono, dni, new Tarjeta(numero, fecha, cvv));
        miEmpresa.agregarCliente(apellidos,nuevoCliente);

    }
    public HashMap pedirClientes() {
        return miEmpresa.getClientes();
    }
    // Getters y Setters
    public static MainController getMySingleController() {
        return mySingleController;
    }
    public static void setMySingleController(MainController mySingleController) {
        MainController.mySingleController = mySingleController;
    }
    public static Empresa getMiEmpresa() {
        return miEmpresa;
    }
    public static void setMiEmpresa(Empresa miEmpresa) {
        MainController.miEmpresa = miEmpresa;
    }

}
