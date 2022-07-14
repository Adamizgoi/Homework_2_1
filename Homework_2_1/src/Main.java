public class Main {
    public static void main(String[] args) {

        int cost = 10; //стоимость авиабилета
        int one_mile = 20; // кол-во рублей, за которые начисляют 1 милю
        boolean earn = cost > one_mile; //стоимость билета должна превышать 20р для начисления миль

        if(earn) {
            int result = cost / one_mile;
            System.out.println("Начислено миль:");
            System.out.println(result);
        } else {
            System.out.println("Для начисления миль стоимость билета должна превышать 20р");
        }
    }
}
