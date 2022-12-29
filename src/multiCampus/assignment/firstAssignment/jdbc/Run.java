package src.multiCampus.assignment.firstAssignment.jdbc;

import java.sql.SQLException;

public class Run {
    public static void main(String[] args) throws SQLException {
        MemberDao memberDao = new MemberDao();

        // member 조회
//        Member member = memberDao.userAuthenticate("ADMIN", "1234");
//        System.out.println(member);

        // member 추가
        // 형식 : Member(String userId, String password, String email, String grade, String tell, boolean isLeave)
//        Member member2 = new Member("USER_ID", "PASSWORD","EMAIL", "GRADE","TELL", false);
//        memberDao.insertMember(member2);
    }

}
