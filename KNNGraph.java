import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class KNNGraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstLine = scan.nextLine();
        int k, p, n, d, startX, startY, endX, endY;
        k = Integer.parseInt(firstLine.split(" ")[0]);
        p = Integer.parseInt(firstLine.split(" ")[1]);
        n = Integer.parseInt(firstLine.split(" ")[2]);
        d = Integer.parseInt(firstLine.split(" ")[3]);

        String startPoint = scan.nextLine();
        startX = Integer.parseInt(startPoint.split(",")[0]);
        startY = Integer.parseInt(startPoint.split(",")[1]);

        String endPoint = scan.nextLine();
        endX = Integer.parseInt(endPoint.split(",")[0]);
        endY = Integer.parseInt(endPoint.split(",")[1]);

        ArrayList<Integer> xObstacle = new ArrayList<>(2*p);
        ArrayList<Integer> yObstacle = new ArrayList<>(2*p);
        for (int i = 0; i < p; i++) {
            String obstacles = scan.nextLine();
            String[] coord = obstacles.split(";");
            for (int z = 0; z < 2; z++) {
                xObstacle.add(Integer.parseInt(coord[z].split(",")[0]));
                yObstacle.add(Integer.parseInt(coord[z].split(",")[1]));
            }
        }



    }

    public static ArrayList randomPoints(int n, int range){
        ArrayList<Integer> Points = new ArrayList<>(n);
        Random rand = new Random();
        int value = rand.nextInt(range);

        return Points;
    }
}
