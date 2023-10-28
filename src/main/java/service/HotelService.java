package service;

import domain.Hotel;
import repository.HotelRepository;

import java.util.Scanner;

public class HotelService {

    private Scanner scanner=new Scanner(System.in);

    //private HotelRepository hotelRepository=new HotelRepository();
    private final HotelRepository hotelRepository;

    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public void saveHotel(){

        Hotel hotel=new Hotel();

        System.out.println("Enter hotel ID: ");
        hotel.setId(scanner.nextLong());
        scanner.nextLine();
        System.out.println("Enter hotel name :");
        hotel.setName(scanner.nextLine());
        System.out.println("Enter hotel location: ");
        hotel.setLocation(scanner.nextLine());

        hotelRepository.save(hotel);

        System.out.println("Hotel saved successfully. Hotel ID : "+hotel.getId());

    }


}
