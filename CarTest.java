import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Daniel on 9/23/2016.
 */
public class CarTest {

    @Test
    public void testCar(){ //Testing the constructor of Car class
        //Arrange
        String make="Toyota", mo="Corolla";
        Integer y=1848, prc=2300, mlPG=35;
        Boolean conv=true, four=true;
        Car Toyota = new Car(make, mo, y, prc, mlPG, conv, four);

        //Act
        String marca= Toyota.getMake();
        boolean convertible = Toyota.getConvert();

        //Assert
        Assert.assertEquals("Wrong make", "Toyota", marca);
        Assert.assertEquals("Should be true", true, convertible);
    }

    @Test
    public void testgetConvert(){
        //Arrange
        String make="Toyota", mo="Corolla";
        Integer y=1848, prc=2300, mlPG=35;
        Boolean conv=true, four=true;
        Car Toyota = new Car(make, mo, y, prc, mlPG, conv, four);

        //Act
        Boolean convertible= Toyota.getConvert();

        //Assert
        Assert.assertEquals("Should be true", true, convertible);
    }

    @Test
    public void testSetter(){
        //Arrange
        String make="Toyota", mo="Corolla";
        Integer y=1848, prc=2300, mlPG=35;
        Boolean conv=true, four=true;
        Car Toyota = new Car();
        Toyota.setVariables(make, mo, y, prc, mlPG, conv, four);

        //Act
        int milesPerGallon= Toyota.getMpg();

        //Assert
        Assert.assertEquals("Wrong miles per gallon", 35, milesPerGallon);

    }


}

