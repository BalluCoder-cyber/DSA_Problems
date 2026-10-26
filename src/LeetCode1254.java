public class LeetCode1254 {
    public static int closedIsland(int[][] grid) {
        int island = 0;
        int rowEnd = grid.length - 1;
        int colEnd = grid[0].length - 1;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                if (grid[i][j] == 0) {

                    // Top-left corner
                    if (i == 0 && j == 0) {
                        if (j + 1 <= colEnd && i + 1 <= rowEnd) {
                            if (grid[i][j + 1] == 1 && grid[i + 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Top-right corner
                    else if (i == 0 && j == colEnd) {
                        if (j - 1 >= 0 && i + 1 <= rowEnd) {
                            if (grid[i][j - 1] == 1 && grid[i + 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // First row
                    else if (i == 0) {
                        if (j + 1 <= colEnd && j - 1 >= 0 && i + 1 <= rowEnd) {
                            if (grid[i][j + 1] == 1 &&
                                    grid[i][j - 1] == 1 &&
                                    grid[i + 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Bottom-left corner
                    else if (i == rowEnd && j == 0) {
                        if (j + 1 <= colEnd && i - 1 >= 0) {
                            if (grid[i][j + 1] == 1 && grid[i - 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Bottom-right corner
                    else if (i == rowEnd && j == colEnd) {
                        if (j - 1 >= 0 && i - 1 >= 0) {
                            if (grid[i][j - 1] == 1 && grid[i - 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Last row
                    else if (i == rowEnd) {
                        if (j + 1 <= colEnd && j - 1 >= 0 && i - 1 >= 0) {
                            if (grid[i][j + 1] == 1 &&
                                    grid[i][j - 1] == 1 &&
                                    grid[i - 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Last column
                    else if (j == colEnd) {
                        if (j - 1 >= 0 && i + 1 <= rowEnd && i - 1 >= 0) {
                            if (grid[i][j - 1] == 1 &&
                                    grid[i + 1][j] == 1 &&
                                    grid[i - 1][j] == 1) {
                                island++;
                            }
                        }
                    }

                    // Interior cells
                    else {
                        if (j + 1 <= colEnd &&
                                j - 1 >= 0 &&
                                i + 1 <= rowEnd &&
                                i - 1 >= 0) {

                            if (grid[i][j + 1] == 1 &&
                                    grid[i][j - 1] == 1 &&
                                    grid[i + 1][j] == 1 &&
                                    grid[i - 1][j] == 1) {
                                island++;
                            }
                        }
                    }
                }
            }
        }

        return island;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0},
                {0, 1, 1, 1, 0}

        };

        System.out.println(closedIsland(grid));
    }

}
