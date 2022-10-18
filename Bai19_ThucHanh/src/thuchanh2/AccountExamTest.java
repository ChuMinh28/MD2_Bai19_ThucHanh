package thuchanh2;

public class AccountExamTest {
    private static AccountExample accountExample;
    public static final String[] validateAccount = new String[] {"123abc_",
    "_abc123","______","abcdefgh"};
    public static final String[] invalidAccount = new String[] {
            ".@","12345","123_","abcde"
    };

    public static void main(String[] args) {
        accountExample = new AccountExample();
        for (String account:validateAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: "+account+" is valid "+isValid);
        }
        for (String account:invalidAccount) {
            boolean isValid = accountExample.validate(account);
            System.out.println("Account: "+account+" is valid "+isValid);
        }
    }
}
