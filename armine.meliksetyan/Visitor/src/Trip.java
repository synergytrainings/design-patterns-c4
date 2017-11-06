public class Trip {



    private String direction;
    private int totalDays;
    private int averageDailyConsumption;

    public Trip(String dir,  int days, int consump){
        this.direction=dir;
        this.totalDays=days;
        this.averageDailyConsumption=consump;
    }

   public String getDirection() {
        return direction;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public int getAverageDailyConsumption() {
        return averageDailyConsumption;
    }


    public int accept(FestivalVisitor visitor) {
        return visitor.visit(this);
    }

}