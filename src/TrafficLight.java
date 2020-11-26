public class TrafficLight {
    private static final String GREEN = "green";
    private static final String RED = "red";
    private final double CHANGE_COLOR_RATE = 0.5;
    //Attributes
    private String id;
    private String state;
    private int[] position;
    private Road roadBelongTo;
    //Get set methods

    public TrafficLight(String id, Road roadBelongTo) {
        this.id = id;
        this.roadBelongTo = roadBelongTo;
        state = RED;
        this.roadBelongTo.getLigthsOnRoad().add(this);
        position = new int[]{this.roadBelongTo.getLength(),0};
    }

    public TrafficLight() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int[] getPosition() {
        return position;
    }

    public void setPosition(int[] position) {
        this.position = position;
    }

    //Constructors

    public Road getRoadBelongTo() {
        return roadBelongTo;
    }

    public void setRoadBelongTo(Road roadBelongTo) {
        this.roadBelongTo = roadBelongTo;
    }

    //Input output methods
    public void showLightInfo() {
        System.out.printf("Light %s on road %s is : %s at position %s%n",
                this.id, this.roadBelongTo.getId(), this.state, (this.position[0] + "," + this.position[1]));
    }

    //Business methods
    public void operate() {

    }
}
