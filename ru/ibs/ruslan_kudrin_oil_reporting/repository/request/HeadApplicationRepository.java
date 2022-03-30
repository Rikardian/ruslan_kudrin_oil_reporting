package ru.ibs.ruslan_kudrin_oil_reporting.repository.request;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.ruslan_kudrin_oil_reporting.entities.request.HeadApplicationEntity;

public interface HeadApplicationRepository extends JpaRepository<HeadApplicationEntity, Long> {
}
