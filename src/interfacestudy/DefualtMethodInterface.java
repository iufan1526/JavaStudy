package interfacestudy;

public interface DefualtMethodInterface {

    final static int COUNTRY_CODE = 50;
    final static String COUNTRY_CODE_NAME = "한국";

    default int getCountryCode() {
        return DefualtMethodInterface.COUNTRY_CODE;
    }

    default String getName() {
        return DefualtMethodInterface.COUNTRY_CODE_NAME;
    }
}
