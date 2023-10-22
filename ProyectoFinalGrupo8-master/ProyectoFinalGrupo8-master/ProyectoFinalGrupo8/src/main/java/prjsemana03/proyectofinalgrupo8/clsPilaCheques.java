/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjsemana03.proyectofinalgrupo8;

/**
 *
 * @author Steven
 */
public class clsPilaCheques {
    clsNodoPilasCheques cima;

    public clsPilaCheques() {
        this.cima = null;
    }
    
    public boolean esVacia(){
        if(cima == null)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void ingresarCheque(){
        clsCheques nuevoCheque = new clsCheques();
        clsHelper clsH = new clsHelper();
        nuevoCheque.setNumeroCheque(clsH.recibirString("Digite el numero del cheque: "));
        nuevoCheque.setNombreUsuario(clsH.recibirString("Digite el Nombre del Usuario: "));
        nuevoCheque.setFecha(clsH.recibirString("Digite la fecha: \nDD/MM/AA"));
        nuevoCheque.setMonto(clsH.recibeInt("Digite la cantidad del cheque: "));
        
        clsNodoPilasCheques nuevo = new clsNodoPilasCheques();
        nuevo.setCheque(nuevoCheque);
        
        if(esVacia())
        {
            cima = nuevo;
        }
        else
        {
            nuevo.setSiguiente(cima);
            cima = nuevo;
        }
   
    }
    
        public void firmaCheque()
    {
        clsHelper clsH = new clsHelper();
        if(!esVacia())
        {
            clsCheques chequeFirmar = cima.getCheque();
            
            clsH.imprimeMensaje("Informacion de cheque\n"
                    + "Cheque: "+chequeFirmar.getNumeroCheque()+"\n"
                            + "Usuario: "+chequeFirmar.getNombreUsuario()+"\n"
                            + "Fecha ingreso cheque: "+chequeFirmar.getFecha()+"\n"
                            + "Monto: "+chequeFirmar.getMonto()+"\n"
                            + "\n"
                            + "Si da ok, confirma el firmar del cheque");
            
            
            
            
            
            cima = cima.getSiguiente();
            
        }
        else
        {
           clsH.imprimeMensaje("La pila esta vacia.");
        }
    }
        
        
        public String imprimirPila()
    {
        String respuesta = "";
        if(!esVacia())
        {
            
            clsNodoPilasCheques temp = cima; 
            while(temp != null) 
            {
                respuesta += temp.getCheque().getNumeroCheque()+ "\n";

                temp = temp.getSiguiente();
            }
        }
        else
        {
            respuesta = "La pila está vacía";
        }
        
        return respuesta;
    }    
    
}
