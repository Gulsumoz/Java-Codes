public class Student {

    private String Name;
    private String Lastname;
    private int Grade;



    public Student( String first, String last, int grd ){
        this.Name=first;
        this.Lastname= last;
        this.Grade=grd;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }
}
