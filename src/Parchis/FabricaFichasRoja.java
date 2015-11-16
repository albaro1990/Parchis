package Parchis;


/**
 * 
 * @author Eduardo Terradez, Ramón Serrano y César Gil
 * @version 16/11/2015 v2
 * @see <a href = "https://github.com/rslnautic/Parchis"
 */

public class FabricaFichasRoja implements FabricaAbstractaFichas{
	@Override
	public Ficha crearFicha() {
		Color c1 = Color.ROJO;
		Ficha f1 = new Ficha(c1);
		return f1;
	}

}
