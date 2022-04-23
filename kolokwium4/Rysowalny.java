public interface Rysowalny extends PrzedstawiaEmocje {
    @Override
    default boolean czySieUsmiecha() {
        return false;
    }

    @Override
    default void przestanSieUsmiechac() {

    }

    @Override
    default void draw(int i) {
        System.out.print(this);
        if (i > 1)
            System.out.print(")".repeat(i - 1));
        System.out.println();
    }

    @Override
    default void draw() {
        System.out.println(this);
    }
}
