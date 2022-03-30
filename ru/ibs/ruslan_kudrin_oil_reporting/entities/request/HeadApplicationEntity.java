package ru.ibs.ruslan_kudrin_oil_reporting.entities.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@NoArgsConstructor
@Data
/*
Заявка на уровне головной организации
 */
public class HeadApplicationEntity {

    /*
    Id заявки
     */
    //Сделать генерацию, чтобы совпадало с id заявки на уровне филлиала
    @Id
    @Column(name = "application_id")
    private long applicationId;

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
