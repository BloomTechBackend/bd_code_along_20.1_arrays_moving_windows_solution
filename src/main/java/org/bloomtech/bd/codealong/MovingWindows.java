package org.bloomtech.bd.codealong;

public class MovingWindows {

    public double[] solution(int[] a, int window_size) {
        double[] averages = new double[a.length-window_size+1];
        for (int i = 0; i < (a.length-window_size+1); i++) {
            int window_sum = 0;
            for (int j = 0; j < window_size; j++) {
                window_sum += a[i+j];
            }
            double window_avg = (double) window_sum / window_size;
            averages[i] = window_avg;
        }
        return averages;
    }
}
