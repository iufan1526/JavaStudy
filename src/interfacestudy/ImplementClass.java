package interfacestudy;

public class ImplementClass implements  DefualtMethodInterface{

    @Override
    public int getCountryCode() {
        return DefualtMethodInterface.super.getCountryCode();
    }

    public static void main(String[] args) {

        ImplementClass imple = new ImplementClass();

        System.out.println("imple = " + imple.getCountryCode());
    }
}
