public class Funciones {
    public static double calMax(double[] notes) {
        double max = notes[0];
        for (double num : notes) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }


    public static double calMin(double[] notes) {
        double min = notes[0];
        for (double num : notes) {
            if (num < min) {
                num = min;

            }

        }
        return min;
    }
    public static double calMedia(double[] notes){
        double suma =0;
        for (double num:notes){
            suma+=num;
        }
        return suma/ notes.length;

    }
}


