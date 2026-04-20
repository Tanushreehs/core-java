class PuzzleRunner {
    public static void main(String[] args) {
        Jigsaw puzzle1 = new Jigsaw("3D", 500);
        Jigsaw puzzle2 = new Jigsaw("2D", 300);
        System.out.println("Puzzle 1: Type=" + puzzle1.type + ", Pieces=" + puzzle1.pieces);
        System.out.println("Puzzle 2: Type=" + puzzle2.type + ", Pieces=" + puzzle2.pieces);
    }
}