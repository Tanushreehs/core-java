class TowerRun {

    String type;
    int height;

    TowerRun(String type, int height) {
        this.type = type;
        this.height = height;
    }

    Tower info() {
        Tower tower = new Tower("White", this.type, this.height);
        return tower;
    }

    void show() {
        System.out.println("TowerRun type : " + this.type);
        System.out.println("TowerRun height : " + this.height);
    }
}