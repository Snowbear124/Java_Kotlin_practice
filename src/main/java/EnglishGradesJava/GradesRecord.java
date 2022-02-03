package EnglishGradesJava;

public class GradesRecord {
    String name;
    int scores;
    private String grade;
    static int pass = 60;


    public GradesRecord(String name, int scores) {
        this.name = name;
        this.scores = scores;
    }

    public void result() {
        if(scores >= pass) grade = "Pass";
        else grade = "Failde";
    }

    public void print() {
        result();
        if (scores > 100 || scores < 0) {
            System.out.println(name + " 的成績輸入錯誤！\n");
        }else {
            System.out.println(name + " 英文成績: " + scores);
            System.out.println("考試結果: " + grade + "\n");
        }
    }
}
