import java.util.ArrayList;

public class Tomorrowland {

	private int ticketPricePerArtist;
	private int days;
	private ArrayList<String> lineUp;



	public Tomorrowland(int ticket, int days, ArrayList<String> artists){
		this.ticketPricePerArtist=ticket;
		this.days=days;
		this.lineUp=artists;
	}

	public int getTicketPricePerArtist() {
		return ticketPricePerArtist;
	}

	public int getDays() {
		return days;
     	}

	public ArrayList<String> getLineUp() {
		return lineUp;
	}


	public int accept(FestivalVisitor visitor) {
		return visitor.visit(this);
	}

}