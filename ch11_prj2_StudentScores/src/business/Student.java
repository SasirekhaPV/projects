package business;

public class Student implements Comparable {

    private String firstName;
    private String lastName;
    private int score;

    public Student(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }

    public Student() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int compareTo(Object o) {
        Student s = (Student) o;

        if (this.getLastName().compareToIgnoreCase(s.getLastName()) < 0) {
            return -1;
        } else if (this.getLastName().compareToIgnoreCase(s.getLastName()) > 0) {
            return 1;
        } else {
            if (this.getFirstName().compareToIgnoreCase(s.getFirstName()) < 0) {
                return -1;
            } else if (this.getFirstName().compareToIgnoreCase(s.getFirstName()) > 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
