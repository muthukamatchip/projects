package com.student.feedback;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Staff")
public class Staff 
{	
		@Id  
	    @GeneratedValue(strategy=GenerationType.TABLE)  
		private int staff_Id;
		private String staff_Name;
		private String ask_Feedback;
		@OneToMany(targetEntity=Student.class,cascade=CascadeType.ALL)
		@JoinColumn(name="staff_Id")
		private List<Student> student;
		
	}

