import java.util.Scanner;
public class Exam2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        
        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // // 1. Create a method that will:
        // // print "ODD" if the last two digits of your student number is an odd number
        // // print "EVEN" if the last two digits of your student number is an even number.
        // // (10 pts)
            System.out.println("1. ODD or EVEN numbers");
            System.out.print("Enter the last two digits of your student number: ");
            int num1 = scan.nextInt();
            if (num1 % 2 == 0){
                System.out.println("EVEN");
            } else {
                System.out.println("ODD");
            }

        // ==============================================================================

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int num = scan.nextInt();
        int i;
        int count = 0;
        for(i=1; i<=num; i++){
            if(num1 % i == 0)count++;
        }
        if(count > 2){
            System.out.format("%d is a composite number", num);  
        } else {
        System.out.format("%d is not a composite number", num);
        }
    
        // ==============================================================================

        // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("");
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        String txt = firstName + surName;
        System.out.println(txt.length());


        // ==============================================================================

        // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        if( firstNumber >= secondNumber && thirdNumber >= thirdNumber){
            System.out.println("The largest number is " +firstNumber);
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber){
            System.out.println("The largest number is " +secondNumber);
        }
        else {
            System.out.println("The largest number is " + thirdNumber);
        } 

        // ==============================================================================

        // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)

        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        String studentNumber = scan.next();
        String sixDigits = studentNumber.substring(3,9);
        System.out.println(sixDigits);


        // =========================================================================================================================

        // Part II
        // Print "valid" if the result is true.
        // Print "invalid" if the result is false.

        // ==============================================================================
        // 6. Create a condition to check if the entered student number is your student
        // // number. (10 pts)

        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: ");

        String sNumber = scan.next();
        if (sNumber.length() == 10){
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }

        // // ==============================================================================

        // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        String fName = scan.next();

        if (fName == fName.toUpperCase()) {
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }

        System.out.print("Enter your surname in lowercase: ");
        String sName = scan.next();

        if (sName == sName.toLowerCase()) {
            System.out.println("VALID");
        }else{
            System.out.println("INVALID");
        }
        // ==============================================================================
        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();
        switch(course){
            case "BSIT": 
                System.out.println("VALID");
                System.out.println("Enter your specialization (MWAA or MAA)");
                String specialization1 = scan.next();
                    switch (specialization1) {
                        case "MWAA":
                            System.out.println("VALID");
                            break;
                        case "MAA":
                            System.out.println("VALID");
                            break;
                        default:
                            System.out.println("INVALID");
                        return;
                    }
            break;
    
            case "BSCS":
                System.out.println("VALID");
                System.out.println("Enter your specialization (DF or ML)");
                String specialization2 = scan.next();
                    switch (specialization2){
                    case "DF":
                        System.out.println("VALID");
                        break;
                    case "ML":
                        System.out.println("VALID");
                        break;
                    default:
                        System.out.println("INVALID");
                    return;
            }
            break;
        }
        // // ==============================================================================

        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIME

        System.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");

        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch(strand){
            case "STEM":
                System.out.println("VALID");
                break;
            case "ICT":
                System.out.println("VALID");
                break;
            case "HUMSS":
                System.out.println("VALID");
                break;
            case "HOME ECONOMICS":
                System.out.println("VALID");
                break;
            case "ARTS AND DESIGN":
                System.out.println("VALID");
                break;
            case "TVL MARITIME":
                System.out.println("VALID");
                break;
            default:
                System.out.println("INVALID");
        }  
        */
        // ==============================================================================
        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.nextLine();

        if (studentEmailAddress.contains("@students.national-u.edu.ph")){
            System.out.println("VALID");
        } else {
            System.out.println("INVALID");
        }
        // ==============================================================================
        // Programming competition/Job interview level question (20 points)
        // 11. Mystery method :-)
        // Find the formula of method f(n) that accepts any positive integer n.
        // If n = 4, result is 2
        // f(4) = - 1 + 2 - 3 + 4 = 2

        // If n = 5, result is -3
        // f(5) = - 1 + 2 - 3 + 4 - 5 = - 3
        // int num1 = scan.nextInt();
        // num1 = (num1*(num1-num1));
        // num1 = results;
        // System.out.println(results);
        }
    }
