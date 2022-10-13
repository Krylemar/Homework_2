public class StudentGroup {
    private String major;
    private int grade;
    private String group;
    private int studentCount;

    public StudentGroup(String major, int grade, String group, int studentCount) {
        this.major = major;
        this.grade = grade;
        this.group = group;
        this.studentCount = studentCount;
    }

    public String getMajor() {
        return major;
    }

    public int getGrade() {
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
        return studentCount == that.studentCount && major.equals(that.major) && grade == that.grade && group.equals(that.group);
    }

    public static void main(String[] args) {
        StudentGroup[] groups = new StudentGroup[10];
        groups[0] = new StudentGroup("SIT",2,"3",30);
        groups[1] = new StudentGroup("KST",1,"5",28);
        groups[2] = new StudentGroup("IKT",4,"1",7);
        groups[3] = new StudentGroup("VEI",3,"1",25);
        groups[4] = new StudentGroup("ESEO",2,"3",15);
        groups[5] = new StudentGroup("II",4,"4",14);
        groups[6] = new StudentGroup("ID",1,"1",30);
        groups[7] = new StudentGroup("IM",2,"5",12);
        groups[8] = new StudentGroup("KMM",4,"3",32);
        groups[9] = new StudentGroup("SIT",3,"2",24);

        int indexOf1stGrade=0,indexOf2ndGrade,indexOf3rdGrade,indexOf4thGrade;

    }
}
