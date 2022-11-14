public class Bus extends Transport{

    public Bus(String brand, String model, int year, String country, String color, Integer maxSpeed,String gasType) {
        super(brand, model, year, country, color, maxSpeed, gasType);

        if (!getGasType().equals("Бензин")&&!getGasType().equals("Дизель")){
            this.gasType="Бензин";
        }
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
    public void refill() {
        System.out.println("Автобус заправляется " +getGasType());
    }
}
