public class Main {

    public static void carsCout(Car[] cars) {

        for (byte i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

    public static void trainCout(Train[] trains) {

        for (byte i = 0; i < trains.length; i++) {
            System.out.println(trains[i].toString());
        }
    }

    public static void busCout(Bus[] buses) {

        for (byte i = 0; i < buses.length; i++) {
            System.out.println(buses[i].toString());
        }
    }

    public static void main(String[] args) {

        Car.Key Auto = new Car.Key(true, true);//тут создаем объект для статик класса, который общий для все машин
        Car.Key Manual = new Car.Key(false, false);

        Car[] cars = new Car[2];
        cars[0] = new Car("Lada", "Granta",
                1.2f, "Черный", 2022, 100, "Россия",
                "Автомат",
                "Хэтчбек", "x))CC)))", true, Auto,"Электричество");
        cars[1] = new Car("Audi", "Quatro",
                3.2f, "Черный", 2002, 200, "Германия",
                "Автомат",
                "Хэтчбек", "f656gg712", true, Manual,"vb");

        carsCout(cars);

        Train[] trains = new Train[2];
        trains[0] = new Train("Ласточка", "В-901", 2001, "Россия", "", 301, 3500,
                2, "Белорусский вокзал", "Минск", 11,""
        );
        trains[1] = new Train("Лениннрад", "D-125", 2019, "Россия", "", 270, 1700,
                4, "Ленинградский вокзал", "Минск", 8,"Дизель"
        );

        trainCout(trains);

        Bus[] buses = new Bus[3];
        buses[0] = new Bus("Mercedes", "ХЗ", 2012, "Германия", "", 120,"");
        buses[1] = new Bus("Уаз", "Буханка", 1989, "Россия", "", 80,"Дизель");
        buses[2] = new Bus("Mercedes", "КК", 2021, "Германия", "", 180, "Бензин");

        busCout(buses);

        cars[0].refill();
        cars[1].refill();
        trains[1].refill();
        buses[1].refill();
    }
}