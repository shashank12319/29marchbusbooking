package com.wittybrains.busbookingsystem.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.wittybrains.busbookingsystem.model.Bus;
import com.wittybrains.busbookingsystem.model.BusType;
@JsonInclude(value = Include.NON_NULL)
//public class BusDTO {
//	private String number;
//    private String type;
//    private Long id;
//  
//    public BusDTO() {
//    }
//    public BusDTO(Bus busDTO) {
//		super();
//		this.id=busDTO.getId();
//		this.number=busDTO.getNumber();
//		//this.type = busDTO.getType();
//		
//		
//    }
//
//
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
//	public String getNumber() {
//		return number;
//	}
//	public void setNumber(String number) {
//		this.number = number;
//	}
//	
//
//	
//
//	
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//
//	public Long getId() {
//		// TODO Auto-generated method stub
//		return id;
//	}
//
//}



public class BusDTO {
  
    private String number;
   
    private BusType type;
    
    private int capacity;

    public BusDTO() {
    }

    public BusDTO(Bus bus) {
        
        this.number = bus.getNumber();
        this.type = bus.getType();
        this.capacity = bus.getCapacity();
    }


	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public BusType getType() {
		return type;
	}

	public void setType(BusType type) {
		this.type = type;
	}

   
}
