class Ticket {

   
    static int getPrice(String place) {

        if (place.equals("Bangalore")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Mysore")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Mangalore")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Hubli")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Belgaum")) { System.out.println("Ticket price is 30"); return 30; }

        if (place.equals("Delhi")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Mumbai")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Chennai")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Hyderabad")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Pune")) { System.out.println("Ticket price is 30"); return 30; }

        if (place.equals("Kolkata")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Jaipur")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Ahmedabad")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Surat")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Goa")) { System.out.println("Ticket price is 30"); return 30; }

        if (place.equals("Coorg")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Ooty")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Manali")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Shimla")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Darjeeling")) { System.out.println("Ticket price is 30"); return 30; }

        if (place.equals("Varkala")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Kochi")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Trivandrum")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Udupi")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Hassan")) { System.out.println("Ticket price is 30"); return 30; }

        if (place.equals("Tumkur")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Davangere")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Chitradurga")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Ballari")) { System.out.println("Ticket price is 30"); return 30; }
        if (place.equals("Raichur")) { System.out.println("Ticket price is 30"); return 30; }

        System.out.println("Place not found");
        return -1;
    }


   
    static int getPrice(String movie, char seatType, String theater) {

        if (movie.equals("KGF") && seatType == 'G' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("RRR") && seatType == 'S' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Leo") && seatType == 'G' && theater.equals("Cinepolis")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Pushpa") && seatType == 'S' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Vikram") && seatType == 'G' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }

        if (movie.equals("Jawan") && seatType == 'G' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Pathaan") && seatType == 'S' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Salaar") && seatType == 'G' && theater.equals("Cinepolis")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Animal") && seatType == 'S' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Dunki") && seatType == 'G' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }

        if (movie.equals("Master") && seatType == 'G' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Beast") && seatType == 'S' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Theri") && seatType == 'G' && theater.equals("Cinepolis")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Bigil") && seatType == 'S' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Kaithi") && seatType == 'G' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }

        if (movie.equals("Avengers") && seatType == 'G' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Batman") && seatType == 'S' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Spiderman") && seatType == 'G' && theater.equals("Cinepolis")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("IronMan") && seatType == 'S' && theater.equals("PVR")) { System.out.println("Price is 50"); return 50; }
        if (movie.equals("Thor") && seatType == 'G' && theater.equals("INOX")) { System.out.println("Price is 50"); return 50; }

       

        System.out.println("Details not matching");
        return -1;
    }
    static String getEmail(String name) {

        if (name.equals("Ravi")) { System.out.println("Email found"); return "ravi@gmail.com"; }
        if (name.equals("Rahul")) { System.out.println("Email found"); return "rahul@gmail.com"; }
        if (name.equals("Kiran")) { System.out.println("Email found"); return "kiran@gmail.com"; }
        if (name.equals("Arjun")) { System.out.println("Email found"); return "arjun@gmail.com"; }
        if (name.equals("Manoj")) { System.out.println("Email found"); return "manoj@gmail.com"; }

        if (name.equals("Deepak")) { System.out.println("Email found"); return "deepak@gmail.com"; }
        if (name.equals("Vinay")) { System.out.println("Email found"); return "vinay@gmail.com"; }
        if (name.equals("Suresh")) { System.out.println("Email found"); return "suresh@gmail.com"; }
        if (name.equals("Mahesh")) { System.out.println("Email found"); return "mahesh@gmail.com"; }
        if (name.equals("Ganesh")) { System.out.println("Email found"); return "ganesh@gmail.com"; }

        if (name.equals("Naveen")) { System.out.println("Email found"); return "naveen@gmail.com"; }
        if (name.equals("Rohit")) { System.out.println("Email found"); return "rohit@gmail.com"; }
        if (name.equals("Akash")) { System.out.println("Email found"); return "akash@gmail.com"; }
        if (name.equals("Harsha")) { System.out.println("Email found"); return "harsha@gmail.com"; }
        if (name.equals("Pradeep")) { System.out.println("Email found"); return "pradeep@gmail.com"; }

        System.out.println("Name not found");
        return "invalid";
    }
    static long getMobile(String name) {

        if (name.equals("Ravi")) { System.out.println("Mobile found"); return 9000000001L; }
        if (name.equals("Rahul")) { System.out.println("Mobile found"); return 9000000002L; }
        if (name.equals("Kiran")) { System.out.println("Mobile found"); return 9000000003L; }
        if (name.equals("Arjun")) { System.out.println("Mobile found"); return 9000000004L; }
        if (name.equals("Manoj")) { System.out.println("Mobile found"); return 9000000005L; }

        if (name.equals("Deepak")) { System.out.println("Mobile found"); return 9000000006L; }
        if (name.equals("Vinay")) { System.out.println("Mobile found"); return 9000000007L; }
        if (name.equals("Suresh")) { System.out.println("Mobile found"); return 9000000008L; }
        if (name.equals("Mahesh")) { System.out.println("Mobile found"); return 9000000009L; }
        if (name.equals("Ganesh")) { System.out.println("Mobile found"); return 9000000010L; }

        if (name.equals("Naveen")) { System.out.println("Mobile found"); return 9000000011L; }
        if (name.equals("Rohit")) { System.out.println("Mobile found"); return 9000000012L; }
        if (name.equals("Akash")) { System.out.println("Mobile found"); return 9000000013L; }
        if (name.equals("Harsha")) { System.out.println("Mobile found"); return 9000000014L; }
        if (name.equals("Pradeep")) { System.out.println("Mobile found"); return 9000000015L; }

        System.out.println("Name not found");
        return -1;
    }
}