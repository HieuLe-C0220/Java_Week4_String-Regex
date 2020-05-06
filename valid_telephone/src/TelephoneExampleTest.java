public class TelephoneExampleTest {
    private static TelephoneExample telephoneExample;
    public static final String[] validTelephone = new String[] {"(84)-(0912345678)","(06)-(0987654321)"};
    public static final String[] invalidTelephone = new String[] {"(a4)-(0912345678)","(0b)-(0987654321)"};

    public static void main(String[] args) {
        telephoneExample = new TelephoneExample();
        for (String telephone1 : validTelephone) {
            boolean isvalid = telephoneExample.validate(telephone1);
            System.out.println("Telephone is "+telephone1+" is valid: "+isvalid);
        }
        for (String telephone2 : invalidTelephone) {
            boolean isvalid = telephoneExample.validate(telephone2);
            System.out.println("Telephone is "+telephone2+" is valid: "+isvalid);
        }
    }
}
