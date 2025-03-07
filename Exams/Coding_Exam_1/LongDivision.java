import java.util.Scanner;

public class LongDivision {
	/**
	* CSU HONOUR PLEDGE
	* YOUR NAME: Alejandro Lopez
	* PLEASE TYPE THE CSU HONOUR PLEDGE ON THE LINE BELOW
	* I have not given, received, or used any unauthorized assistance
	*/
    //Given Variable modify at your OWN RISK
	private static final Scanner scanner = new Scanner(System.in);
    private int quotient;
    private int remainder;

    //TODO Write Getters and Setters
    //setQuotient and getQuotient
    public void setQuotient(int quotient) {
        this.quotient = quotient;
    }

    public int getQuotient() {
        return quotient;
    }

    //setRemainder and getRemainder
    public void setRemainder(int remainder) {
        this.remainder = remainder;
    }

    public int getRemainder() {
        return remainder;
    }

    //Complete getFormattedString
    //Must return a string in the following format including the curly braces {}
    // {quotient: ##, remainder: ##}
    public String getFormattedString() {
        return "{quotient: " + quotient + ", remainder: " + remainder + "}";
    }

    // static methods
    public static LongDivision buildLongDivision(int value1, int value2) {
        LongDivision division = new LongDivision();
        //Complete the steps to correctly calculate the long division
        int calcQuotient = value1 / value2;
        int calcRemainder = value1 % value2;

        division.setQuotient(calcQuotient);
        division.setRemainder(calcRemainder);
        return division;
    } 
    
    //Print the message from the program then request an integer from the scanner
    public static int inputInt(String msg) {
        System.out.print(msg);
        return scanner.nextInt();
    }
    
    //Print the message from the program then request a response from the user and return only the FIRST letter from the user
    public static char inputChar(String msg) {
        String userInput;
        System.out.print(msg);
        userInput = scanner.next();
        return userInput.charAt(0);
    }

    public static void run() {
        char answer= 'y';
        //Convert this next 5 lines of code into a while loop that will loop as long as "answer" is the letter 'y'
        while (answer == 'y' ) {
        int value1 = inputInt("Enter a number: ");
        int value2 = inputInt("Enter another number: ");
        LongDivision div = LongDivision.buildLongDivision(value1, value2);
        System.out.println(div.getFormattedString());
        answer = inputChar("Do you want to run again (yes or no)? ");
        }
    }

	public static void main(String[] args) {
        //We will not execute your main, use this space to test your code
        // LongDivision test = buildLongDivision(1, 1);
        // System.out.println(test.getQuotient());
        // System.out.println(test.getRemainder());
        // System.out.println(test.getFormattedString());

        // LongDivision test_10_over_2 = buildLongDivision(10, 2);
        // System.out.println(test_10_over_2.getQuotient());
        // System.out.println(test_10_over_2.getRemainder());
        // System.out.println(test_10_over_2.getFormattedString());

        // LongDivision test_11_over_2 = buildLongDivision(11, 2);
        // System.out.println(test_11_over_2.getQuotient());
        // System.out.println(test_11_over_2.getRemainder());
        // System.out.println(test_11_over_2.getFormattedString());
		run();
	}
     
}

