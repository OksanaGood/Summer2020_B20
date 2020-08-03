package Day08_LogicalOperators;

public class Practice {

    public static void main(String[] args) {

        String firstname = "Aaron";
        String lastname = "Daniel";
        int age = 19;
        String citizenShip = "USA";
        boolean eligibleToVote = age >= 18 && citizenShip == "USA";
        //                        19>=18   &&  "USA"    =="USA"
        //                         true    &&   true
        String fullname = firstname+" "+lastname;
        System.out.println(fullname + " is eligible to vote: " + eligibleToVote);

        System.out.println(eligibleToVote); //Aaron Daniel is eligible to vote: true
    }
}
