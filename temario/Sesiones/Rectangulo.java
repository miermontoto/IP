/** Representa objetos Rectángulo
 *  @author los profesores de IP
 *  @version 1.0  */
public class Rectangulo {

    //Atributos
    /** Representa la coordenada X del Rectángulo */
    private double x;
    /** Representa la coordenada Y del Rectángulo */
    private double y;
    /** Representa la base del Rectángulo */
    private double base;
    /** Representa la altura del Rectángulo */
    private double altura;
 
    //Métodos públicos
    /** Devuelve el valor de la coordenada x del Rectángulo
     * @return el valor de x  */
    public double getX() {
        return x;
    }

    /** Cambia el valor de la coordenada x del Rectángulo
     * @param x nuevo valor para la coordenada x   */
	public void setX(double v) {
        x = v;
    }

     /** Devuelve el valor de la coordenada y del Rectángulo
      * @return el valor de y  */
	public double getY() {
       return y;
    }

    /** Cambia el valor de la coordenada y del Rectángulo
      * @param y nuevo valor para la coordenada y   */
    public void setY(double v) {
        y = v;
    }	

    /** Devuelve el valor de la base del Rectángulo
     * @return el valor de base  */
    public double getBase() {
        return base;
    }

    /** Cambia el valor de la base del Rectángulo
     * @param v nuevo valor para la base   */
    public void setBase(double v) {
        if (v > 0 ) base = v;
    }	

    /** Devuelve el valor de la altura del Rectángulo
      * @return el valor de altura  */
	public double getAltura() {
       return altura;
    }

	/** Cambia el valor de la altura del Rectángulo
     * @param v nuevo valor para la altura   */
    public void setAltura(double v) {
        if (v > 0 ) altura = v;
    }		

    /**Calcula el área del Rectángulo
     * @return el área */ 
    public double calculaÁrea() {
        return getBase()*getAltura();
    }

    /**Calcula el perímetro del Rectángulo
     * @return el perímetro */ 
    public double calculaPerímetro() {
        return getBase()*2+getAltura()*2;
	}	
}

