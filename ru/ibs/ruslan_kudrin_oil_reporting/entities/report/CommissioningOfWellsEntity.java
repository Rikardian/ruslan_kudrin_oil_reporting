package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 3.
Ввод в действие скважин, единиц
*/
@Entity
@NoArgsConstructor
@Data
public class CommissioningOfWellsEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "commissioning_of_wells_id")
    private long commissioningOfWellsId;

    /*
    Наименование
     */
    @Column(name = "name")
    private String name;

    /*
    Новые скважины Всего (гр. 2+3+4)
     */
    @Column(name = "total_new_wells")
    private int totalNewWells;

    /*
    Новые скважины в том числе из бурения и освоения после бурения
     */
    @Column(name = "from_drilling")
    private int fromDrilling ;

    /*
    Новые скважины в том числе из консервации
     */
    @Column(name = "from_conservation")
    private int fromConservation;

    /*
    Новые скважины в том числе из других фондов скважин
     */
    @Column(name = "from_other_fonds ")
    private int fromOtherFonds ;

    /*
    Введенные из бездействия(с прошлых лет)
     */
    @Column(name = "from_inactivity")
    private int fromInactivity;

}
