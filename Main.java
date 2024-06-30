package com.exam.ass;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        UserManager userManager = new UserManager();
		        
		        BookingSystem bookingSystem = new BookingSystem();

		        // Admin adds screens and movies
		        Screen screen1 = new Screen(1, 5, 5);
		        Movie movie1 = new Movie("Inception", "Sci-Fi", List.of("12:00 PM", "3:00 PM", "6:00 PM"));
		        screen1.addMovie(movie1);
		        bookingSystem.addScreen(screen1);

		        // User registration and login
		        userManager.register("Abhiram Shahu", "abhishahu@gmail.com", "pass123");
		        boolean loginSuccess = userManager.login("abhishahu@gmail.com","pass123");
		     

		        if (loginSuccess) {
		            System.out.println("Available movies:");
		            for (Movie movie : screen1.getMovies()) {
		                System.out.println("Title: " + movie.getTitle());
		                System.out.println("Showtimes: " + movie.getShowtimes());
		            }

		            SeatManager seatManager = new SeatManager(5, 5);
		            //System.out.println("Select a seat to book (row and column):");
		            // Scanner input code to get row and col values from user
		            int row = 2;
		            int col = 3; // Example values
	                boolean seatBooked = seatManager.bookSeat(row, col);
		            if (seatBooked) {
		                System.out.println("Seat booked successfully!");
		            } else {
		                System.out.println("Seat already booked!");
		            }
		        }
		    }
		}


