class DocumentRunner {
    public static void main(String[] args) {
        Book document1 = new Book("Java", 300);
        Book document2 = new Book("Python", 250);
        System.out.println("Document 1: Name=" + document1.name + ", Pages=" + document1.pages);
        System.out.println("Document 2: Name=" + document2.name + ", Pages=" + document2.pages);
    }
}