package Day_31_Recap;
import Library.Util;
public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AABBBCCC";
        String expectedResult = "";  //A2B3C3
        String nonDup =  Util.removeDup(str);    //ABC
        char ch1 = nonDup.charAt(0);
        int count1 = Util.frequency(str,ch1);
        expectedResult += ""+ch1 +count1;
        System.out.println(expectedResult);

    }
}
