package hweiyu.com.score;

public class ScoringNG {
    public static void main(String[] args) {
        String[] names = {"Jack","Hank","Karen","Elva","Benny"};
        int[] english = {70,80,90,60,40};
        int[] math = {88,97,54,32,75};
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i] + "\t" + english[i] + "\t" + math[i] );
        }
    }
}
