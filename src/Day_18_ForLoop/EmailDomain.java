package Day_18_ForLoop;

public class EmailDomain {
    public static void main(String[] args) {
        String email = "oksana@mail.ru";
        //              12345678
        int index1 = email.indexOf("@"); //7
        int index2 = email.lastIndexOf(".");
        String domain = email.substring(index1 +1, index2); // "gmail
        //                                8    ,   index2
        System.out.println(domain);
    }
}
