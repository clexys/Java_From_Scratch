
package accesodatos;

public class ImplementacionOracle implements IAccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insertar desde Oracle");
    }

    @Override
    public void listar() {
        System.out.println("Listar desde Oracle");
    }

    @Override
    public void actualizar() {
        System.out.println("Actualizar desde Oracle");

    }

    @Override
    public void eliminar() {
        System.out.println("Eliminando desde Oracle");

    }
        //debemos hacer esta clase abstracta para implementar las de IAccesoDatos
    
}
