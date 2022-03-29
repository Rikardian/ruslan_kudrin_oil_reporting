package ru.ibs.ruslan_kudrin_oil_reporting.entities.report;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/*
Раздел 2. Баланс календарного времени фонда нефтяных скважин, часов
 */
@Entity
@NoArgsConstructor
@Data
public class CalendarBalanceEntity {

    /*
    Primary key
     */
    @Id
    @Column(name = "calendar_balance_id")
    private long calendarBalanceId;

    /*
    Наименование
     */
    @Column(name = "name")
    private String name;

    /*
    Календарное время эксплуатационного фонда — всего (гр. 2 +5+7)
     */
    @Column(name = "exploiting_fund")
    private double exploitingFund;

    /*
    В том числе календарное время действующего фонда всего
     */
    @Column(name = "operating_fund_total")
    private double operatingFundTotal;

    /*
    В том числе календарное время действующего фонда в том числе время эксплуатации
     */
    @Column(name = "operating_fund_expl")
    private double operatingFundExpl;

    /*
    В том числе календарное время действующего фонда в том числе время простоев
     */
    @Column(name = "operating_fund_downtime")
    private double operatingFundDowntime;

    /*
    В том числе календарное время скважин, не дававших продукцию в последнем месяце отчетного периода
    всего
     */
    @Column(name = "without_production_total")
    private double withoutProductionTotal;

    /*
    В том числе календарное время скважин, не дававших продукцию в последнем месяце отчетного периода
    в том числе в бездействии с прошлых лет
     */
    @Column(name = "without_production_last_year")
    private double withoutProductionLastYear;

    /*
    В тои числе календарное время скважин, находящихся в ожидании освоения и освоении после бурения
     */
    @Column(name = "awaiting_wells_time")
    private double awaitingWellsTime;

}
