public class Main {

    public static void main(String[] args) {

        Lens lens1 = new Lens(40, 60, "Normal lens");
        Lens lens2 = new Lens(65, 1200, "Tele lens");
        Lens lens3 = new Lens(14, 35, "Wide-angle lens");
        Lens lens4 = new Lens(8, 16, "Fisheye lens");
        Lens lens5 = new Lens(24, 300, "Zoom lens");

        Camera cam1 = new Camera("Canon", 1.8, 2.5, true, lens1);
        Camera cam2 = new Camera("Fujifilm", 2.1, 2.1, false, lens2);
        Camera cam3 = new Camera("GoPro", 2.0, 2.6, true, lens3);
        Camera cam4 = new Camera("Hasselblad", 2.5, 2.8, true, lens4);
        Camera cam5 = new Camera("Leica", 1.9, 2.0, false, lens5);
        Camera cam6 = new Camera("Nikon", 2.0, 2.5, true, lens1);

        System.out.println();
        System.out.println(cam1.toString());
        System.out.println();
        System.out.println(cam2.toString());
        System.out.println();
        System.out.println(cam3.toString());
        System.out.println();
        System.out.println(cam4.toString());
        System.out.println();
        System.out.println(cam5.toString());
        System.out.println();
        System.out.println(cam6.toString());
        System.out.println();

        System.out.println("change lens");
        System.out.println();
        cam3.setLens(lens1);
        System.out.println(cam3.toString());
        System.out.println();

    }

}
