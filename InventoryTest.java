import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Daniel on 9/23/2016.
 */
public class InventoryTest {

    @Test
    public void testFindCheapest(){
        //Arrage
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
        int price1= prueba.findCheapestVehicle().getPrice();

        //Assert
        Assert.assertEquals("Wrong price", 2300, price1);
    }

    @Test
    public void testMostExpensive(){
        //Arrage
        String ma="Toyota", mod="Rav";
        Integer year=1848, price=4300, milPG=35, tow=2340;
        Boolean fourW=true, side=true;

        Truck T= new Truck(ma, mod,year, price, milPG, fourW, side, tow);

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
        int price1= prueba.findMostExpensiveVehicle().getPrice();

        //Assert
        Assert.assertEquals("Wrong price", 4300, price1);
    }

}
