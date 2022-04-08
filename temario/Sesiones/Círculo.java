/** Representa objetos Círculo, con un campo Radio
 *  @author los profesores de IP
 *  @version 1.0  */
public class Círculo {
	/**Valor del radio del objeto Círculo*/
	private double radio;
	private double x;
	private double y;
	
	/**Constante matemática pi */
	private static final double PI=3.1416;
	
	/**Devuelve el valor del radio del objeto Círculo
	 * @return el radio del objeto */
	public double getRadio() {
		return radio;
	}
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}

	/**Cambia el valor del radio del objeto, para que valga r
	 * @param r nuevo valor para el radio del objeto 
	 * @return nada  */
	public void setRadio(double r) {
		if(r >= 0) radio=r;
	}	
	public void setX(double nuevaX) {
		x = nuevaX;
	}
	public void setY(double nuevaY) {
		y = nuevaY;
	}

	/**Devuelve el área del objeto Círculo
	 * @return el valor del área del Círculo*/
	public double calculaÁrea() {
		return PI*radio*radio;
	}
	public double calculaPerímetro() {
		return 2*PI*radio;
	}
	public void copiaCentro(Círculo c) {
		this.setX(c.getX());
		this.setY(c.getY());
	}
	public double diferenciaÁrea(Círculo c) {
		return this.calculaÁrea() - c.calculaÁrea();
	}
	public void ajustaRadio(Círculo c) {
		double d = Math.sqrt(Math.pow(this.x-c.x,2)
				+Math.pow(this.y-c.y,2));
		this.setRadio(d);
	}
}
