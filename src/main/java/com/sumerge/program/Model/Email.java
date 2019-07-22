package com.sumerge.program.Model;

import javax.persistence.*;

@Entity
@Table(name="EMAIL")
public class Email {
    @Id
    @Column(name = "EMAILID")
    int EMAILID ;
    @ManyToOne
    @JoinColumn(name = "EMPID", referencedColumnName = "EMPID")
    Employee EMPID ;
    @Column(name = "EMAILADDRESS")
    String EMAILADDRESS ;
    @Column(name = "EMAILTYPE")
    String EMAILTYPE ;
}
