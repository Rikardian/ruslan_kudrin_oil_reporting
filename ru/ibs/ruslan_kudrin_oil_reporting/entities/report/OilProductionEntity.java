package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 1.
Добыча нефти, тонн
 */
@Entity
@Data
@NoArgsConstructor
public class OilProductionEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "oil_production_id")
    private Long oilProductionId;

    /*
    Способы добычи и категории скважин
     */
    @Column(name = "operating_methods")
    private String operatingMethods;

    /*
    Добыча с начала года
     */
    @Column(name = "year_production")
    private double yearProduction;

    /*
    Число числившихся скважино-месяцев с начала года
     */
    @Column(name = "counted_month")
    private int countedMonth;

    /*
    Число отработанных скважино-месяцев с начала года
     */
    @Column(name = "spent_month")
    private int spentMonth;

    /*
    Средний дебит на отработанный скважино-месяц, т (фактически)
     */
    @Column(name = "average_flow_rate")
    private double averageFlowRate;

    /*
    Число скважин, дающих продукцию на конец отчетного периода
     */
    @Column(name = "number_of_wells")
    private int numberOfWells;

    /*
    Извлечено из скважин жидкости с начала года, т
     */
    @Column(name = "extracted_from_wells")
    private int extractedFromWells;

}
