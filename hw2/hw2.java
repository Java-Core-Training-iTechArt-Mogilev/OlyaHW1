public class hw2 {
    public static void main(String[] args){

        double [] mas = new double[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] =Math.random();
            System.out.println(mas[i]+" ");
        }
        double max = 0d;
        double min = 1d;
        double average=0d;
        for (int i = 0; i <mas.length ; i++) {
            if (mas[i]>max) {
                max = mas[i];
            }
            else if (mas[i]<min){
               min = mas[i];
            }
            average+=mas[i];
        }
        average/=mas.length;
        System.out.println("max = "+ max);
        System.out.println("min = "+ min);
        System.out.println("average = "+ average);

    }
}
