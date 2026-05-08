import static org.junit.Assert.*;
import org.junit.Test;

public class Renshu {

    public int doubleValue(int x) {
        return x * 2;
    }

    public int tripleValue(int x) {
        return x * 3;
    }

    public int sumUpToN(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public int sumFromArrayIndex(int[] a, int index) {
        if (index >= a.length) {
            return -1;
        }

        int sum = 0;

        for (int i = index; i < a.length; i++) {
            sum += a[i];
        }

        return sum;
    }

    public int selectMaxValue(int[] a) {
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        return max;
    }

    public int selectMinValue(int[] a) {
        int min = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }

        return min;
    }

    public int selectMaxIndex(int[] a) {
        int maxIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }

    public int selectMinIndex(int[] a) {
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    public void swapArrayElements(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public boolean swapTwoArrays(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        return true;
    }
}