/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author Steven
 * Isaac Alonso Quesada Salas
 * Johnny Núñez Hernández
 */
public class ProyectoFinalGrupo8 {
    public static void main(String[] args) {
        clsGestionCajas gestionCajas = new clsGestionCajas();

        clsCliente cliente1 = new clsCliente("P1", "123456", "Cliente 1", "preferencial");
        clsCliente cliente2 = new clsCliente("R1", "654321", "Cliente 2", "regular");
        clsCliente cliente3 = new clsCliente("R2", "987654", "Cliente 3", "regular");
        clsCliente cliente4 = new clsCliente("P2", "111222", "Cliente 4", "preferencial");

        gestionCajas.seleccionarFicha(cliente1);
        gestionCajas.seleccionarFicha(cliente2);
        gestionCajas.seleccionarFicha(cliente3);
        gestionCajas.seleccionarFicha(cliente4);

        clsCliente atendido1 = gestionCajas.llamarCliente(1);
        clsCliente atendido2 = gestionCajas.llamarCliente(2);

        System.out.println("Cliente atendido en caja 1: " + atendido1.getNombre());
        System.out.println("Cliente atendido en caja 2: " + atendido2.getNombre());

        String fichasPendientes = gestionCajas.mostrarFichasPendientes();
        System.out.println(fichasPendientes);
    }
}