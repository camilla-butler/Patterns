public class PatternMaker {
    public static void main(String[] args) {
        PatternMaker Stripes = new PatternMaker();


    }

    public PatternMaker() {
        System.out.println("HI pattern maker");
    //    Pattern1();
    //    Pattern2();
     //   Pattern3();
     //   Pattern4();
    Pattern5();
        Pattern6();

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

        public void Pattern4() {
            for (int w = 1; w < 6; w++) {
                for (int d = 1; d < 6; d++)
                    System.out.print(w*3 +"\t");

            }
        }

    public void Pattern6() {
        for (int a = 1; a < 6; a++) {
            for (int b = 1; b < a; b++){
                System.out.print( "  ");

        }
            System.out.println(a);

        }

    }}