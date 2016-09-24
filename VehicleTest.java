import org.junit.Test;
import org.junit.Assert;
/**
 * Created by Daniel on 9/23/2016.
 */
public class VehicleTest {

    @Test
    public void testConstructor(){
        //Arrange
        String ma="Toyota", mod="Rav";
        Integer year=1848, price=4300, milPG=35, tow=2340;
        Boolean fourW=true;

        Vehicle T= new Vehicle(ma, mod, year, price, milPG, fourW);

        //Act
        String model= T.getModel();

        //Assert
        Assert.assertEquals("Wrong model", "Rav", model);
    }

    @Test
    public void testSetter(){
        //Arrange
        String ma="Toyota", mod="Rav";
        Integer year=1848, price=4300, milPG=35, tow=2340;
        Boolean fourW=true;

        Vehicle T= new Vehicle();
        T.setVariables(ma, mod, year, price, milPG, fourW);

        //Act
        int year1= T.getYear();

        //Assert
        Assert.assertEquals("Wrong year", 1848, year1);

    }

    @Test
    public void testDefaultConstructor(){
        //Arrange
        Vehicle T= new Vehicle();

        //Act
        String model= T.getModel();

        //Assert
        Assert.assertEquals("Wrong model", " ", model);


    }

}
