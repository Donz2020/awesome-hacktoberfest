import java.lang.Math;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String pc = "";
		System.out.println("Ok! giochiamo!");
		double macchina = (int) Math.random() * 2;

		int Castato = (int) macchina;
		switch (Castato) {
		case 0:
			pc = "sasso";
			break;
		case 1:
			pc = "carta";
			break;
		case 2:
			pc = "forbice";
		}

		String giocatore1 = JOptionPane.showInputDialog("Scrivi 'sasso','carta' o 'forbici'");
		String x = "sasso";
		String y = "carta";
		String z = "forbice";
		System.out.println("Il tuo avversario ha scelto: " + pc);

		if (!giocatore1.equals(x) && !giocatore1.equals(z) && !giocatore1.equals(y)) {

			System.out.println("Non so capito che m'hai scritto");

		}
		if (giocatore1.equals(pc)) {

			System.out.println("la partita � pari");
		}

		if (giocatore1.equals(x) && pc.equals("forbice") || giocatore1.equals(z) && pc.equals("carta")
				|| giocatore1.equals(y) && pc.equals("sasso")) {
			System.out.println("Hai vinto tu!");
		}

		else {

			System.out.println("Ha vinto il tuo avversario!!");
		}

	}

}