package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/*
Должностное лицо, ответственное за предоставление данных
*/
@Entity
@NoArgsConstructor
@Data
public class ExecutiveEntity {

    /*
    Primary Key
     */
    @Id
    @Column(name = "executive_id")
    private long executiveId;

    /*
    Должность
     */
    @Column(name = "position")
    private String position;

    /*
    Ф.И.О
     */
    @Column(name = "full_name")
    private String fullName;

    /*
    Подпись
     */
    @Column(name = "signature")
    private String signature;

    /*
    Номер контактного телефона
     */
    @Column(name = "phone_number")
    private String phoneNumber;

    /*
    E-mail
     */
    @Column(name = "email")
    private String email;

    /*
    дата составления документа
     */
    @Column(name = "date")
    private Date date;
}
