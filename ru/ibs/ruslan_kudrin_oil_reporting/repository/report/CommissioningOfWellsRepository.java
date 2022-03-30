package ru.ibs.ruslan_kudrin_oil_reporting.repository.report;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.ruslan_kudrin_oil_reporting.entities.report.CommissioningOfWellsEntity;

public interface CommissioningOfWellsRepository extends JpaRepository<CommissioningOfWellsEntity, Long> {
}
