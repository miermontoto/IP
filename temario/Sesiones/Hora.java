/** Representa objetos Hora
 *  @author los profesores de IP
 *  @version 1.0  */
public class Hora {
	/**Valor de las horas del objeto Hora*/
	private int horas;
	/**Valor de los minutos del objeto Hora*/
	private int minutos;
	/**Valor de los segundos del objeto Hora*/
	private int segundos;
	
	/**Devuelve el valor de las horas del objeto Hora
	 * @return las horas del objeto */
	public int getHoras() {
		return horas;
	}
	
	/**Cambia el valor de las horas del objeto, para que valga hh
	 * @param hh nuevo valor para el día del objeto 
	 * @return nada  */
	public void setHoras(int hh) {
		if (hh>=0 && hh<=23) horas=hh;
	}
	
	/**Devuelve el valor de los minutos del objeto Hora
	 * @return los minutos del objeto */
	public int getMinutos() {
		return minutos;
	}
	
	/**Cambia el valor de los minutos del objeto, para que valga mm
	 * @param mm nuevo valor para los minutos del objeto 
	 * @return nada  */
	public void setMinutos(int mm) {
		if (mm>=0 && mm<=59) minutos=mm;
	}
	
	/**Devuelve el valor los segundos del objeto Hora
	 * @return los segundos del objeto */
	public int getSegundos() {
		return segundos;
	}
	
	/**Cambia el valor de los segundos del objeto, para que valga ss
	 * @param ss nuevo valor para los segundos del objeto 
	 * @return nada  */
	public void setSegundos(int ss) {
		if (ss>=0 && ss<=59) segundos=ss;
	}
	
	/**Cambia la Hora completa del objeto
	 * @param hh nuevo valor para las horas
	 * @param mm nuevo valor para los minutos
	 * @param ss nuevo valor para los segundos 
	 * @return nada  */
	public void setHora(int hh, int mm, int ss) {
		setHoras(hh);
		setMinutos(mm);
		setSegundos(ss);
	}
	
	/**Imprime la Hora en consola en formato hh:mm:ss
	 * @return nada */
	public void imprimeHora() {
		System.out.printf("%02d:%02d:%02d",getHoras(),getMinutos(),getSegundos());
	}
}
