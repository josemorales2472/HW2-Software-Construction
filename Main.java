import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String Ma="Toyota", Mod="Rav";
        Integer Year=1848, Price=4300, MilPG=35, tow=2340;
        Boolean FourW=true, side=true;

        Truck T= new Truck(Ma, Mod,Year, Price, MilPG, FourW, side, tow);

        String mak="Toyota", mode="Tundra";
        Integer yea=1848, pric=2500, milP=35, to=2340;
        Boolean forW=true, sid=true;

        Truck W= new Truck(mak, mode, yea, pric, milP, forW, sid, to );

        String make="Toyota", mo="Corolla";
        Integer y=1848, prc=2300, mlPG=35;
        Boolean conv=true, four=true;

        Car F= new Car(make, mo, y, prc, mlPG, conv, four );

        Inventory prueba = new Inventory();
        prueba.add(T);
        prueba.add(W);
        prueba.add(F);

        //Testing Inventory class, outputing the cheapest vehicle
        System.out.println(prueba.findCheapestVehicle());

        //Testing Inventory class, outputing the cheapest vehicle
        System.out.println("Test of price average: ");
        prueba.printAveragePriceOfAllVehicles();

        List<Vehicle> trial = new ArrayList<Vehicle>();

        trial.add(F);
        trial.add(W);
        trial.add(T);

      //  for(Integer i=0;i<3;i++)
        //{
          //  System.out.println(trial.get(i));
        //}







    }
}
