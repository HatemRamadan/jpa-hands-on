package com.sumerge.program.Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name="PROJECT")
public class Project {
    @Column(name = "PROJID")
    String PROJID;
    @Column(name = "PROJNAME")
    String PROJNAME;
    @Column(name = "STARTDATE")
    java.sql.Date STARTDATE;
    @Column(name = "TARGETDATE")
    Date TARGETDATE;
    @Column(name = "STATUS")
    String STATUS;
    @Column(name = "DESCRIPTION")
    String DESCRIPTION;
    @ManyToMany
    @JoinTable(name = "ProjectMember",
            joinColumns = @JoinColumn(name = "PROJID"),
            inverseJoinColumns = @JoinColumn(name = "EMPID"))
    List<Employee> emp;
}