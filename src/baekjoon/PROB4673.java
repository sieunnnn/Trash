package baekjoon;

public class PROB4673 {
    public static void func(int n,boolean isNotSelfNum[],boolean value) {
        int sum = n;
        int number = n;
        int remainder = n;
        isNotSelfNum[n] = value;

        while(number !=0) {
            remainder = number%10;
            sum += remainder;
            number = number/10;
        }
        if (sum>10000) return;

        func(sum,isNotSelfNum,true);
    }

    public static void main(String[] args) {
        boolean isNotSelfNum[] = new boolean[10001];
        StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++) {
            if (!isNotSelfNum[i]) {
                sb.append(i + "\n");
                func(i,isNotSelfNum,false);
            }
        }
        System.out.println(sb);

    }
}
