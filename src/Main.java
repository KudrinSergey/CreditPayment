public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int payment = service.calculate(1000000, 1, 9.99);
        System.out.println("Ежемесечный платеж: " + payment + " ₽");
    }
}