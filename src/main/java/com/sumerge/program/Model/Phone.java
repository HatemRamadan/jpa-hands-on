package com.sumerge.program.Model;

import javax.persistence.*;

@Entity
@Table(name="PHONENUMBER")
public class Phone {
    @Id
    @Column(name = "PHONEID")
    int PHONEID;
    @ManyToOne
    @JoinColumn(name="EMPID",referencedColumnName="EMPID")
    Employee EMPID;
    @Column(name = "LOCALNUM")
    String LOCALNUM;
    @Column(name = "INTLPREFIX")
    String INTLPREFIX;
    @Column(name = "PHONETYPE")
    String PHONETYPE;
}
