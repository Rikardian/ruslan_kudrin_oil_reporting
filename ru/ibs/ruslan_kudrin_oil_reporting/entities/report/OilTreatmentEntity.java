package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 8.
Подготовка нефти (включая газовый конденсат), тонн
*/
@Entity
@NoArgsConstructor
@Data
public class OilTreatmentEntity {

    /*
    Primary Key
     */
    @Column(name = "oil_treatment_id")
    @Id
    private long oilTreatmentId;

    /*
    Поступало жидкости на установки по подготовке нефти
     */
    @Column(name = "received_liquid")
    private double receivedLiquid;

    /*
    Получено нефти с установок
     */
    @Column(name = "received_oil")
    private double receivedOil;

    /*
    Подготовлено нефти другими способами (трубная деэмульсация, простой, отстой и другое)
     */
    @Column(name = "prepared_oil")
    private double preparedOil;

    /*
    Потери нефти при подготовке
     */
    @Column(name = "oil_losses")
    private double oilLosses;

}
