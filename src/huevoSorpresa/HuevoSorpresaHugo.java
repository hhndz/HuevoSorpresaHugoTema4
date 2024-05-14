/**
 * Clase que representa la compra de Huevos Sorpresa, con el numero de unidades, precio actual,
 * precio máximo y nombre que incluye la sorpresa
 */
package huevoSorpresa;

/**
 * 
 * @author PCHugo
 */
public class HuevoSorpresaHugo {
    
    /**
     * Devuelve las unidades
     * @return the unidades
     */
    public int getUnidades() {
        return unidades;
    }

    /**
     * @param unidades Establece las unidades
     */
    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    /**
     * @return obtención del precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio Establecer precio
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return Devuelve la sorpresa
     */
    public String getSorpresa() {
        return sorpresa;
    }

    /**
     * @param sorpresa Establecer sorpresa
     */
    public void setSorpresa(String sorpresa) {
        this.sorpresa = sorpresa;
    }

    /**
     * @return Devuelve el precio máximo
     */
    public double getPrecio_max() {
        return precio_max;
    }

    /**
     * @param precio_max Establecemos el precio máximo
     */
    public void setPrecio_max(double precio_max) {
        this.precio_max = precio_max;
    }
    private int unidades;//número de huevos que quedan 
    private double precio;//precio actual de un huevo sorpresa
    private String sorpresa;//nombre de la sorpresa que incluye huevo sorpresa
    private double precio_max;//precio máximo que puede tener un huevo sorpresa
    
    
public HuevoSorpresaHugo(){}
/**
 * 
 * @param unidades Metodo que nos dice la cantidad de huevos
 * @param precio Metodo donde obtenemos el precio de cada huevo
 * @param sorpresa Metodo donde sacamos el nombre de la sorpresa
 * @param precio_max Metodo para dar un precio máximo que se le puede dar a un huevo
 */

public HuevoSorpresaHugo(int unidades, double precio, String sorpresa, double precio_max){
    this.unidades=unidades;
    this.precio=precio;
    this.sorpresa=sorpresa;
    this.precio_max=precio_max;
}

/**
 * 
 * @return Devuelve las unidades obtenidas
 */
public int obtenerUnidades(){return this.getUnidades();}

/**
 * 
 * @return Devuelve el precio obtenido
 */
public double obtenerPrecio(){return this.getPrecio();}

/**
 * 
 * @param unidades Metodo de Modificacion de las Unidades
 */
public void modificarUnidades(int unidades){this.setUnidades(unidades);}

/**
 * 
 * @param unidades Huevos sacados
 * @param dinero Dinero que tenemo actualmente
 * @throws Exception Lanza una excepcion para indicar que no quedan huevos sorpresa en la tienda
 */
public void sacarHuevosSorpresas(int unidades, double dinero) throws Exception{
   String sorpresa = "Mininon";
    if (dinero <= 0) {
   	throw new Exception("Se necesita una cantidad de dinero positiva");
        }
   if (dinero <(unidades * getPrecio())) {
   	throw new Exception("No tiene suficiente dinero");
        }
   if (unidades<= 0){
        throw new Exception("Es necesario indicar una cantidad positiva de huevos sorpresa");
    }
    if( this.getUnidades()<unidades){
        throw new Exception("No hay suficientes huevos sorpresa en la tienda");
    }
    this.modificarUnidades(this.obtenerUnidades()-unidades);
}

/**
 * 
 * @param aumento Metodo para umentar el precio a un Huevo Sorpresa
 * @throws Exception Lanza una excepcion indicando que no se puede aumentar el precio ya que no se puede superar el máximo
 */
public void aumentarPrecio(double aumento) throws Exception{
    if(aumento <= 0) {
        throw new Exception("El aumento debe ser positivo");
    }
    if( getPrecio_max()<getPrecio() + aumento ){
        throw new Exception("No se puede superar el precio máximo");
    }
        setPrecio(getPrecio() + aumento);
}
}