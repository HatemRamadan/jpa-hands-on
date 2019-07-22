package com.sumerge.program.Model;

import javax.persistence.*;
import java.util.List;

@Table(name = "EMPLOYEE")
@Entity
public class Employee {
    @Id
    @Column(name = "EMPID")
    String EMPID;
    @Column(name = "DEPTCODE")
    String DEPTCODE;
    @Column(name = "JOBTITLE")
    String JOBTITLE;
    @Column(name = "GIVENNAME")
    String GIVENNAME;
    @Column(name = "FAMILYNAME")
    String FAMILYNAME;
    @Column(name = "COMMONNAME")
    String COMMONNAME;
    @Column(name = "NAMETITLE")
    String NAMETITLE;

    @ManyToMany
    @JoinTable(name = "ProjectMember",
            joinColumns = @JoinColumn(name = "EMPID"),
            inverseJoinColumns = @JoinColumn(name = "PROJID"))
    List<Project> proj;
}
