import java.util.Scanner;

public class ChessBoard {
    private int chessBoardHeight;
    private int chessBoardWidth;
    Scanner sc = new Scanner(System.in);

    public ChessBoard(int chessBoardHeight, int chessBoardWidth) {
        this.chessBoardHeight = chessBoardHeight;
        this.chessBoardWidth = chessBoardWidth;
    }

    public ChessBoard() {

    }

    public int inputParametrs (){
        int parametr = 0;
        parametr = Integer.parseInt(sc.nextLine());
    return parametr;
    }

    public int setChessBoardHeight() {
        this.chessBoardHeight = inputParametrs();
        return chessBoardHeight;
    }

    public int setChessBoardWidth() {
        this.chessBoardWidth = inputParametrs();
        return chessBoardWidth;
    }

    ChessBoard createChessBoard() {
        ChessBoard BuildBord = new ChessBoard();
        int height = setChessBoardHeight();
        int width = setChessBoardWidth();
        for (int i = 0; i <= height; i++) {
            if (i % 2 == 0) {
                System.out.print("");
            } else {
                System.out.print(" ");
            }
            for (int j = 0; j <= width; j++) {
                if (j % 2 == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        return BuildBord;
    }
}
