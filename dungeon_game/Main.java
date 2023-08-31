package dungeon_game;

public class Main {
    public static void main(String args[]) {
        MapGeneration mapSize = new MapGeneration(30, 10);
        ObstacleGeneration obstacleMap = new ObstacleGeneration(mapSize);
        obstacleMap.createObstacle(10);
        String[][] map = mapSize.createMap();
        map[3][4] = "*";
        for (int i = 0; i < mapSize.sizeY; i++) { // Notice the change here from sizeX to sizeY
            for (int j = 0; j < mapSize.sizeX; j++) { // And here from sizeY to sizeX
                System.out.print(map[i][j]);
            }
            System.out.println(); // To print a new line after each row
        }
    }
}
