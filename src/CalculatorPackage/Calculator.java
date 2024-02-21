package CalculatorPackage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
//import CalculatorPackage.Course;

public class Calculator {
    public static HashMap<String, Double> gucgrades; //a hashmap to store grades and their corresponding values

    static {
        gucgrades = new HashMap<>();
        gucgrades.put("A+", 0.7);
        gucgrades.put("A", 1.0);
        gucgrades.put("A-", 1.3);
        gucgrades.put("B+", 1.7);
        gucgrades.put("B", 2.0);
        gucgrades.put("B-", 2.3);
        gucgrades.put("C+", 2.7);
        gucgrades.put("C", 3.0);
        gucgrades.put("C-", 3.3);
        gucgrades.put("D+", 3.7);
        gucgrades.put("D", 4.0);
        gucgrades.put("F", 5.0);
   }

   public static double calculateGPA (List <Course> courses){
        double totalcredithours = 0;
        double totalgradepoints = 0;
        for (Course course : courses){ //loop on every course in the courses list to get its credits and grade
            double credithours = course.getCreditHours();
            String grade = course.getGrade();

            if (gucgrades.containsKey(grade)){
                totalcredithours += credithours;
                totalgradepoints += credithours * gucgrades.get(grade);
            }
        }

        double finalGPA = totalgradepoints/totalcredithours;
        return finalGPA;
   }

   public static void main (String[] args){
        List <Course> courses = new ArrayList<>();
        courses.add(new Course(6, "A"));
        courses.add(new Course(4, "B+"));
        courses.add(new Course(3, "A+"));

        double gpa = calculateGPA(courses);
        String gradeLetter = GradeRanges.getGradeLetter(gpa);
        System.out.println("GPA = " + gpa + " (" + gradeLetter + ")");
   }
}
