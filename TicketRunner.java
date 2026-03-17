class TicketRunner {

    public static void main(String[] args) {

        System.out.println("Checking place:");
        System.out.println(Ticket.getPrice("Bangalore"));

        System.out.println("\nChecking movie:");
        System.out.println(Ticket.getPrice("KGF", 'G', "PVR"));

        System.out.println("\nChecking email:");
        System.out.println(Ticket.getEmail("Ravi"));

        System.out.println("\nChecking mobile:");
        System.out.println(Ticket.getMobile("Ravi"));

        System.out.println("\nInvalid cases:");
        Ticket.getPrice("Unknown");
        Ticket.getPrice("XYZ", 'X', "ABC");
        Ticket.getEmail("Unknown");
        Ticket.getMobile("Unknown");
    }
}