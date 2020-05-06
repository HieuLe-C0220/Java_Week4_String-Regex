public class AccountExampleTest {
    private static AccountExample accountExample;
    public static final String[] validAccount = new String[] {"12_abc","abc_123","n___2","123456_","abcdefgh"};
    public static final String[] invalidAccount = new String[] {".@","12345","1234_","abcde"};

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account : validAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
        for (String account : invalidAccount) {
            boolean isvalid = accountExample.validate(account);
            System.out.println("Account is "+account+" is valid: "+isvalid);
        }
    }
}
