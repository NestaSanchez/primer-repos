package dado;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		dado d = new dado();
		moneda m = new moneda();
		interfaz i = new interfaz();
		int v;
		boolean seguir = true;
		String opt = "";
		Scanner sc = new Scanner(System.in);
		
		
		
		while (seguir){
			System.out.println("1) Dado "
					+ "\n2) Moneda "
					+ "\n3) Salir");
			opt = sc.nextLine();
			switch (opt){
			case "1":
				System.out.println("Ha elegido la opción dado");
				System.out.println("El resultado del dado es " +d.lanzar());
				
			break;
			
			case "2":
				System.out.println("Ha elegido la opción moneda");
				
				if (m.lanzar()==1){
					System.out.println("Cara");
				}else{
					System.out.println("Cruz");
				}
				
			break;
			default:
				System.out.println("Elija una de las opciones validas");
			break;
			
			case "3":
				System.out.println("Ha elegido salir del programa");
				seguir = false;
			break;
			
			
			}
		}

	}

}
