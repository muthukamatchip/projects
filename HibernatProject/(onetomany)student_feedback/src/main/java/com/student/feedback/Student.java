package com.student.feedback;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Student")
public class Student {
  @Id
  @GeneratedValue(strategy =GenerationType.TABLE)
	private int student_Id;
     private String studentName,feedback;
}
  
