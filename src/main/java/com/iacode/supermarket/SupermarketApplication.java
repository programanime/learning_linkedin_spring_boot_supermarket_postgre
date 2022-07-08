package com.iacode.supermarket;

import java.util.List;
import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import com.iacode.supermarket.data.repository.RoomRepository;
import com.iacode.supermarket.data.entity.Room;


@SpringBootApplication
public class SupermarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(SupermarketApplication.class, args);
	}
	
	@RestController
	@RequestMapping("/rooms")
	public class RoomController{
	    @Autowired
	    private RoomRepository roomRepository;
	    
	    @GetMapping
	    public Iterable<Room> getRooms(){
	        return this.roomRepository.findAll();
	    }
	}
}

