/**
 * Created by Daniel on 9/20/2016.
 */
public class Car extends Vehicle {
    //Variables that correspond only to Truck
    Boolean Convert;
    String con;

    //Calling default Constructor
    public Car(){
        super();
        this.Convert= false;
    }

    //Initializing variables constructor
    public Car(String Make, String Model, Integer Year, Integer Price, Integer Mpg, Boolean FourW, Boolean conv){
        super(Make, Model, Year, Price, Mpg, FourW);
        this.Convert= conv;
        if(Convert){
            con="Yes";
        }else{
            con="No";
        }

    }

    public Boolean getConvert(){
        return Convert;
    }

    //Setter
    public void setVariables(String Mak, String Mod, Integer Ye, Integer Pric, Integer Mp, Boolean FW, Boolean conv){
        super.setVariables(Mak, Mod, Ye, Pric, Mp, FW);
        Convert= conv;
        if(Convert){
            con="Yes";
        }else{
            con="No";
        }

    }

    //Printing Function
    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return super.toString() + newLine + "Is it convertible: "+ con;

    }


}
