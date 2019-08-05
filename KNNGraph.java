import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class KNNGraph {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // accept inputs k, p, n and d
        String firstLine = scan.nextLine();
        int k, p, n, d, startX, startY, endX, endY;
        k = Integer.parseInt(firstLine.split(" ")[0]);
        p = Integer.parseInt(firstLine.split(" ")[1]);
        n = Integer.parseInt(firstLine.split(" ")[2]);
        d = Integer.parseInt(firstLine.split(" ")[3]);

        // accept starting point
        String startPoint = scan.nextLine();
        startX = Integer.parseInt(startPoint.split(",")[0]);
        startY = Integer.parseInt(startPoint.split(",")[1]);

        // accept end point
        String endPoint = scan.nextLine();
        endX = Integer.parseInt(endPoint.split(",")[0]);
        endY = Integer.parseInt(endPoint.split(",")[1]);

        // accept obstacles
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

        // generate random points in a range
        ArrayList<Integer> xCoord = randomPoints(n, d);
        ArrayList<Integer> yCoord = randomPoints(n, d);

        System.out.println(xCoord);
        System.out.println(yCoord);

        // remove points coinciding with obstacles
        int t = n;
        for(int g = 0; g < t; g++) {
            for(int f = 0; f < 2*p-1; f++){
                if(g>=0) {
                    if (xCoord.get(g) >= xObstacle.get(f) && xCoord.get(g) <= xObstacle.get(f + 1)) {
                        if (yCoord.get(g) >= yObstacle.get(f) && yCoord.get(g) <= yObstacle.get(f + 1)) {
                            xCoord.remove(g);
                            yCoord.remove(g);
                            t--;
                            g--;
                        }
                    }
                }
            }
        }

        System.out.println(xObstacle);
        System.out.println(yObstacle);
        System.out.println(xCoord);
        System.out.println(yCoord);
    }

    private static ArrayList<Integer> randomPoints(int n, int range){
        ArrayList<Integer> Points = new ArrayList<>(n);
        Random rand = new Random();
        for(int j = 0; j < n; j++) {
            int myPoint = rand.nextInt(range);
            Points.add(myPoint);
        }

        return Points;
    }

    private static boolean KNN(int k) {
        return false;
    }
}
