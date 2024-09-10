public class CreditPaymentService {
    public int calculate(int amount, int term, double rate) {
        double MonthlyRate = rate / 12 / 100;
        int NumberOfMonths = term * 12;
        int payment = (int) (amount * (MonthlyRate * (Math.pow(1 + MonthlyRate, NumberOfMonths) / (Math.pow(1 + MonthlyRate, NumberOfMonths) - 1))));
        int overpayment = (payment * NumberOfMonths) - amount;
        return payment;
    }
}
