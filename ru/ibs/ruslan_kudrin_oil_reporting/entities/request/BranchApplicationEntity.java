package ru.ibs.ruslan_kudrin_oil_reporting.entities.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
    @Column(name = "branch_application_id")
    @Id
    private long branchApplicationId;

    /*
    Название филлиала
     */
    @Column(name = "branch_name")
    private String branchName;

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

    /*
    Дата доставки (если назначена)
     */
    @Column(name = "date_of_delivery")
    private String dateOfDelivery;

}
