package com.sumerge.program.Model;

import javax.persistence.*;

@Entity
@Table(name="PHOTO")
public class Photo {
    @Id
    @Column(name = "PHOTOID")
    int PHOTOID;
    @ManyToOne
    @JoinColumn(name="EMPID",referencedColumnName="EMPID")
    Employee EMPID;
    @Column(name = "IMAGENAME")
    String IMAGENAME;
    @Column(name = "PHOTOIMAGE")
    String PHOTOIMAGE;
}
