public class FestivalVisitorImpl implements FestivalVisitor {

    @Override
    public int visit(Tomorrowland tomorrowland) {
        int totalCost = tomorrowland.getLineUp().size() * tomorrowland.getTicketPricePerArtist() * tomorrowland.getDays();
        System.out.println("Tomorrowland is the best place in the universe , its lineUp consists of  " + tomorrowland.getLineUp().size() + " artists and it worth of spanding " + totalCost + " amount for it!!!");
        return totalCost;
    }

    @Override
    public int visit(Trip trip) {
        int totalCost = trip.getTotalDays() * trip.getAverageDailyConsumption();
        System.out.println("The madness  starts from " + trip.getDirection() +
                " and gonna last for " + trip.getTotalDays() + " days,  so make sure u have " + totalCost + " amount of money for the adventures!!! :P :D ");
        return totalCost;
    }


}