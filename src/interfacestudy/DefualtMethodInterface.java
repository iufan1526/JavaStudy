package interfacestudy;

public interface DefualtMethodInterface {

    final static int COUNTRY_CODE = 50;

    default int getCountryCode() {
        return DefualtMethodInterface.COUNTRY_CODE;
    }
}
