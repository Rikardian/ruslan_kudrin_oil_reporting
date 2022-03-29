package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 6. Добыча нефтяного (попутного) газа, тысяч кубических метров
*/
@Entity
@NoArgsConstructor
@Data
public class OilGasProductionEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "oil_gas_production_id")
    private long oilGasProductionId;

    /*
    Добыча газа (фактически)
     */
    @Column(name = "gas_extraction")
    private double gasExtraction;

    /*
    Расход газа на собственные нужды разработки месторождения
     */
    @Column(name = "gas_consumption")
    private double gasConsumption;

    /*
    Технологические потери при добыче газа
     */
    @Column(name = "technological_loss")
    private double technologicalLoss;

    /*
    Сожжено в факелах
     */
    @Column(name = "burned_in_torches")
    private double burnedInTorches;
}
