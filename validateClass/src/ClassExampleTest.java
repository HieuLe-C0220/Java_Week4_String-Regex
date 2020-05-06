public class ClassExampleTest {
    private static ClassExample classExample;
    public static final String[] validAccount = new String[] {"CA0318G","C0220I","A1119H","P0619L"};
    public static final String[] invalidAccount = new String[] {"B03186","C0220A","P1119F","P06198"};

    public static void main(String[] args) {
        classExample = new ClassExample();
        for (String class1: validAccount){
            boolean isvalid = classExample.validate(class1);
            System.out.println("Class is "+class1+" is valid: "+isvalid);
        }
        for (String class2: invalidAccount){
            boolean isvalid = classExample.validate(class2);
            System.out.println("Class is "+class2+" is valid: "+isvalid);
        }
    }
}
