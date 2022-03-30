package ru.ibs.ruslan_kudrin_oil_reporting.repository.request;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ibs.ruslan_kudrin_oil_reporting.entities.request.BranchApplicationEntity;

public interface BranchApplicationRepository extends JpaRepository<BranchApplicationEntity, Long> {
}
