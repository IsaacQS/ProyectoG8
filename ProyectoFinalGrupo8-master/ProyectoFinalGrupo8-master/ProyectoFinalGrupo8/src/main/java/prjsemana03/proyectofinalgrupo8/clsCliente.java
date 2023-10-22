/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author isaac
 */
class clsCliente {
    private String ficha;
    private String cedula;
    private String nombre;
    private String tipo;

    public clsCliente(String ficha, String cedula, String nombre, String tipo) {
        this.ficha = ficha;
        this.cedula = cedula;
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getFicha() {
        return ficha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}


