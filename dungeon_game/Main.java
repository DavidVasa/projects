package dungeon_game;

public class Main {
    public static void main(String args[]) {
        MapGeneration mapSize = new MapGeneration(30, 10);
        ObstacleGeneration obstacleMap = new ObstacleGeneration(mapSize);
        String[][] map = mapSize.createMap();
        obstacleMap.createObstacle(40, map);
        for (int i = 0; i < mapSize.sizeY; i++) {
            for (int j = 0; j < mapSize.sizeX; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
