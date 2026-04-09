class SandRun {

    String type;
    int weight;

    SandRun(String type, int weight) {
        this.type = type;
        this.weight = weight;
    }

    Sand info() {
        Sand sand = new Sand("Brown", this.type, this.weight);
        return sand;
    }

    void show() {
        System.out.println("SandRun type : " + this.type);
        System.out.println("SandRun weight : " + this.weight);
    }
}