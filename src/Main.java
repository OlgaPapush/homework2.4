import Transport.Bus;
import Transport.cars;
import Transport.trucks;

public class Main {
    public static void main(String[] args) {
        Bus bus1 = new Bus("Hyundai", "H350", 3.0);
        Bus bus2 = new Bus("ЛиАЗ", "4292", 3.0);
        Bus bus3 = new Bus("СитиРитм", "10", 3.5);
        Bus bus4 = new Bus("Mercedes-Benz", "Sprinter", 4.0);
        System.out.println(bus1.toString());
        System.out.println(bus2.toString());
        System.out.println(bus3.toString());
        System.out.println(bus4.toString());
       bus1.startMoving();
       bus1.finishtMoving();
       bus1.pitStop();
       bus1.bestLapTime();
       bus1.maximumSpeed();

       cars car1 = new cars("Audi","50L TDI",3.0);
       cars car2 = new cars("BMW","Z8", 3.0);
       cars car3 = new cars("Kia","Sportage", 3.0);
       cars car4 = new cars("Hundai","Avante",3.5);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        car1.startMoving();
        car1.finishtMoving();
        car1.pitStop();
        car1.bestLapTime();
        car1.maximumSpeed();



        trucks truck1 = new trucks("Валдай", "NEXT", 5.2);
        trucks truck2 = new trucks("Dongfeng Captain", "T", 5.5);
        trucks truck3 = new trucks("Газель", "N", 5.0);
        trucks truck4 = new trucks("JAC", "N-35", 5.7);
        System.out.println(truck1.toString());
        System.out.println(truck2.toString());
        System.out.println(truck3.toString());
        System.out.println(truck4.toString());
        truck1.startMoving();
        truck1.finishtMoving();
        truck1.pitStop();
        truck1.bestLapTime();
        truck1.maximumSpeed();

       Driver serega = new Driver("Серега", "D", 2.5, bus1);
       Driver2 albert = new Driver2("Альберт", "C", 4,truck2);
       Driver3 ivan = new Driver3("Иван", "B", 5, car3);

        System.out.println(serega);
        serega.inform();

        System.out.println(albert);
        albert.inform();

        System.out.println(ivan);
        ivan.inform();


    }
}