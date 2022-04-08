/** Representa objetos Punto en un espacio de dos dimensiones
 *  @author los profesores de IP
 *  @version 1.0  */
public class Punto {
    
	//Atributos
	/** Representa la coordenada X del punto */
	private double x;
	/** Representa la coordenada Y del punto */
	private double y;
	
	
	//Métodos públicos
	/** Devuelve el valor de la coordenada x del Punto
	 * @return el valor de x  */
	public double getX() {
		return x;
	}
	
	/** Cambia el valor de la coordenada x del Punto
	 * @param v nuevo valor para la coordenada x   */
	public void setX(double v) {
		x = v;
	}
	
	/** Devuelve el valor de la coordenada y del Punto
	 * @return el valor de y  */
	public double getY() {
		return y;
	}
	
	/** Cambia el valor de la coordenada y del Punto
	 * @param v nuevo valor para la coordenada y   */
	public void setY(double v) {
		y = v;
	}	
	
	/**Imprime un punto en la consola
	 * @return nada */ 
	public void imprimePunto() {
		System.out.printf("(%.2f,%.2f)",getX(),getY());
	}
	
}
