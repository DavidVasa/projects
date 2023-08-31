package dungeon_game;

public class MapGeneration {
    public int sizeX, sizeY;

    public MapGeneration(int sizeX, int sizeY) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public String[][] createMap() {
        String boundaries = "";
        String[][] savedMap = new String[sizeY][sizeX];
        for (int y = 0; y < sizeY; y++) {
            for (int x = 0; x < sizeX; x++) {
                if (x == 0 && y == 0 || x == sizeX - 1 && y == sizeY - 1) {
                    boundaries = "/";
                } else if (x == sizeX - 1 && y == 0 || x == 0 && y == sizeY - 1) {
                    boundaries = "\\";
                } else if (x == 0 || x == sizeX - 1) {
                    boundaries = "|";
                } else if (y == 0 || y == sizeY - 1) {
                    boundaries = "-";
                } else {
                    boundaries = " ";
                }
                savedMap[y][x] = boundaries;
            }
        }
        return savedMap;
    }
}