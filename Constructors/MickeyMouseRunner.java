public class MickeyMouseRunner {
    public static void main(String[] args) {

        MickeyMouse mickey1 = new MickeyMouse();
        MickeyMouseRun run = new MickeyMouseRun();
        run.useMickeyMouse(mickey1);

        MickeyMouse mickey2 = null;
        run.useMickeyMouse(mickey2);
    }
}