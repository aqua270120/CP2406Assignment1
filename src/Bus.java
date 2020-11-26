public class Bus extends Car {
    //Attributes
    //Get set methods
    //Constructors

    public Bus(String id) {
        super(id);
        length = super.getLength() * 3;
    }

    public Bus() {
        length = super.getLength() * 3;
    }

    //Input output methods
    @Override
    public void showOutPut() {
        System.out.println("This is bus with length is " + length);
    }
    //Business methods
}
