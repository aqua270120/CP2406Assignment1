public class Car {
    //Attributes
    protected float length;
    protected float breadth;
    protected String id;
    protected int speed;
    protected int position;
    protected Road currentRoad = new Road();

    //Get set methods

    //Constructors
    public Car(String id) {
        this.id = id;
//        this.currentRoad = currentRoad;
        length = 1f;
        breadth = length * 0.5f;
        speed = 1;
        position = 1;

    }

    public Car() {
        id = "0";
        length = 1f;
        breadth = length * 0.5f;
        speed = 1;
        position = 1;
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
        System.out.println("This is car, length: " + this.length);
    }
    //Business methods
}
