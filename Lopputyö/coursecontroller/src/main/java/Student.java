public class Student {
    private long StudentId;
    private String FirstName;
    private String LastName;

    private static long idCounter = 0;

    public Student(){
        this("","",0);
    }

    public Student(String FirstName, String LastName, long id) {
        this.StudentId = idCounter++;
        this.FirstName = FirstName;
        this.LastName = LastName;
    }


    public long getStudentId() {
        return this.StudentId;
    }

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    @Override
    public String toString() {
        return this.LastName + " " + this.FirstName;
    }    
}
