public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker Stripes = new PatternMaker();


    }

    public PatternMaker() {
        System.out.println("HI pattern maker");
        Pattern1();
        Pattern2();
        Pattern3();
        Pattern5();
    }


    public void Pattern1() {
        for (int x = 0; x < 6; x++) {
            System.out.println(x * 5);


        }

    }

    public void Pattern2() {
        for (int m = 0; m < 6; m++) {
            System.out.println(2 + m * 5);


        }

    }

    public void Pattern3() {
        for (int m = 0; m < 6; m++) {
            System.out.print(21 - m * 4 + "\t");

        }
    }


    public void Pattern5() {
        for (int z = 0; z < 4; z++) {
            for (int c = 1; c < 5; c++)
                System.out.print(c + "\t");

        }

    }
}

