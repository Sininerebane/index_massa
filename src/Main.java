public class Main {
    public static void main(String[] agrs) {
        IndexMassaService service =new IndexMassaService();

        double IndexMassaBodyLess = service.calculate(46, 1.70);
        System.out.println("Индекс массы тела:" +IndexMassaBodyLess);

        double IndexMassaBodyNormal = service.calculate(56, 1.60);
        System.out.println("Индекс массы тела:" +IndexMassaBodyNormal);

        double IndexMassaBodyOver = service.calculate(83, 1.60);
      System.out.println("Индекс массы тела:" +IndexMassaBodyOver);

        double IndexMassaBody = service.calculate(108.5, 1.70);
        System.out.println("Индекс массы тела:" +IndexMassaBody);

    }
}