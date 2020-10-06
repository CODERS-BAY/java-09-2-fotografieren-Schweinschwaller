public class Camera {
    private String brand;
    private Double megaPixels;
    private Double displaySize;
    private boolean isColored;
    private Lens lens;
    private static int nrOfObjects = 0;

    // *** Constructor ***
    public Camera() {
        ++nrOfObjects;
    }

    public Camera(String brand, double megaPixels, double displaySize, boolean isColored, Lens lens) {
        ++nrOfObjects;
        this.displaySize = displaySize;
        this.brand = brand;
        this.megaPixels = megaPixels;
        this.isColored = isColored;
        this.lens = lens;
    }

    // *** Setter&Getter ***
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getMegaPixels() {
        return megaPixels;
    }

    public void setMegaPixels(double megaPixels) {
        if (megaPixels > 0) {
            this.megaPixels = megaPixels;
        }
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(double displaySize) {
        if (displaySize > 0) {
            this.displaySize = displaySize;
        }
    }

    public boolean isColored() {
        return isColored;
    }

    public void setColored(boolean colored) {
        isColored = colored;
    }

    public Lens getLens() {
        return lens;
    }

    public void setLens(Lens lens) {
        this.lens = lens;
    }

    public static int GetNrOfObjects() {
        return nrOfObjects;
    }

    // *** toString ***

    @Override
    public String toString() {
        String help = this.brand + ", " + this.megaPixels.toString() + " MPixel, " + this.displaySize.toString() + " inch" + ", ";
        if (this.isColored) {
            help += "Color-Photo";
        } else {
            help += "Black&White-Photo";
        }
        help += "\n" + this.lens.toString();

        return help;
    }
}
