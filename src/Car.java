import java.security.Key;

public class Car extends Transport {


    private float engineVolume;


    private String transmission;
    private final String bodyType;
    private String regNumber;

    boolean tires;

    public static class Key {
        private final boolean remoteEngineSet;
        private final boolean infinityAccess;

        public Key(boolean infinityAccess, boolean remoteEngineSet) {
            this.infinityAccess = infinityAccess;
            this.remoteEngineSet = remoteEngineSet;
        }

        @Override
        public String toString() {
            return
                    " удаленный запуск двигателя=" + remoteEngineSet +
                            ", бесконечный доступ=" + infinityAccess +
                            '}';
        }
    }

    public Car.Key keyParam;


    public Car(String brand, String model, float engineVolume, String color, Integer year, Integer maxSpeed, String country, String transmission,
               String bodyType, String regNumber, boolean tires, Car.Key keyParam, String gasType) {
        super(brand, model, year, country, color, maxSpeed, gasType);


        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }


        if (transmission == "" || transmission == null) {
            this.transmission = "Автомат";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == "" || bodyType == null) {
            this.bodyType = "Седан";
        } else {
            this.bodyType = bodyType;
        }

        this.regNumber = regNumber;
        this.keyParam = keyParam;

        String s1="Электричество";
        String s2="Бензин";
        String s3="Дизель";


        if (!(getGasType().equals(s1))||!(getGasType().equals(s2))||!(getGasType().equals(s3))){
            System.out.println(getGasType());
            this.gasType="Бензин";
        }


    }


    public float getEngineVolume() {
        return engineVolume;
    }


    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }


    public boolean isTires() {
        return tires;
    }


    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume;
    }


    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public Key getKeyParam() {
        return keyParam;
    }

    public boolean changeTires() {
        this.tires = !this.tires;
        return tires;
    }

    public void verifyRegNumber() {
        String s1 = regNumber.substring(1, 4);
        String s2 = regNumber.substring(6, 9);
        if (regNumber.length() != 9 && s1 != "000" && s2 != "000") {
            System.out.println(("Номер задан неверно"));
        } else {
            System.out.println(("Номер верный"));
        }



    }


    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", tires=" + tires +
                ", keyParam=" + keyParam +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }



    public void refill() {
        System.out.println("Машину " + getBrand() + " можно заправлять " + getGasType());
    }
}