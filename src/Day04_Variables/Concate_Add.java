package Day04_Variables;

public class Concate_Add {
    public static void main(String[] args) {
        //addition:
        System.out.println(12+13);      // 1213, 25
        System.out.println('A' + 2);    // A2,67
        System.out.println('A' + 'B');  //131

        //Concatination: append
        System.out.println("12" + 13);  // "12" is text (string)= 1213
        System.out.println("A" +2);   // "A" is text (string) =A2
        System.out.println("Gender: "+'M'); // Gender:M
        System.out.println("Tax: "+3.5+'%'); //Tax: 3.5%
                       // ("Tax: 3,5" +'+')
        System.out.println(3.5+'%' +"Tax"); //3.5+37+"Tax"
                                            //40.5 + "Tax"
                                            //40.5 Tax

    }
}
