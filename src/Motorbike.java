public class Motorbike extends Car {
    //Attributes
    //Get set methods
    //Constructors

    public Motorbike(String id) {
        super(id);
        length = super.getLength() * 0.5f;
    }

    public Motorbike() {
        length = super.getLength() * 0.5f;
    }
    //Input output methods

    @Override
    public void showOutPut() {
        System.out.println("This is motorbike, length is " + length);
    }
    //Business methods
}
