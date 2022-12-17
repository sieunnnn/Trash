package src.multiCampus.library.lang.wrapper;

public class Test {

    private String subject;
    private String professor;
    /*
    Integer 클래스로 선언해서, JVM 의 기본값이 null
    int 의 경우 JVM 의 기본값이 0이기 때문에 초기화가 진행되지 않아 0인지,
    정말로 낙제자가 0인지 헷갈릴 수 있다.
    */
    private Integer failedStudent;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public int getFailedStudent() {
        return failedStudent;
    }

    public void setFailedStudent(int failedStudent) {
        this.failedStudent = failedStudent;
    }

    @Override
    public String toString() {
        return "Test [subject=" + subject + ", professor=" + professor + ", failedStudent=" + failedStudent + "]";
    }

}
