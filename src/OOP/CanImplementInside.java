public interface CanImplementInside{
    public int calculate();

    class Impl implements CanImplementInside{
        public int calculate() {
            return 1;
        }
    }
}