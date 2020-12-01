
import java.util.Random;

public class GasStation {
    //Attributes
     Random rd = new Random();
    private String id;
    private String status;
    private int[] position;
    private Road roadLocatedOn;
    private final double OPEN_RATE = 50;
    private final String OPEN = "OPEN";
    private final String CLOSE = "CLOSE";

    //Get set methods
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    public Road getRoadLocatedOn() {
        return roadLocatedOn;
    }

    public void setRoadLocatedOn(Road roadLocatedOn) {
        this.roadLocatedOn = roadLocatedOn;
    }

    //Constructors
    public GasStation(String id, Road roadBelongTo) {
//        position = new int[]{rd.nextInt(this.roadLocatedOn.getLength()) ,0};
        this.roadLocatedOn = roadBelongTo;
        position = new int[]{rd.nextInt(this.roadLocatedOn.getLength()),0};
        this.id = id;
        this.roadLocatedOn.getGasStationList().add(this);
    }

    public GasStation() {


    }

    //Input output methods
    public void showInfo(){
        System.out.println("Gas_" +this.id + " locate at position " + this.position[0] + " on road " + this.roadLocatedOn.getId());
    }

    //Business methods
    public void operate(){
        Random rd = new Random();
        int possibility = rd.nextInt(100);

        if (possibility > OPEN_RATE) {
            this.status = OPEN;
        } else {
            this.status = CLOSE;
        }
    }

}
