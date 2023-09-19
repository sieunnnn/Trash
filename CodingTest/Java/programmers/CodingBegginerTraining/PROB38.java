package programmers.CodingBegginerTraining;

public class PROB38 {

    public static void main(String[] args) throws Exception {
        String[] id_pw = {"meosseugi", "1234"};
        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

        System.out.println(solution(id_pw, db));
    }

    public static String solution(String[] id_pw, String[][] db) {

        for (int i = 0; i < db.length; i++) {
            // 아이디 비번 둘 다 있는 경우
            if (id_pw[0].equals(db[i][0]) && id_pw[1].equals(db[i][1])) {
                return "login";

            } else if (id_pw[0].equals(db[i][0]) && !id_pw[1].equals(db[i][1])) {
                return "wrong pw";

            }
        }

        return "fail";
    }
}
