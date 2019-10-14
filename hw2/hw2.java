
public class hw2 {
    public static void main(String[] args) {

        double[] mas = new double[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = Math.random();
            System.out.println(mas[i] + " ");
        }
        double max = 0d;
        double min = 1d;
        double average = 0d;
        for (int i = 0; i < mas.length; i++) {
            if (mas[i] > max) {
                max = mas[i];
            } else if (mas[i] < min) {
                min = mas[i];
            }
            average += mas[i];
        }
        average /= mas.length;
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("average = " + average); //конец первого задания
        double k = 0d;
        for (int i = 0; i < mas.length; i++) {
            for (int j = 0; j < (mas.length - 1); j++) {
                if (mas[j] > mas[j + 1]) {
                    k = mas[j];
                    mas[j] = mas[j + 1];
                    mas[j + 1] = k;
                }
            }
        }
        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + "   ");
        }
    }
}
