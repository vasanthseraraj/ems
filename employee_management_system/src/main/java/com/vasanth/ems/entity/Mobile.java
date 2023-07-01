package com.vasanth.ems.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="mobile_mst")
public class Mobile {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer mobId;
	private String countryCode;
	private String country;
	private Long mobileNo;

}
