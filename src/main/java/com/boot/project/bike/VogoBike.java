package com.boot.project.bike;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@Entity
@Table(name = "SKVogo")
// @ConfigurationProperties
public class VogoBike {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int vogo_id;
	@Column(name = "company_name")
	private String company_name;
	@Column(name = "bike_cost")
	private double bike_cost;
	@Column(name = "bike_number")
	private String bike_number;
}
