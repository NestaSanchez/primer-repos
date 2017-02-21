package dado;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class interfaz extends JFrame {
	JButton bdado, bmoneda, bsalir;

	/*public static void main(String[] args) {

		miCalculadora c = new miCalculadora();
		c.pack();
		c.setVisible(true);

		c.setLocationRelativeTo(null);

	}*/

	public interfaz() {

		bdado = new JButton("dado");
		bmoneda = new JButton("moneda");
		bsalir = new JButton("Salir");
		

		Container pantalla = getContentPane();

		pantalla.setPreferredSize(new Dimension(200, 150));
		pantalla.setLayout(new FlowLayout());
		pantalla.add(bdado);
		pantalla.add(bmoneda);
		pantalla.add(bsalir);
		pantalla.setBackground(Color.orange);
		setResizable(false);

		bdado.addActionListener(new evento());
		bmoneda.addActionListener(new evento());
		bsalir.addActionListener(new evento());

	}

	private class evento implements ActionListener {
		public void actionPerformed(ActionEvent e) {

			
		}
	}
}
