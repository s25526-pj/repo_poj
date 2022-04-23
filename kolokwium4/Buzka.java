public class Buzka implements Skalowalny {
    public Buzka(char c) {
        char costam = c;
    }

    public Buzka() {
    }

    @Override
    public boolean czySieUsmiecha() {
        return false;
    }

    @Override
    public void przestanSieUsmiechac() {

    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public void draw(int i) {
        System.out.print(toString());
        if (i > 1)
            System.out.print(")".repeat(i - 1));
        System.out.println();
    }
}
