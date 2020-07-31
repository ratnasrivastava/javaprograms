package programswithJUNITtestcase;

public class TowerOfHanoiProblem {
    public static void main(String args[]) {
        towerOfHanoi(3, 'a', 'b', 'c');
    }

    public static void towerOfHanoi(int n, char pillarFrom, char pillarAuxiliary, char pillarTo) {
        if (n == 1) {
            System.out.println("Plate 1 from rod " + pillarFrom + " to " + pillarTo);
            return;
        }
        towerOfHanoi(n - 1, pillarFrom, pillarTo, pillarAuxiliary);
        System.out.println("Plate " + n + " from " + pillarFrom + " to " + pillarTo);
        towerOfHanoi(n - 1, pillarAuxiliary, pillarFrom, pillarTo);
        //System.out.println("Plate "+n+" from "+pillarTo+" to "+pillarAuxiliary);
    }
}
