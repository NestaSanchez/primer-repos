package dado;

import java.util.Random;

public class moneda extends sorteo{
	
	Random r = new Random();
	int valores;
	@Override
	public int lanzar() {
		// TODO Auto-generated method stub
		return valores = r.nextInt(2)+1;
	}

}
