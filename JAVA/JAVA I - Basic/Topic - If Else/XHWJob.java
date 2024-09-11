//You're creating a program to evaluate job applicants based on their qualifications and
//experience. Implement a Java program using if-else statements to assess the eligibility of
//each applicant for a job position.
import java.util.Scanner;
public class XHWJob {
        public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
            String RQualification="Btech";
            int RExperience=1;

            System.out.print("Enter your Qualification: ");
            String Qualification=sc.nextLine();

            System.out.print("Enter your Experience in years: ");
            int Experience=sc.nextInt();

            if (Qualification==RQualification){
                if (Experience>=RExperience){
                    System.out.println("You are eligible");
                }else {
                    System.out.println("Sorry, you do not have enough experience.");
                }
            }else {
                System.out.println("orry! You are not eligible due to insufficient qualifications.");
            }
        }
    }