public class student {

    String surName;
    String firstName;
    String middleInitial;
    String dateOfBirth;
    int studentNumber;
    String studentEmailAddress;
    boolean iAmAwesome;
    
    public void sayMyName() {
        System.out.println("Hi, My name is " + surName + firstName +  middleInitial + "\n" + "Date of my birth id " + dateOfBirth + " With Student number " + studentNumber + "," + "\n" + "Email: " + studentEmailAddress + "And my awesomeness is " + iAmAwesome);
        }
        public student(String sN, String fN, String mI, String dOB, int stN, String sEA, boolean iAA){
            surName = sN;
            firstName = fN;
            middleInitial = mI;
            dateOfBirth = dOB;
            studentNumber = stN;
            studentEmailAddress = sEA;
            iAmAwesome = iAA;
        }
}

    
