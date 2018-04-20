


/**
 *
 * @author Parth
 */
public class Student {
    int eNo;
    String name;

    public Student(int eNo, String name) {
        this.eNo = eNo;
        this.name = name;
    }

    public int geteNo() {
        return eNo;
    }

    public void seteNo(int eNo) {
        this.eNo = eNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
