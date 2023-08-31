package dungeon_game;

import java.util.Random;

public class ObstacleGeneration {
    public MapGeneration map;
    Random randomX = new Random();
    Random randomY = new Random();

    public ObstacleGeneration(MapGeneration map) {
        this.map = map;
    }

    public String[][] createObstacle(int obstacleCount, String[][] generatedMap) {
        for (int i = 0; i < obstacleCount; i++) {
            generatedMap[randomX.nextInt(generatedMap.length - 2) + 1][randomY.nextInt(generatedMap[0].length - 2)
                    + 1] = "*";
        }
        return generatedMap;
    }

}
