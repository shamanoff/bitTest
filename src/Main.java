public class Main {

    public static void display(int value) {
        System.out.println("Binary: " + Integer.toBinaryString(value) + " Decimal: " + value);
    }

    public static void main(String[] args) {

   /*     System.out.println("~  Унарное отрицание (NOT)");

        //  ~  Унарное отрицание (NOT) ---------------------------------
        int b1 = 0b10101010101010101010101010101010;
        int b2 = ~b1;

        display(b1);
        display(b2);*/

  /*      //  & Поразрядное И (AND) ---------------------------------

        System.out.println("& Поразрядное И (AND)");

        int c1 = 0b101010;
        int c2 = 0b111101;
        int c3 = c1&c2;
        display(c1);
        display(c2);
        display(c3);*/

   /*     //  | Поразрядное ИЛИ (OR) ---------------------------------

        System.out.println("| Поразрядное ИЛИ (OR)");

        int d1 = 0b101010;
        int d2 = 0b111001;
        int d3 = d1|d2;
        display(d1);
        display(d2);
        display(d3);*/

   /*     //  ^ Поразрядное исключающееИЛИ (XOR) ---------------------------------

        System.out.println("^ Поразрядное исключающее ИЛИ (XOR)");

        int f1 = 0b101010;
        int f2 = 0b111001;
        int f3 = f1^f2;
        display(f1);
        display(f2);
        display(f3);*/

        //  << Сдвиг битов влево ---------------------------------

      /*  System.out.println("<< Сдвиг битов влево");

        int g1 = 0b010101010101010101010101010101;

        display(g1);
        display(g1<<1);*/

       /* //  >> Сдвиг битов вправо ---------------------------------

        System.out.println(">> Сдвиг битов вправо");

        int h1 = 0b010101010101010101010101010101;

        display(h1);
        display(h1>>1);*/

/*        //  >> Сдвиг вправо с заполнением старшего бита 0 ---------------------------------

        System.out.println(">>> Сдвиг битов вправо с заполнением 0");

        int j1 = 10;

        display(j1);
        display(j1>>>1);*/

     /*   int x = 10, y = 20;
        System.out.println("X= "+x);
        System.out.println("Y= "+y);

        x = x ^ y; // 30=10+20
        System.out.println("x "+x);
        System.out.println("y "+y);

        y = x ^ y; // 10=30-20
        x = x ^ y; //20=30-10
        System.out.println("X= "+x);
        System.out.println("Y= "+y);*/

        int x = 0b0101;
        int y = 0b01010;
        display(x);
        display(y);
        x = x ^ y;
        display(x);
//        display(y);
        y=x^y;
//        display(x);
        display(y);
        x=x^y;
        display(x);
//        display(y);
    }
}
