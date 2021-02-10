package Setup;

public class Board {

    private final String[][] board;
    private final int x;
    private final int y;

    public Board (int x, int y){

        this.board = new String[x][y];
        this.x = x;
        this.y = y;

        setupBoard();
        printBoard();

    }


    private void printBoard(){
    // Print board

        for (int i = 0; i < y; i++) {
        for (int j = 0; j < x; j++) {
            System.out.print(board[j][i]);
        }
        System.out.print("\n");
    }
}

    private void setupBoard(){
        // Fill board

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                board[j][i] = " ☐ ";
            }
        }
    }



}
