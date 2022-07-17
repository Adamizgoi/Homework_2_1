public class Main {
    public static void main(String[] args) {

        int cost = 7421; //стоимость авиабилета
        int oneMile = 20; // кол-во рублей, за которые начисляют 1 милю
        boolean earn = cost > oneMile; //стоимость билета должна превышать 20р для начисления миль

        if (earn) {
            int result = cost / oneMile;
            System.out.println("Начислено миль:");
            System.out.println(result);
        } else {
            System.out.println("Для начисления миль стоимость билета должна превышать 20р");
        }
    }
}