public class Student {
    private long controlNumber;
    private String name;
    private String lastName;
    private String career;
    private Short semester;
    private Double average;
    public double getGeneralAverage(long controlNumber) {
        return 0.0;
    }
    public double getSemesterAverage(long controlNumber,Short semester) {
        return 0.0;
    }
    public double getSubjectGrade(long controlNumber,String materia) {
        return 0.0;
    }

    public long getControlNumber() {
        return controlNumber;
    }
    public void setControlNumber(Long controlNumber) {
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
    public Short getSemester() {
        return semester;
    }
    public void setSemester(Short semester) {
        this.semester = semester;
    }
    public Double getAverage() {
        return average;
    }
    public void setAverage(Double average) {
        this.average = average;
    }
}
