package com.springboot.app.springboot_first_app.model;
import java.io.Serializable;

public class Employee implements Serializable{

    private static Integer lastID=0;
    private Integer id;
    private String name;
    private Integer phoneNB;
    private String role;
    private String email;

    public Employee(String name,String role,Integer phoneNB,String email){
        this.name=name;
        this.role=role;
        this.phoneNB=phoneNB;
        this.email=email;
        lastID++;
        this.id=lastID;
    }

    public Integer getID(){ return this.id; }
    public String getName(){ return this.name; }
    public Integer getPhoneNB(){ return this.phoneNB; }
    public String getRole(){ return this.role; }
    public String getEmail(){ return this.email; }

    public void setName(String name){ this.name=name; }
    public void setPhoneNB(Integer phoneNB){ this.phoneNB=phoneNB; }
    public void setRole(String role){ this.role=role; }
    public void setEmail(String email){ this.email=email; }


}
