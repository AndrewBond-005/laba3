package Additional;

import Humanoid.Woman;

public record Ring(Size size, String name) {
    public boolean tryToGetDressed(Woman woman) {
        return Size.valueOf(woman.getFingerSize()).getMaxSize() <= this.size().getMaxSize();
    }
}
