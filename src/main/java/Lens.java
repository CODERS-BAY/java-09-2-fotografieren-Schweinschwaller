public class Lens {
    //https://de.wikipedia.org/wiki/Objektiv_(Optik)#Nach_Bildwinkel
    private int minFocalLength;
    private int maxFocalLength;
    private String name;
    private static int nrOfObjects = 0;

    // *** Constructor ***
    public Lens() {
        ++nrOfObjects;
    }

    public Lens(int minFocalLength, int maxFocalLength, String name) {
        ++nrOfObjects;
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
        return nrOfObjects;
    }

    // *** toString ***

    @Override
    public String toString() {
        return this.name + " min:" + this.minFocalLength + ", max:" + this.maxFocalLength + " mm";
    }
}

