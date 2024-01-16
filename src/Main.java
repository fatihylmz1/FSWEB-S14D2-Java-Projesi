public class Main {
    public static void main(String[] args) {

        Bed bed = new Bed("Çift Kişilik",2,80,1,1);
        bed.made();
        Carpet carpet = new Carpet(300,250,PaintColor.BLUE);
        carpet.lying();
        Ceiling ceiling = new Ceiling(400,PaintColor.WHITE);
        ceiling.create();
        Lamp lamp = new Lamp(true,LampType.HALOGEN,50);
        lamp.turnOn();
        Wall wall1 = new Wall("Sağ Duvar");
        wall1.create();
        Wall wall2 = new Wall("Karşı Duvar");
        wall2.create();
        Wall wall3 = new Wall("Sol Duvar");
        wall3.create();
        Wall wall4 = new Wall("Kapı Duvarı");
        wall4.create();
        Wardrobe wardrobe = new Wardrobe(300,400,150);
        wardrobe.add();

        Bedroom bedroom = new Bedroom("Yatak Odası",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);
        System.out.println("Bedroom Name: " + bedroom.getName());
        System.out.println("Ceiling Height: " + bedroom.getCeiling().getHeight());

    }
}