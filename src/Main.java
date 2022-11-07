import Transport.*;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Hyundai", "H350", 3.0, CapacityType.MEDIUM);
        Bus bus2 = new Bus("ЛиАЗ", "4292", 3.0, CapacityType.LARGE);
        Bus bus3 = new Bus("СитиРитм", "10", 3.5, CapacityType.SMALL);
        Bus bus4 = new Bus("Mercedes-Benz", "Sprinter", 4.0, CapacityType.SMALL);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
        System.out.println(bus4.toString());
        bus1.startMoving();
        bus1.finishtMoving();
        bus1.pitStop();
        bus1.bestLapTime();
        bus1.maximumSpeed();

        Cars car1 = new Cars("Audi", "50L TDI", 3.0, BodyType.PICKUP);
        Cars car2 = new Cars("BMW", "Z8", 3.0, BodyType.SEDAN);
        Cars car3 = new Cars("Kia", "Sportage", 3.0, BodyType.HATCHBACK);
        Cars car4 = new Cars("Hundai", "Avante", 3.5, BodyType.PICKUP);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        car1.startMoving();
        car1.finishtMoving();
        car1.pitStop();
        car1.bestLapTime();
        car1.maximumSpeed();

        Trucks truck1 = new Trucks("Валдай", "NEXT", 5.2, LiftingCapacityType.N1);
        Trucks truck2 = new Trucks("Dongfeng Captain", "T", 5.5, LiftingCapacityType.N2);
        Trucks truck3 = new Trucks("Газель", "N", 5.0, LiftingCapacityType.N3);
        Trucks truck4 = new Trucks("JAC", "N-35", 5.7, LiftingCapacityType.N1);
        System.out.println(truck1.toString());
        System.out.println(truck2.toString());
        System.out.println(truck3.toString());
        System.out.println(truck4.toString());
        truck1.startMoving();
        truck1.finishtMoving();
        truck1.pitStop();
        truck1.bestLapTime();
        truck1.maximumSpeed();

        DriverD serega = new DriverD("Серега", "D", 2.5, bus1);
        DriverC albert = new DriverC("Альберт", "C", 4, truck2);
        DriverB ivan = new DriverB("Иван", "B", 5, car1);

        System.out.println(serega);
        serega.inform();
        System.out.println(albert);
        albert.inform();
        System.out.println(ivan);
        ivan.inform();
    }
}