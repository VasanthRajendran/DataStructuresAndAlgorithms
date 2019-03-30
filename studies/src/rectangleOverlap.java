public class rectangleOverlap {


        public boolean isRectangleOverlap(int[] rec1, int[] rec2) {

            if(rec2[0]>=rec1[2]){
                return false;
            }
            else if(rec2[1]>=rec1[3]){
                return false;
            }

            if(rec2[2]<=rec1[0]){
                return false;
            }
            else if(rec2[3]<=rec1[1]){
                return false;
            }
            return true;

        }

        public static void main(String args[]) {
            rectangleOverlap r =new rectangleOverlap();
            r.isRectangleOverlap(new int[]{0,0,2,2,},new int[]{1,1,3,3});
        }

}
