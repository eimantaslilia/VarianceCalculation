import java.util.ArrayList;

public class Variance {

    public static int sum(ArrayList<Integer> list) {
        int combined = 0;
        for (int number : list) {
            combined = combined + number;
        }
        return combined;
    }

    public static double average(ArrayList<Integer> list) {
        double average = sum(list);
        average = (double)average / list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        //double variance = average(list);
        double average = average(list);
        double variance_buffer = 0.0;
        double variance_result ;

        for (int number : list) {
            variance_buffer = variance_buffer + Math.pow((number - average), 2);
        }
            variance_result = variance_buffer / (list.size()-1);

        return variance_result;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }
}
