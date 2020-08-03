package Day_13_Scanner;
/*write a program that can display the selected browser

            1.1  declear a String variable called browserName

            1.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge

            1.3. if the browser name does not match with the valid browsers' names,

                    out put should be: Invalid Browser Name

        Do Not use: scanner, if statement, and ternary */
public class Brousers {
    public static void main(String[] args) {
        String browserName = "safari";
        // boolean, long, double, float
        switch(browserName){
            case "chrom":
                System.out.println("Open Chrome Browser");
                break;
            case "opera":
                System.out.println("Open Opera Browser");
                break;
            case "safari":
                System.out.println("Open Safari Browser");
                break;
            case "Edge":
                System.out.println("Open Edge Browser");
                break;
            default:
                System.out.println("Invalid Browser");
        }
    }


}
