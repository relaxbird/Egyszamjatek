import java.util.List;

public class Jatekosok {
	private List<Integer> tippek;
	private String nev;

	public Jatekosok(List<Integer> tippek, String nev) {
		this.tippek = tippek;
		this.nev = nev;
	}

	public List<Integer> getTippek() {
		return tippek;
	}

	public void setTippek(List<Integer> tippek) {
		this.tippek = tippek;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	@Override
	public String toString() {
		return "Jatekosok [tippek=" + tippek + ", nev=" + nev + "]";
	}

}
