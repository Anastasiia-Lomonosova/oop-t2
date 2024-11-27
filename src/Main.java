public class Main {
    public static void main(String[] args) {
        bmiService service = new BmiService();
        service.calculate(98, 1.87)
       double weight = 98;
      double highMetres = 1.87;
      double a = highMetres * highMetres;
        int bmi = (int) service.calculate ();

        System.out.println("ИМТ" + bmi);
    }
}
