import java.util.Objects;

public class Student {
    private String fName;
    private String lName;
    private int facNo;
    private String major;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getFacNo() {
        return facNo;
    }

    public void setFacNo(int facNo) {
        this.facNo = facNo;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student { " +
                "fName = '" + fName + '\'' +
                ", lName = '" + lName + '\'' +
                ", facNo = " + facNo +
                ", major = '" + major + '\'' +
                " } ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return facNo == student.facNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(fName, lName, facNo, major);
    }

    public static void main(String[] args) {
        Student[] students = new Student[10];
        String searchCriteria = "Popov";
        for (int i = 0; i < 10; i++) {
            students[i] = new Student();
        }
        students[0].setfName("Orlin"); students[0].setlName("Borisov");
        students[0].setFacNo(22897825); students[0].setMajor("SIT");

        students[1].setfName("Kamen"); students[1].setlName("Popov");
        students[1].setFacNo(21569875); students[1].setMajor("KST");

        students[2].setfName("Zhivko"); students[2].setlName("Petkov");
        students[2].setFacNo(22477961); students[2].setMajor("IKT");

        students[3].setfName("Lyubomir"); students[3].setlName("Chekov");
        students[3].setFacNo(20798434); students[3].setMajor("AIKUS");

        students[4].setfName("Alexander"); students[4].setlName("Popov");
        students[4].setFacNo(19479543); students[4].setMajor("TTT");

        students[5].setfName("Dinko"); students[5].setlName("Popov");
        students[5].setFacNo(19479893); students[5].setMajor("AT");

        students[6].setfName("Sofia"); students[6].setlName("Zhecheva");
        students[6].setFacNo(22564794); students[6].setMajor("KST");

        students[7].setfName("Iva"); students[7].setlName("Atanasova");
        students[7].setFacNo(21032164); students[7].setMajor("KST");

        students[8].setfName("Stefani"); students[8].setlName("Balabanova");
        students[8].setFacNo(21621554); students[8].setMajor("KS");

        students[9].setfName("Mila"); students[9].setlName("Mitseva");
        students[9].setFacNo(19165479); students[9].setMajor("KS");

        System.out.print("> ");
        for (int i = 0; i < 10; i++) {
            if (students[i].lName.equals(searchCriteria)) {
                System.out.println(students[i].toString());
            }
        }
    }
}
