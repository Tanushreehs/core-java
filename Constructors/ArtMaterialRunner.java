class ArtMaterialRunner {
    public static void main(String[] args) {

        ArtMaterial a1 = new ArtMaterial("Camel", "Watercolor", "Multicolor", "Liquid",
                "Painting", "High", "Box", "India", 12, 300.0);

        ArtMaterial a2 = new ArtMaterial("FaberCastell", "Pencil", "Black", "Graphite",
                "Drawing", "Premium", "Pack", "Germany", 10, 200.0);

        ArtMaterial a3 = new ArtMaterial("Doms", "Crayons", "Multicolor", "Wax",
                "Coloring", "Standard", "Box", "India", 24, 150.0);

        a1.display();
        a2.display();
        a3.display();
    }
}