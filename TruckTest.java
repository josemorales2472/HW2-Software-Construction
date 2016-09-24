import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Daniel on 9/23/2016.
 */
public class TruckTest {
    @Test
    public void testDefaultConstructor(){
        //Arrange
        Truck T= new Truck();

        //Act
        int tow=T.getTowC();

        //Assert
        Assert.assertEquals("Shouldn't be able to tow", 0, tow);
    }

    @Test
    public void testConstructor(){
        //Arrange
        String Ma="Toyota", Mod="Rav";
        Integer Year=1848, Price=4300, MilPG=35, tow=2340;
        Boolean FourW=true, side=true;
        Truck T= new Truck(Ma, Mod,Year, Price, MilPG, FourW, side, tow);

        //Act
        Boolean sid= T.getSideS();

        //Assert
        Assert.assertEquals("Should have a side step", true, sid);
    }

    @Test
    public void testSetter(){
        //Arrange
        String ma="Toyota", mod="Rav";
        Integer year=1848, price=4300, milPG=35, tow=2340;
        Boolean fourW=true, side=true;
        Truck T= new Truck();

        T.setVariables(ma, mod,year, price, milPG, fourW, side, tow);

        //Act
        int year1= T.getYear();
        boolean sid= T.getSideS();

        //Assert
        Assert.assertEquals("Wrong year", 1848, year1);
        Assert.assertEquals("Should be true", true, sid);
    }

}
