void main() {
    final List<String> ShapesList = new ArrayList<>() {{
        add("Orange Ricky"); // L, smaller line on the right
        add("Blue Ricky"); // J, smaller line on the left
        add("Cleveland Z"); // bottom 2 more to the right
        add("Rhode Island Z"); // bottom 2 more to the left
        add("Hero"); // flat 4
        add("Teewee"); // T shape, pyramid,
        add("Smashboy"); // square, box
    }};

    enum Shape {
        OrangeRicky,
        BlueRicky,
        ClevelandZ,
        RhodeIslandZ,
        Hero,
        Teewee,
        Smashboy
    }

    /*
     * =====  KOLORY =====
     * tło gry           ConsoleFormatter.BLACK_BACKGROUND
     * Hero Block        ConsoleFormatter.BRIGHT_CYAN_BACKGROUND
     * Blue Ricky Block  ConsoleFormatter.BRIGHT_BLUE_BACKGROUND
     * Orange Ricky      ConsoleFormatter.ORANGE_BACKGROUND
     * Teewee Block      ConsoleFormatter.BRIGHT_PURPLE_BACKGROUND
     * Sun Block         ConsoleFormatter.BRIGHT_YELLOW_BACKGROUND
     * Rhode Island Z    ConsoleFormatter.BRIGHT_GREEN_BACKGROUND
     * Cleveland Island  ConsoleFormatter.BRIGHT_RED_BACKGROUND
     * */

    System.out.println(ConsoleFormatter.getBlocks(ConsoleFormatter.RED, 5));
}

/*
CENTRAL POSITIONS
- Orange Ricky
⬛
⬛
⬜⬛

- Blue Ricky
  ⬛
  ⬛
⬛⬜

- Cleveland Z
⬛⬛
  ⬜⬛

- Rhode Island Z
  ⬛⬛
⬛⬜

- Hero
⬛⬛⬜⬛

- Teewee
  ⬛
⬛⬜⬛

- Smashboy
⬛⬛
⬜⬛
 */