package com.test.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="emplpoyees")
public class employee {
    @Id  
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="first_Name")
    private String  name;
    @Column(name="pass_word")
    private String password;
    
    public  employee(Long id, String name,String password) {
        this.id = id;
        this.name = name;
        this.password=password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public employee(){};
   
}
