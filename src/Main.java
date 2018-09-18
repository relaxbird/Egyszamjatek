import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static List<Jatekosok> jatekosok() {
		List<Jatekosok> jatekosok = new ArrayList<>();
		List<String> beolvas = fajlbolOlvas("egyszamjatek.txt");

		for (String sor : beolvas) {
			String[] split = sor.split(" ");
			List<Integer> tippek = new ArrayList<>();

			for (int i = 0; i < split.length - 1; i++) {
				tippek.add(Integer.parseInt(split[i]));
			}

			Jatekosok o = new Jatekosok(tippek, split[10]);
			jatekosok.add(o);
		}
		return jatekosok;
	}

	public static List<String> fajlbolOlvas(String file) {
		List<String> sorok = null;
		try {
			sorok = Files.readAllLines(Paths.get(file));
		} catch (NoSuchFileException e) {
			System.err.println("Nincs meg a fájl!");
		} catch (IOException e) {
			System.err.println("Hiba a beolvasásnál!");
		}
		return sorok;
	}

	public static void main(String[] args) {
		jatekosok().forEach(System.out::println);

	}

}
