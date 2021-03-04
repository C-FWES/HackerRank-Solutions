package CavityMap;

public class CavityMap {
    static String[] cavityMap(String[] grid) {
        String[][] digitMatrix = new String[grid.length][grid.length];
        String[] cavityMap = new String[grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                digitMatrix[i][j] = String.valueOf(grid[i].charAt(j));
            }
        }
        for (int i = 1; i < digitMatrix.length - 1; i++) {
            for (int j = 1; j < digitMatrix.length - 1; j++) {
                if (    !"X".equals(digitMatrix[i - 1][j])
                        && !"X".equals(digitMatrix[i][j - 1])
                        && Integer.parseInt(digitMatrix[i][j]) > Integer.parseInt(digitMatrix[i - 1][j])
                        && Integer.parseInt(digitMatrix[i][j]) > Integer.parseInt(digitMatrix[i+1][j])
                        && Integer.parseInt(digitMatrix[i][j]) > Integer.parseInt(digitMatrix[i][j - 1])
                        && Integer.parseInt(digitMatrix[i][j]) > Integer.parseInt(digitMatrix[i][j+1])) {
                    digitMatrix[i][j] = "X";
                }
            }
        }

        for (int i = 0; i < grid.length; i++) {

                cavityMap[i] = "";

            for (int j = 0; j < grid.length; j++) {
                    cavityMap[i] = cavityMap[i] + digitMatrix[i][j];
            }
        }
        return cavityMap;
    }

    public static void main(String[] args) {
        String[] grid = {"989", "191", "111"};
        String[] cavityMap = cavityMap(grid);
        for (String s : cavityMap) {
            System.out.println(s + "");
        }
    }

}
