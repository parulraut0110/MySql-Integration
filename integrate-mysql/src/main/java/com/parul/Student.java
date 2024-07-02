package com.parul;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column(name = "Id")
	private int id;
    
    @Column(name = "Name")
	private String name;
    
    @Column(name = "Marks")
	private int marks;
	
}
