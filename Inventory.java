/**
 * Created by Daniel on 9/23/2016.
 */
import java.util.ArrayList;
import java.util.List;

public class Inventory{

    //List
    List<Vehicle> track;

    //Constructor
    public Inventory(){
        track= new ArrayList<Vehicle>();
    }

    //Adding vehicle
    public void add(Vehicle vehicle){

        track.add(vehicle);
    }
    //Remove
    public void remove(Vehicle vehicle){
        track.remove(vehicle);

    }

    Vehicle findCheapestVehicle(){
        //variables
        Integer min=track.get(0).getPrice(), index=0;

        //finding min price
        for (Integer i=1;i<track.size();i++){
            if(min > track.get(i).getPrice()){
                min=track.get(i).getPrice();
                index=i;
            }
        }
        return track.get(index);
    }

    Vehicle findMostExpensiveVehicle(){
        //variables
        Integer max=0, index=0;

        //finding max price
        for(Integer i=0;i<track.size();i++){
            if(track.get(i).getPrice()> max){
                max=track.get(i).getPrice();
                index=i;
            }
        }

        return track.get(index);

    }

    public void printAveragePriceOfAllVehicles(){
        //variables
        double sum=0, average=0;

        //adding prices
        for(Integer i=0;i<track.size();i++){
            sum+=track.get(i).getPrice();
        }
        //finding average
        average=(sum/(track.size()+1));

        //Printing average of prices
        System.out.println("The average of the prices is: $"+ average);
    }

}
