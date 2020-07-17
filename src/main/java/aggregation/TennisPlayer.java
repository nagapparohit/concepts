package aggregation;

public class TennisPlayer {
	
	private String name;
	private Racket racket;
	
	public TennisPlayer(String name,Racket racket) {
		this.name = name;
		this.racket = racket;
	}
	
	public Racket getRacket() {
		return racket;
	}
	public String getName() {
		return name;
	}
	public void setRacket(Racket racket) {
		this.racket = racket;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
