/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author Steven
 */
public class clsNodoPilasCheques {
    private clsCheques cheque;
    private clsNodoPilasCheques siguiente;

    public clsNodoPilasCheques() {
        this.siguiente = null;
    }

    public clsCheques getCheque() {
        return cheque;
    }

    public void setCheque(clsCheques cheque) {
        this.cheque = cheque;
    }

    public clsNodoPilasCheques getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(clsNodoPilasCheques siguiente) {
        this.siguiente = siguiente;
    }
    
    
    
    
}
