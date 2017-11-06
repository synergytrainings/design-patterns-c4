import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {


        ArrayList<String> artists = new ArrayList<String>();
        artists.add("Armin van Buuren");
        artists.add("Dimitri Vegas & Like Mike");
        artists.add("Tiesto");
        artists.add("Alesso");
        artists.add("David Guetta");
        artists.add("Krewella");

        Tomorrowland tomorrowland = new Tomorrowland(320, 3, artists);
        Trip trip = new Trip("Amsterdam ", 12, 100);


        int total = calculateTotalPrice(tomorrowland, trip);
        System.out.println("Total Cost = " + total);

    }

    private static int calculateTotalPrice(Tomorrowland tomorrowland, Trip trip) {
        FestivalVisitor visitor = new FestivalVisitorImpl();

        int tomorrowlandPrice =tomorrowland.accept(visitor);
        int tripPrice =trip.accept(visitor);
        return  tomorrowlandPrice+ tripPrice;
    }

}