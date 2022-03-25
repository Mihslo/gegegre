package gb.HomeWorkApp;

public class Main {

       public static void  main (String[] args) {
           printThreeWords();
           checkSumSign();
           printColor();
           compareNumbers();
    }

    public static void printThreeWords() {
        Orange();
        Banana();
        Apple();
    }
    static void Orange(){
        System.out.println("Orange");
    }
    static void Banana() {
        System.out.println("Banana");
    }
    static void Apple() {
        System.out.println("Apple");
    }

    public static void checkSumSign() {
       int a = 5;
       int b = -7;
       int c = a+b;
        if (c>=0){
          System.out.println("Сумма положительная");
        }
          else {
            System.out.println("Сумма отрицательна");
        }
    }

    public static void printColor() {
        int value = 200;
        if (value <=0){
            System.out.println("Красный");
        }
         else  if(value>0 && value<100) {
             System.out.println("Желтый");
        }
         else {
             System.out.println("Зеленый");
        }

    }

   public static void compareNumbers() {
      int a=6;
      int b=-6;
       if (a>=b){
           System.out.println("a>=b");
       }
        else {
            System.out.println("a<b");
       }
    }
}
