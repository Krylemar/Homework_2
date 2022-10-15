public class StudentGroup {
    private String major;
    private int grade;
    private int group;
    private int studentCount;

    public StudentGroup(String major, int grade, int group, int studentCount) {
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

    public int getGroup() {
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
        return studentCount == that.studentCount && major.equals(that.major) && grade == that.grade && group == that.group;
    }

    public static void main(String[] args) {
        StudentGroup[] groups = new StudentGroup[10];
        groups[0] = new StudentGroup("SIT",2,3,30);
        groups[1] = new StudentGroup("KST",1,5,28);
        groups[2] = new StudentGroup("IKT",4,1,7);
        groups[3] = new StudentGroup("VEI",3,1,25);
        groups[4] = new StudentGroup("ESEO",2,3,15);
        groups[5] = new StudentGroup("II",4,4,14);
        groups[6] = new StudentGroup("ID",1,1,30);
        groups[7] = new StudentGroup("IM",2,5,12);
        groups[8] = new StudentGroup("KMM",4,3,32);
        groups[9] = new StudentGroup("SIT",3,2,24);

        int indexOf1stGrade= -1,indexOf2ndGrade = -1,indexOf3rdGrade = -1,indexOf4thGrade = -1;
        for (int i = 0; i < 10; i++) {
            switch (groups[i].getGrade())
            {
                case 1:
                    if (indexOf1stGrade == -1 || groups[i].getStudentCount() > groups[indexOf1stGrade].getStudentCount() ) {
                        indexOf1stGrade = i;
                    }
                    break;
                case 2:
                    if (indexOf2ndGrade == -1 || groups[i].getStudentCount() > groups[indexOf2ndGrade].getStudentCount()) {
                        indexOf2ndGrade = i;
                    }
                    break;
                case 3:
                    if (indexOf3rdGrade == -1 || groups[i].getStudentCount() > groups[indexOf3rdGrade].getStudentCount()) {
                        indexOf3rdGrade = i;
                    }
                    break;
                case 4:
                    if (indexOf4thGrade == -1 || groups[i].getStudentCount() > groups[indexOf4thGrade].getStudentCount()) {
                        indexOf4thGrade = i;
                    }
                    break;
            }

        }
        System.out.printf("1st Grade biggest group: %s\n2nd Grade biggest group: %s\n3rd Grade biggest group: %s\n4th Grade biggest group: %s",groups[indexOf1stGrade],groups[indexOf2ndGrade],groups[indexOf3rdGrade],groups[indexOf4thGrade]);
    }
}
