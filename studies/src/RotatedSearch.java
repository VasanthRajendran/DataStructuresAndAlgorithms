import java.io.*;
import java.util.*;

class RotatedSearch {

    static int shiftedArrSearch(Integer[] shiftArr, int num) {

        int low = 0;
        int high = shiftArr.length-1;
        while(low<high) {
            int mid = low + (high-low)/2;
            if(shiftArr[mid] == num) {
                return mid;
            }
            else if(shiftArr[low] < shiftArr[mid]){
                if(num >= shiftArr[low] && num <= shiftArr[mid]) {
                    high = mid-1;
                }
                else {
                    low = mid+1;
                }
            }
            else  {
                if(num <= shiftArr[high] && num > shiftArr[mid]) {
                    low = mid+1;
                }else {
                    high = mid - 1;
                }
            }
        }
        return shiftArr[low]==num?low:-1;
    }

    public static void main(String[] args) {
        RotatedSearch s = new RotatedSearch();
        Integer[] myIntArray = {9, 12, 17, 2, 4, 5};
        System.out.println(s.shiftedArrSearch(myIntArray,2));
    }

}