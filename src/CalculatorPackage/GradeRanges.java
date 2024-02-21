package CalculatorPackage;

public class GradeRanges {
    
    public static String getGradeLetter(double gpa) {
        if (gpa >= 0.7 && gpa < 1.0) {
            return "A+";
        } else if (gpa >= 1.0 && gpa < 1.3) {
            return "A";
        } else if (gpa >= 1.3 && gpa < 1.7) {
            return "A-";
        } else if (gpa >= 1.7 && gpa < 2.0) {
            return "B+";
        } else if (gpa >= 2.0 && gpa < 2.3) {
            return "B";
        } else if (gpa >= 2.3 && gpa < 2.7) {
            return "B-";
        } else if (gpa >= 2.7 && gpa < 3.0) {
            return "C+";
        } else if (gpa >= 3.0 && gpa < 3.3) {
            return "C";
        } else if (gpa >= 3.3 && gpa < 3.7) {
            return "C-";
        } else if (gpa >= 3.7 && gpa <= 4.0) {
            return "D+";
        } else if (gpa >= 4.0 && gpa <= 5.0) {
            return "D";
        } else {
            return "F";
        }
}
}
