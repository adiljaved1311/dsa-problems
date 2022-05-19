package companies.serviceNow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Median {
    public static void main(String[] args) {
        Arrays.asList(1,5,4,3,2);
    }

    public static int median(List<Integer> arr){
        Collections.sort(arr);
        int middleIndex = arr.size()/2;
        return arr.get(middleIndex);
    }
}
