/**
 * Created by Daniel on 9/16/2016.
 */
public class Truck extends Vehicle {

    //Variables that correspond only to Truck
    Boolean SideS;
    Integer TowC;
    String st;
    //Calling default Constructor
    public Truck(){
        super();
        this.SideS= false;
        this.TowC= 0;
    }

    //Initializing variables constructor
    public Truck(String Make, String Model, Integer Year, Integer Price, Integer Mpg, Boolean FourW, Boolean SideS, Integer TowC){
        super(Make, Model, Year, Price, Mpg, FourW);
        this.SideS=SideS;
        this.TowC=TowC;
        if(SideS)
        {
            st="Yes";
        }else
        {
            st="Now";
        }

    }

    //Getters
    public Boolean getSideS(){
        return SideS;
    }

    public Integer getTowC(){
        return TowC;
    }
    //Setters
    public void setVariables(String Mak, String Mod, Integer Ye, Integer Pric, Integer Mp, Boolean FW, Boolean Side, Integer Tow) {
        super.setVariables(Mak, Mod, Ye, Pric, Mp, FW);
        SideS= Side;
        TowC= Tow;
        if(SideS)
        {
            st="Yes";
        }else
        {
            st="Now";
        }
    }

    //Printing FUnction
    @Override
    public String toString() {
        String newLine = System.getProperty("line.separator");
        return super.toString()+ newLine +"Tow capacity: "+ TowC+ " tons" + newLine+ "Side step? "+st;
    }
}
