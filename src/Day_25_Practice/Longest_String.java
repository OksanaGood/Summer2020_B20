package Day_25_Practice;

public class Longest_String {

    public static void main(String[] args) {

        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abuduljabar", "mamattursun"
                , "Gebremariam", "VasilicaPutulica"};

        int maxLength = arr[0].length();

        for( String each : arr){ // to find max length
            if( each.length() > maxLength ){
                maxLength = each.length();
            }
        }


        for(String each: arr){
            if(each.length() == maxLength){
                System.out.println(each);
            }
        }





    }

}