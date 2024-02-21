package CalculatorPackage;

public class Course {

    public double credithours;
    public String grade;

    public Course (double credithours, String grade){
        this.credithours = credithours;
        this.grade = grade;
    }

    //credithours and grade getter methods:

    public double getCreditHours (){
        return credithours;
    }

    public String getGrade (){
        return grade;
    }

}
