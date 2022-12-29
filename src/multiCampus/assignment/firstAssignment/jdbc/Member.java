package src.multiCampus.assignment.firstAssignment.jdbc;

public class Member {
    private String userId;
    private String password;
    private String email;
    private String grade;
    private String tell;
    private boolean isLeave;


    public Member(String userId, String password, String email, String grade, String tell, boolean isLeave) {
        setUserId(userId);
        setPassword(password);
        setEmail(email);
        setGrade(grade);
        setTell(tell);
        setLeave(isLeave);
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public boolean isLeave() {
        return isLeave;
    }

    public void setLeave(boolean leave) {
        isLeave = leave;
    }

    @Override
    public String toString() {
        return "Member{" +
                "userId='" + userId + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                ", tell='" + tell + '\'' +
                ", isLeave=" + isLeave +
                '}';
    }

}
