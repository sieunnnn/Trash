package src.multiCampus.assignment.firstAssignment.jdbc;

import java.sql.*;

public class MemberDao {
    public Member userAuthenticate(String userId, String password) throws SQLException {
        Member member = null;
        Connection conn = null;
        Statement stmt = null;
        ResultSet rset = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/member?useUnicode=true@characterEncoding=utf8";
            conn = DriverManager.getConnection(url, "root", "123qwe!@#QWE");
            stmt = conn.createStatement();

            String query = "SELECT * FROM MEMBER.MEMBER WHERE USER_ID = '" + userId
                    + "' AND PASSWORD = '" + password + "'";
            rset = stmt.executeQuery(query);

            if (rset.next()) {
                member = generateMember(rset);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new DataAccessException(e);
        } finally {
            try {
                rset.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
                throw new DataAccessException(e);
            }
        }

        return member;

    }

    private Member generateMember(ResultSet rset) throws SQLException {
        if (rset != null) {
            return new Member(
                    rset.getString("USER_ID"),
                    rset.getString("PASSWORD"),
                    rset.getString("EMAIL"),
                    rset.getString("GRADE"),
                    rset.getString("TELL"),
                    rset.getBoolean("IS_LEAVE")
            );
        }
        return null;
    }

    // insert
    public int insertMember(Member member) throws SQLException {
        Connection conn = null;
        PreparedStatement pstmt = null;

        int res = 0;

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/member?useUnicode=true@characterEncoding=utf8";
            conn = DriverManager.getConnection(url, "root", "123qwe!@#QWE");

            conn.setAutoCommit(false);

            Savepoint savepoint1 = conn.setSavepoint("Savepoint1");

            pstmt = conn.prepareStatement(
                    "INSERT INTO member(USER_ID, PASSWORD, EMAIL, GRADE, TELL, IS_LEAVE) " +
                            "VALUES (?, ?, ?, ?, ?, ?)"
            );
            pstmt.setString(1, member.getUserId());
            pstmt.setString(2, member.getPassword());
            pstmt.setString(3, member.getEmail());
            pstmt.setString(4, member.getGrade());
            pstmt.setString(5, member.getTell());
            pstmt.setString(6, member.isLeave() ? "Y" : "N");
            res = pstmt.executeUpdate();

            conn.commit();

            //conn.setAutoCommit(true);

            // 제대로 insert 됐는지 확인
            if (res > 0) {
                System.out.println("create success");
            }

        } catch (SQLException e) {
            e.printStackTrace();
            conn.rollback();
            throw new DataAccessException(e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
                pstmt.close();
                conn.close();
        }

        return res;

    }
}