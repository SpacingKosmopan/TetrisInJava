import java.util.ArrayList;

public class Block {
    public String color;
    public Pair<Integer, Integer> centralPosition;
    public Shape shape;

    /**
     * Lista par - kształt-lista pozycji (pos=para x+y)
     */
    public final ArrayList<Pair<Shape, ArrayList<Pair<Integer, Integer>>>> shapesOccupision = new ArrayList<>() {
        {
            // === ORANGE RICKY ===
            ArrayList<Pair<Integer, Integer>> orangeRickyPositions = new ArrayList<>() {
                {
                    add(new Pair<>(-1, 0));
                    add(new Pair<>(-2, 0));
                    add(new Pair<>(0, 1));
                }
            };
            add(new Pair<>(Shape.OrangeRicky, orangeRickyPositions));

            // === BLUE RICKY ===
            ArrayList<Pair<Integer, Integer>> blueRickyPositions = new ArrayList<>() {
                {
                    add(new Pair<>(-1, 0));
                    add(new Pair<>(-2, 0));
                    add(new Pair<>(0, -1));
                }
            };
            add(new Pair<>(Shape.BlueRicky, blueRickyPositions));

            // === CLEVELAND Z ===
            ArrayList<Pair<Integer, Integer>> clevelandZPositions = new ArrayList<>() {
                {
                    add(new Pair<>(0, 1));
                    add(new Pair<>(-1, 1));
                    add(new Pair<>(1, 0));
                }
            };
            add(new Pair<>(Shape.BlueRicky, clevelandZPositions));

            // === RHODE ISLAND Z ===
            ArrayList<Pair<Integer, Integer>> rhodeIslandZPositions = new ArrayList<>() {
                {
                    add(new Pair<>(0, 1));
                    add(new Pair<>(1, 1));
                    add(new Pair<>(-1, 0));
                }
            };
            add(new Pair<>(Shape.BlueRicky, rhodeIslandZPositions));

            // === HERO ===
            ArrayList<Pair<Integer, Integer>> heroPositions = new ArrayList<>() {
                {
                    add(new Pair<>(-1, 0));
                    add(new Pair<>(-2, 0));
                    add(new Pair<>(1, 0));
                }
            };
            add(new Pair<>(Shape.BlueRicky, heroPositions));
        }
    };

    public ArrayList<Pair> getOccupiedTiles() {
        return new ArrayList<>() {{
            //add(new Pair())
        }};
    }
}