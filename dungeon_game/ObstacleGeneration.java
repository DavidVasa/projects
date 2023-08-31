package dungeon_game;
import java.util.Random;


public class ObstacleGeneration {
    public MapGeneration map;
    Random randomX = new Random(map.sizeX-1);
    Random randomY = new Random(map.sizeY-1);
    String[][] obstacleMap = new String[map.sizeX][map.sizeY]; 

    public ObstacleGeneration(MapGeneration map) {
        this.map = map;
    }

    public String[][] createObstacle(int obstacleCount) {

            for (int i = 0; i < obstacleCount; i++)
            {

                obstacleMap[randomX+1][randomY+1] = "*"; 
            }

        return obstacleMap;
    }

}
