package Day_40_CustomeClassPractice;

public class Offer {

    /*
Offer
		Attribute:
			salary, Location, hasPTO, isFullTime, WFH, jobTitle, hasBenefit
		Actions:
			setOfferInfo
			getOfferInfo
		MUST use this keyword
 */

        double salary;
        String state;
        boolean hasPTO;
        boolean isFullTime;
        boolean isWFH;
        String jobTitle;
        boolean hasBenefit;

public void setOfferInfo(double salary, String state, boolean hasPTO, boolean isFullTime,boolean isWFH, String jobTitle, boolean hasBenefit ) {
    this.salary = salary;
    this.state = state;
    this.hasPTO = hasPTO;
    this.isFullTime = isFullTime;
    this.isWFH = isWFH;
    this.jobTitle = jobTitle;
    this.hasBenefit = hasBenefit;
}
public void getOfferInfo(){
    System.out.println();



    }
}
