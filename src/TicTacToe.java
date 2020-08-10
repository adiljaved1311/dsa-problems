import java.util.ArrayList;
import java.util.List;

public class TicTacToe {
    static Integer arr[][] = new Integer[][]{{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

    public static void main(String[] args) throws Exception {
        game();
    }

    private static void game() throws Exception {
        boolean isGameOver = false;
        int player = 1;
        //User input
        List<Integer[]> list = new ArrayList<>();
        list.add(new Integer[]{0, 0});
        list.add(new Integer[]{0, 1});
        list.add(new Integer[]{1, 0});
        list.add(new Integer[]{0, 2});
        list.add(new Integer[]{2, 1});
        list.add(new Integer[]{2, 0});
        list.add(new Integer[]{1, 2});
        list.add(new Integer[]{1, 1});
        list.add(new Integer[]{2, 2});

        for (int i = 0; i < list.size(); i++) {
            try {
                isGameOver = play(list.get(i)[0], list.get(i)[1], player);
            } catch (Exception ex) {
                System.out.println("Exception Occured : " + ex.getMessage());
                print(arr);
                return;
            }
            if (isGameOver) {
                System.out.println((player == 1 ? "Player A" : "Player B") + " Wins");
                print(arr);
                return;
            }
            player = player == 1 ? -1 : 1;
        }
        System.out.println("Match Draw");
    }

    private static boolean play(int i, int j, int player) throws Exception {
        System.out.println((player == 1 ? "Player A" : "Player B") + " : " + i + ", " + j);
        if ((i >= 0 && i < arr.length) && (j >= 0 && j < arr.length)) {
            if (arr[i][j] == 0) {
                arr[i][j] = player;

                if (checkRow(i, j, player) || checkColumn(i, j, player) || checkDiagonal(i, j, player))
                    return true;
            } else {
                throw new Exception("Already Filled");
            }
        } else {
            throw new Exception("Invalid Input");
        }
        return false;

    }

    private static void print(Integer arr[][]) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                int t = arr[x][y];
                switch (t) {
                    case 0:
                        System.out.print(" \t");
                        break;
                    case 1:
                        System.out.print("X\t");
                        break;
                    case -1:
                        System.out.print("O\t");
                        break;
                }
            }
            System.out.println();
        }
    }

    private static boolean checkRow(int i, int j, int user) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[x][j] != user) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumn(int i, int j, int user) {
        for (int x = 0; x < arr.length; x++) {
            if (arr[i][x] != user) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkDiagonal(int i, int j, int user) {
        int flag = 1;
        if (i == j || (i + j == 2)) {
            for (int x = 0, y = 0; x < arr.length; x++, y++) {
                if (arr[x][y] != user) {
                    flag = -1;
                    break;
                }
            }
            if (flag == 1)
                return true;
            flag = 1;
            for (int x = 2, y = 0; x >= 0; x--, y++) {
                if (arr[x][y] != user) {
                    flag = -1;
                    break;
                }
            }
        } else {
            return false;
        }
        if (flag == 1)
            return true;
        else
            return false;
    }
}