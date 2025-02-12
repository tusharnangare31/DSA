package A17_Strings;

public class B3_Shortest_Path {
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(getShortestPath(path));
    }
    public static double getShortestPath(String path){
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                y++;
            }
            if (path.charAt(i) == 'S') {
                y--;
            }
            if (path.charAt(i) == 'E') {
                x++;
            }
            if (path.charAt(i) == 'W') {
                x--;
            }

        }
        double x2 = (Math.pow(x,2));
        double y2 = (Math.pow(y,2));
        return Math.sqrt(x2+y2);
    }
}

