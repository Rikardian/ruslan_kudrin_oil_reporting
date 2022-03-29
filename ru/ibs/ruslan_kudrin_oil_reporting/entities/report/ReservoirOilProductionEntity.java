package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 4.
Добыча нефти из пластов, разрабатываемых с применением методов
искусственного воздействия на пласт, тонн
*/
@Entity
@NoArgsConstructor
@Data
public class ReservoirOilProductionEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "reservoir_oil_production_id")
    private long reservoirOilProductionId;

    /*
    Методы воздействия
     */
    @Column(name = "methods_of_influence")
    private String methodsOfInfluence;

    /*
    Добыча нефти с применением методов искусственного воздействия на пласт
     */
    @Column(name = "extraction")
    private double extraction;

    /*
    В том числе увеличение (прирост) добычи за счет применения этих методов (фактически)
     */
    @Column(name = "increase")
    private double increase;
}
