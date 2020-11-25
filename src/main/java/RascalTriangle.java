public class RascalTriangle {
    private int rowIndex;
    private int colIndex;
    private int numOptions;
    private int target;
    private int center;
    private int triangleEntry;

    public int getTriangleEntry(int rowIndex, int colIndex) {
        this.rowIndex = rowIndex;
        this.colIndex = colIndex;
        numOptions = rowIndex / 2;
        target = numOptions - colIndex;

        if (colIndex == 0 || colIndex == rowIndex) {
            triangleEntry = 1;
        }

        else if(rowIndex % 2 != 0) {
            center = sumOfEvens(numOptions) + 1;
            triangleEntry = center - sumOfEvens(target);
        }

        else if(rowIndex % 2 == 0) {
            center = sumOfOdds(numOptions) + 1;
            triangleEntry = center - sumOfOdds(target);
        }

        return triangleEntry;
    }

    private int sumOfOdds(int n) {
        return n * n;
    }

    private int sumOfEvens(int n) {
        return n * (n + 1);
    }
}
