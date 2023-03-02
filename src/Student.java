public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private int semester;
    private double average;
    public double getGeneralAverage(long controlNumber) {
        return 0.0;
    }
    public double getSemesterAverage(long controlNumber,int semester) {
        return 0.0;
    }
    public double getSubjectGrade(long controlNumber,String subject) {
        return 0.0;
    }
    //get y set de los atributos
    public long getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(long controlNumber) {
        this.controlNumber = controlNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getCareer() {
        return career;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public int getSemester() {
        return semester;
    }
    public void setSemester(int semester) {
        this.semester = semester;
    }
    public Double getAverage() {
        return average;
    }
    public void setAverage(Double average) {
        this.average = average;
    }

}
