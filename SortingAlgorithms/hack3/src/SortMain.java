import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * Classe Main delSort
 * @authors Campanelli Compagnucci e Cataluffi
 *
 */
public class SortMain {
	public static void main(String[] args) {
		
		Sort example = new Sort();
		List<Integer> input = new ArrayList<Integer>();
		
		
		int dim = richiedi("Inserisci dimensione array da ordinare: ");

		for (int i = 0; i < dim; i++) {
			input.add(richiedi("Inserisci numero: "));
		}
		
		int[] solution = example.sort(input.stream().mapToInt(i->i).toArray());
		
		print(solution);
	}
	
	static void print(int[] i) {
		for(int x : i) {
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	private static int richiedi(String richiesta) {	
		System.out.print(richiesta);
		Scanner sc = new Scanner(System.in);

		while (!sc.hasNextInt()) sc.next();
		return  sc.nextInt();
	}
}
