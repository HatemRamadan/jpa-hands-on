package com.sumerge.program.Model;

import javax.persistence.*;

@Entity
@Table(name="ADDRESS")
public class Address {
    @Id
    @Column(name = "ADDRESSID")
    int ADDRESSID;
    @ManyToOne
    @JoinColumn(name="EMPID",referencedColumnName="EMPID")
    Employee EMPID;
    @Column(name = "ADDLINE1")
    String ADDLINE1 ;
    @Column(name = "ADDLINE2")
    String ADDLINE2 ;
    @Column(name = "CITY")
    String CITY ;
    @Column(name = "REGION")
    String REGION ;
    @Column(name = "COUNTRY")
    String COUNTRY ;
    @Column(name = "POSTCODE")
    String POSTCODE ;
}
