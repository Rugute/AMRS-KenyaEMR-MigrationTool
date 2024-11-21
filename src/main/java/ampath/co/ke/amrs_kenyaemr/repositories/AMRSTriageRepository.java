package ampath.co.ke.amrs_kenyaemr.repositories;

import ampath.co.ke.amrs_kenyaemr.models.AMRSTriage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AMRSTriageRepository extends JpaRepository<AMRSTriage, Long> {
  AMRSTriage findById(int pid);
  List<AMRSTriage> findByUuid(String cuuid);
  List<AMRSTriage> findByPatientIdAndEncounterIdAndConceptId(String pid,String encid,String cid);
  List<AMRSTriage> findFirstByOrderByIdDesc();
}
