public class Main {
    public static void main(String[] args) {

        int ticket = 576;
        int bonus = 20;

        // Объявляете переменные для входных данных и
        // параметров программы: одну для хранения
        // стоимости билета, другую для хранения количества
        // рублей для одной бонусной мили

        int mile;
        mile = ticket / bonus;
        System.out.println("Количество начисленных миль за купленный билет:");
        System.out.println(mile + " миль");

        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран
    }
}
