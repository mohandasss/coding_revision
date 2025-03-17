package Array;
import java.util.Random;
public class MazeGenerator {
    private static final int SIZE = 11; 
    private static final char WALL = '#', PATH = ' ';
    private static final int[] DX = {0, 0, -2, 2};
    private static final int[] DY = {-2, 2, 0, 0};
    private static final Random RANDOM = new Random();
    private static char[][] maze = new char[SIZE][SIZE];

    public static void main(String[] args) {
        generateMaze();
        printMaze();
    }

    private static void generateMaze() {
        
        for (int i = 0; i < SIZE; i++)
            for (int j = 0; j < SIZE; j++)
                maze[i][j] = WALL;

       
        dfs(1, 1);
    }

    private static void dfs(int x, int y) {
        maze[x][y] = PATH; 

      
        int[] order = {0, 1, 2, 3};
        for (int i = 0; i < order.length; i++) {
            int j = RANDOM.nextInt(order.length);
            int temp = order[i];
            order[i] = order[j];
            order[j] = temp;
        }

       
        for (int i = 0; i < 4; i++) {
            int nx = x + DX[order[i]];
            int ny = y + DY[order[i]];

            if (nx > 0 && ny > 0 && nx < SIZE - 1 && ny < SIZE - 1 && maze[nx][ny] == WALL) {
                maze[x + DX[order[i]] / 2][y + DY[order[i]] / 2] = PATH; 
                dfs(nx, ny);
            }
        }
    }

    private static void printMaze() {
        for (char[] row : maze) {
            for (char cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }
}
