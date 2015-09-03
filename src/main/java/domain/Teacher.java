package domain;

/**
 * Created by otaskin on 22/08/15.
 */
public class Teacher extends Person {

    private String campus;
    private Integer teacherId;

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }
}
