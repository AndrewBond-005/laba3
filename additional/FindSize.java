package additional;

public final class FindSize {
    public static Size findSize(double fingerSize) {
        for (Size s : Size.values()) {
            if (fingerSize <= s.getMaxSize() && fingerSize >= s.getMinSize()) {
                return s;
            }
        }
        return null;
    }
}
