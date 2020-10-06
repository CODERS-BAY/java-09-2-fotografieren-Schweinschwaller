public class Lens {
    //https://de.wikipedia.org/wiki/Objektiv_(Optik)#Nach_Bildwinkel
    private int minFocalLength;
    private int maxFocalLength;
    private String name;
    private static int NR_OF_OBJS = 0;

    // *** Constructor ***
    public Lens() {
        ++NR_OF_OBJS;
    }

    public Lens(int minFocalLength, int maxFocalLength, String name) {
        ++NR_OF_OBJS;
        if (minFocalLength < maxFocalLength) {
            this.minFocalLength = minFocalLength;
            this.maxFocalLength = maxFocalLength;
        } else {
            this.minFocalLength = maxFocalLength;
            this.maxFocalLength = minFocalLength;
        }
        this.name = name;
    }

    // *** Setter&Getter ***
    public int getMinFocalLength() {
        return this.minFocalLength;
    }

    public void setMinFocalLength(int minFocalLength) {
        this.minFocalLength = minFocalLength;
    }

    public int getMaxFocalLength() {
        return this.maxFocalLength;
    }

    public void setMaxFocalLength(int maxFocalLength) {
        this.maxFocalLength = maxFocalLength;
    }

    public static int GetNrOfObjects() {
        return NR_OF_OBJS;
    }

    // *** toString ***

    @Override
    public String toString() {
        return this.name + " min:" + this.minFocalLength + ", max:" + this.maxFocalLength + " mm";
    }
}

