import java.util.Scanner;

    //This program is used to determine if you will be eligible for a bonus
    public class bonus {

        public static void main (String[] args){

            Scanner read = new Scanner(System.in);
            //This is the amount of years the person has worked at their company
            int yearsWorked;
            System.out.print("How many years have you worked at your company?: ");
            yearsWorked = read.nextInt();

            //This is a percentage of the person's salary in an integer
            int percentage;
            System.out.print("What would you like your bonus to be as a percentage of your salary?\n ex: type 1 for 1% bonus: ");
            percentage = read.nextInt();

//Since the program will be reading a string after the int, this scan will be needed to clear the memory
            read.nextLine();

            //This variable will be used to help the individual rate their performance.
            String performance;
            System.out.print("How would you rate your performance this year? below average, average, above average: ");
            performance = read.nextLine();

/*If the person has worked 2 or more years at their company, wan'ts less than a 10 percent bonus,
 and they have an above average performance, they are eligble for a bonus
 */
            if (yearsWorked >=2 && percentage<10 && performance.equals("above average")) {
                System.out.println("You are eligible for a bonus! Time to get paid!!");

            }
            //If they are asking for too high of a bonus, then they are not eligible and are notified
            else if(percentage>10) {
                System.out.println("You are not eligible for a bonus at this time. The amount you desire is too high");
            }
            //If their performance is not above average, they are not eligible and are notified
            else if (performance!= "above average") {
                System.out.println("You are not eligible for a bonus. You need to work on your performance.");
            }
//If they have not worked at least two years at their company, they are not eligible and are notified
            else if (yearsWorked <2) {
                System.out.println("You are not eligible for a bonus. You need more experience.");
            }
            else{

                System.out.println("You are not eligible for a bonus at this time");
            }

        }
    }

