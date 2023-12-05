public class java605 {
    public static void main(String[] args) {
int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));

        n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] != 1) {
                if (i == 0) {
                    if (flowerbed.length == 1) {
                        count++;
                        break;
                    }
                    if (flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                } else if (i == flowerbed.length - 1) {
                    if (flowerbed[i - 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                } else {
                    if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                        count++;
                        flowerbed[i] = 1;
                    }
                }
            }
        }
        return count >= n;
    }
}
