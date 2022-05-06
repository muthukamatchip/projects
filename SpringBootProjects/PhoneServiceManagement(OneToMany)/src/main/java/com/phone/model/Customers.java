package com.phone.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="customers")
public class Customers {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="customer_id")
private Long id;
private String customerName;
private Long phoneNumber;
private String mobileModel;
private String complaint;
private double bill;
@ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
@JoinColumn(name="Service_id",referencedColumnName ="Service_id")
@JsonIgnoreProperties("customers")
private ServiceCenter service;
}
