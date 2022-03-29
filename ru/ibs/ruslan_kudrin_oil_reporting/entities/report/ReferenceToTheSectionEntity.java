package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Справка к разделу 5
*/
@Entity
@Data
@NoArgsConstructor
public class ReferenceToTheSectionEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "reference_to_the_section_id")
    private long referenceToTheSectionId;

    /*
    Прибыло в эксплуатационный фонд нефтяных скважин
     */
    @Column(name = "arrived_in_fund")
    private int arrivedInFund;

    /*
    Выбыло из эксплуатационного фонда нефтяных скважин
     */
    @Column(name = "dropped_out_fund")
    private int droppedOutFund;
}
