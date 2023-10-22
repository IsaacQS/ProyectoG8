/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author isaac
 */
import java.util.LinkedList;
import java.util.Queue;

class clsGestionCajas {
    private Queue<clsCliente> colaPreferencial;
    private Queue<clsCliente> colaRegular;

    public clsGestionCajas() {
        colaPreferencial = new LinkedList<>();
        colaRegular = new LinkedList<>();
    }

    public void seleccionarFicha(clsCliente cliente) {
        if (cliente.getTipo().equals("preferencial")) {
            colaPreferencial.offer(cliente);
        } else {
            colaRegular.offer(cliente);
        }
    }

    public clsCliente llamarCliente(int numeroCaja) {
        clsCliente clienteAtendido = null;
        if (!colaPreferencial.isEmpty() && numeroCaja == 1) {
            clienteAtendido = colaPreferencial.poll();
        } else if (!colaRegular.isEmpty()) {
            clienteAtendido = colaRegular.poll();
        }
        return clienteAtendido;
    }

    public String mostrarFichasPendientes() {
        StringBuilder resultado = new StringBuilder("Fichas Pendientes:\n");
        resultado.append("Preferenciales: ");
        for (clsCliente cliente : colaPreferencial) {
            resultado.append(cliente.getFicha()).append(", ");
        }
        resultado.append("\nRegulares: ");
        for (clsCliente cliente : colaRegular) {
            resultado.append(cliente.getFicha()).append(", ");
        }
        return resultado.toString();
    }
}



