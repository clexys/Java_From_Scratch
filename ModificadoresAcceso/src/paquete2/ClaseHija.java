
package paquete2;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    public ClaseHija(){
        super();
        this.atributoProtected = "MOdificacion de metodo";
        this.metodoProtected();
    }
}
