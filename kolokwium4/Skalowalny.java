public interface Skalowalny extends Rysowalny {
    void draw();

    @Override
    default boolean czySieUsmiecha() {
        return Rysowalny.super.czySieUsmiecha();
    }

    @Override
    default void przestanSieUsmiechac() {
        Rysowalny.super.przestanSieUsmiechac();
    }

    void draw(int i);
}
