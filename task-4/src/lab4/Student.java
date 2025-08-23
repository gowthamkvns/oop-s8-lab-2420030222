package lab4;

class Student {
    private int rollNumber;
    protected String grade;
    public String name;

    public void setDetails(int rollNumber, String grade, String name) {
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.name = name;
    }

    public void showDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Name: " + name);
    }
}
