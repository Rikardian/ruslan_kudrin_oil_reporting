package ru.ibs.ruslan_kudrin_oil_reporting.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@Data
public class CalendarBalanceEntity {

    @Id
    private long calendarBalanceId;

    private String name;

    private int exploitingFund;

    private int operatingFundTotal;

    private int operatingFundExpl;

    private int operatingFundDowntime;

    private int withoutProductionTotal;

    private int withoutProductionLastYear;

    private int awaitingWellsTime;

}
