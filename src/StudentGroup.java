public class StudentGroup {
    String major;
    String grade;
    String group;
    int studentCount;

    public StudentGroup(String major, String grade, String group, int studentCount) {
        this.major = major;
        this.grade = grade;
        this.group = group;
        this.studentCount = studentCount;
    }

    public String getMajor() {
        return major;
    }

    public String getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    public int getStudentCount() {
        return studentCount;
    }

    @Override
    public String toString() {
        return "StudentGroup { " +
                "major = '" + major + '\'' +
                ", grade = '" + grade + '\'' +
                ", group = '" + group + '\'' +
                ", studentCount = " + studentCount +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentGroup that = (StudentGroup) o;
        return studentCount == that.studentCount && major.equals(that.major) && grade.equals(that.grade) && group.equals(that.group);
    }

    public static void main(String[] args) {

    }
}
