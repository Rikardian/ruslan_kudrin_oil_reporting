package ru.ibs.ruslan_kudrin_oil_reporting.entities.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/*
Статус заявки на уровне филлиала
 */
@Entity
@NoArgsConstructor
@Data
public class BranchApplicationEntity {

    /*
    Id заявки
     */
    @OneToOne
    @Id
    private BranchApplicationEntity applicationId;

    /*
    Форма заявки
     */
    @Column(name = "application_form")
    private String applicationForm;

    /*
    Статус заявки
     */
    @Column(name = "application_status")
    private String applicationStatus;

}
