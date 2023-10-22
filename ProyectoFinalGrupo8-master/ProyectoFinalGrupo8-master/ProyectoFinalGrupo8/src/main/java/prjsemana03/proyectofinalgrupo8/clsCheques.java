/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author Steven
 */
public class clsCheques {
    private String numeroCheque;
    private String nombreUsuario;
    private String fecha;
    
    private int monto;

    public clsCheques() {
    }

    public clsCheques(String numeroCheque, String nombreUuario, String fecha, int monto) {
        this.numeroCheque = numeroCheque;
        this.nombreUsuario = nombreUuario;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUuario) {
        this.nombreUsuario = nombreUuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
  
    
    
}
