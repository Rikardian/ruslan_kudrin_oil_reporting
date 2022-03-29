package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
@NoArgsConstructor
@Data
public class ExecutiveEntity {

    @Id
    private long executiveId;

    private String position;

    private String fullName;

    private String signature;

    private String phoneNumber;

    private String email;

    private Date date;
}
