package com.sumerge.program.Model;

import javax.persistence.*;

@Table(name = "DEPARTMENT")
@Entity
public class Department {
    @Id
    @Column(name = "DEPTCODE")
    String code;
    @Column(name = "DEPTNAME")
    String number;

    @Column(name = "MANAGER")
    String manager;
}
