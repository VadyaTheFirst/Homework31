public class Train extends Transport {
    private int ticketPrice;
    private int roadTime;
    private String leaveStationName;
    private String departureStationName;
    private int vagonCount;

    public Train(String brand, String model, int year, String country, String color, Integer maxSpeed,
                 int ticketPrice, int roadTime, String leaveStationName, String departureStationName, int vagonCount,String gasType) {
        super(brand, model, year, country, color, maxSpeed,gasType);
        this.ticketPrice = ticketPrice;
        this.roadTime = roadTime;
        this.leaveStationName = leaveStationName;
        this.departureStationName = departureStationName;
        this.vagonCount = vagonCount;
        this.gasType="Дизель";
    }

    @Override
    public String toString() {
        return "Train{" +
                "ticketPrice=" + ticketPrice +
                ", roadTime=" + roadTime +
                ", leaveStationName='" + leaveStationName + '\'' +
                ", departureStationName='" + departureStationName + '\'' +
                ", vagonCount=" + vagonCount +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void refill() {
        System.out.println("Поезда заправляются дизелем");
    }
}
