package programmers.CodingBegginerTraining;

public class PROB35 {

    public static void main(String[] args) {
        String[] spell = {"p", "o", "s"};
        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};

        System.out.println(solution(spell, dic));
    }

    public static int solution(String[] spell, String[] dic) {
        int cnt;

        for (int i = 0; i < dic.length; i++) {
            cnt = 0;

            for (int j = 0; j <spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    cnt++;
                }
            }

            if (cnt == spell.length) {
                return 1;
            }
        }

        return 2;
    }
}
