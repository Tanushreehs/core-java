class Book extends Document {
    Book(String name, int pages) {
        super(name, pages);
        System.out.println("Book Constructor");
    }
}