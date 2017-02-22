package prepay.solutions;

public class Boxes {
    public static int minimalNumberOfBoxes(int products, int availableLargeBoxes, int availableSmallBoxes) {
        int totalLargeBoxes = 0;
        int totalSmallBoxes = 0;
        int largeBoxes = products / 5;
        if (products % 5 > availableSmallBoxes) {
            return -1;
        }
        for (int i = 0; i < largeBoxes && i < availableLargeBoxes; i++) {
            totalLargeBoxes++;
        }
        for (int i = 0; i < availableSmallBoxes && products > (totalLargeBoxes * 5) + i; i++) {
            totalSmallBoxes++;
        }
        if (totalSmallBoxes + totalLargeBoxes == 0) {
            return -1;
        } else {
            return totalLargeBoxes + totalSmallBoxes;
        }
    }

    public static void main(String[] args) {
        System.out.println(minimalNumberOfBoxes(12, 3, 3));
    }
}