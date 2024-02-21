## GUC Calculator API

The GUC Calculator API is a Java application that calculates the GPA for GUC students based on a list of courses and their grades. It uses a predefined set of grade values to calculate the GPA.

## Getting Started
> Open the project in your preferred Java development environment (e.g., Eclipse, IntelliJ IDEA).

> Build the project to compile the source code.

> Run the Calculator class to execute the main method and calculate the GPA.

> To calculate the GPA, create a list of Course objects, each representing a course with its credit hours and grade. Then, pass this list to the calculateGPA method in the Calculator class.

- Example Usage:
  
        List <Course> courses = new ArrayList<>();
        courses.add(new Course(6, "A"));
        courses.add(new Course(4, "B+"));
        courses.add(new Course(3, "A+"));

        double gpa = calculateGPA(courses);
        String gradeLetter = GradeRanges.getGradeLetter(gpa);
        System.out.println("GPA = " + gpa + " (" + gradeLetter + ")");

## Contributions
Contributions are welcome! If you find any issues or have suggestions for improvements, please open an issue or create a pull request.
