package com.bike.spring;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
@Table(name="Bike")
public class Bike 
{
@Id
private int bikeId;
private String bikeName;
private String version;
private int noOfGears;
private String weight;
private long price;


}
