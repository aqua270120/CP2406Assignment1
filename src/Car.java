public class Car {
    private final int NEXT_ROAD_INDEX = 0;
    private final int START_POSITION = 0;
    //Attributes
    protected float breadth;
    protected float length;
    protected String id;
    protected int speed;
    protected int position;
    protected int gasLevel;
    protected Road currentRoad = new Road();

    //Constructors
    public Car(String id, Road currentRoad) {
        this.id = id;
        this.currentRoad = currentRoad;
        this.length = 1f;
        this.breadth = length * 0.5f;
        this.speed = 1;
        this.position = 0;
        this.gasLevel = this.currentRoad.getLength(); // set gas Level equals to road length
    }

    public Car() {
        this.id = "0";
        this.length = 1f;
        this.breadth = length * 0.5f;
        this.speed = 1;
        this.position = 1;
        this.gasLevel = this.currentRoad.getLength();
    }

    //Get set methods


    public int getGasLevel() {
        return gasLevel;
    }

    public void setGasLevel(int gasLevel) {
        this.gasLevel = gasLevel;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Road getCurrentRoad() {
        return currentRoad;
    }

    public void setCurrentRoad(Road currentRoad) {
        this.currentRoad = currentRoad;
    }


    //Input output methods
    public void showOutPut() {
        System.out.println("Car " + this.id + " Gas Level: " + this.gasLevel + " going: " + this.speed + "dm/s on road "
                + this.currentRoad.getId() + " at position " + this.position);
    }

    //Business methods
    public void move() {
        this.speed = this.currentRoad.getSpeedLimit();
        if (!this.currentRoad.getLigthsOnRoad().isEmpty()) {
            if (this.position == this.currentRoad.getLigthsOnRoad().get(0).getPosition()[0]) {
                if (this.currentRoad.getLigthsOnRoad().get(0).getState().equals("RED")) {
                    this.speed = 0;
                } else {
                    if (!this.currentRoad.getConnectedRoads().isEmpty()) {
                        this.currentRoad.getCarsOnRoad().remove(this);
                        Road nextRoad = this.currentRoad.getConnectedRoads().get(NEXT_ROAD_INDEX);
                        this.gasLevel = this.currentRoad.getGasStationList().get(0).reFillGas(this.gasLevel, nextRoad);
                        this.currentRoad = nextRoad;
                        this.currentRoad.getCarsOnRoad().add(this);
                        this.position = START_POSITION;
                    }
                }
            }
        }
        if (this.currentRoad.getLength() > this.getPosition()) {
            this.position += this.speed;
            this.gasLevel -= this.speed;
        } else if (this.currentRoad.getLength() < this.getPosition()) {
            this.speed = 0;
        } else {
            this.speed = 0;
        }
    }
}

