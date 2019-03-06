package objects_classes_methods.labs.objects;


//Exercise_03
public class ConstructorExercise {
    public static void main(String[] args) {
        Test test1 = new Test(90);
        Test test2 = new Test("English");
        Test test3 = new Test(70, "Math");

        System.out.println(test1.toString());
        System.out.println(test2.toString());
        System.out.println(test3.toString());
    }
}

class Test {
    int score;
    String subject;

    public Test(int score) {
        this.score = score;
    }

    public Test(String subject) {
        this.subject = subject;
    }

    public Test(int score, String subject) {
        this.score = score;
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Test{" +
                "score=" + score +
                ", subject='" + subject + '\'' +
                '}';
    }
}

