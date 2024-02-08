import java.util.Scanner;

public class Details {
    static double marks(double math, double hindi, double sanskrit, double science, double S_science) {
        return math + hindi + sanskrit + science + S_science;
    }

    static String Student(String name) {
        return name;
    }

    static long Number(long mobileNo) {
        return mobileNo;
    }

    static String email(String email) {
        return email;
    }
}

class StudentDetails {
    public static void main(String[] args) {
    System.out.println("\nTHIS IS THE STUDENT DATA DETAILS PROGRAM\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("\tEnter math marks: ");
        double math = sc.nextDouble();

        System.out.print("\tEnter hindi marks: ");
        double hindi = sc.nextDouble();

        System.out.print("\tEnter sanskrit marks: ");
        double sanskrit = sc.nextDouble();

        System.out.print("\tEnter science marks: ");
        double science = sc.nextDouble();

        System.out.print("\tEnter Social marks: ");
        double S_science = sc.nextDouble();

        System.out.print("\tEnter Student Name: ");
        String name = sc.next();

        System.out.print("\tEnter Mobile No. : ");
        long mobileNo = sc.nextLong();

        System.out.print("\tEnter your email: ");
        String email = sc.next();
        System.out.println();

        System.out.println("==============================================");
        System.out.println("|\tStudent Name: " + Details.Student(name) + "            |");
        System.out.println("|\tMobile No. : " + Details.Number(mobileNo) + "              |");
        System.out.println("|\tEmail-id: " + Details.email(email) + "  |");
        System.out.println(
                "|\tTotal Marks: " + Details.marks(math, hindi, sanskrit, science, S_science) + " out of 500        |");
        System.out.println("|\tPercentage: " + Details.marks(math, hindi, sanskrit, science, S_science) / 5
                + "                     |");
        System.out.println("==============================================");
        sc.close();
    }
}

/*
THIS IS THE STUDENT DATA DETAILS PROGRAM


        Enter math marks: 84
        Enter hindi marks: 83
        Enter sanskrit marks: 78
        Enter science marks: 67
        Enter Social marks: 75
        Enter Student Name: SURAJ_KUAMR 
        Enter Mobile No. : 6206546029
        Enter your email: surajkumarbgu83@gmail.com

==============================================
|       Student Name: SURAJ_KUAMR            |
|       Mobile No. : 6206546029              |
|       Email-id: surajkumarbgu83@gmail.com  |
|       Total Marks: 387.0 out of 500        |
|       Percentage: 77.4                     |
==============================================
*/