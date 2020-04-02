package com.vgtstptlk.magictask.repos;

import com.vgtstptlk.magictask.domain.Changes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public interface ChangesRepository extends JpaRepository<Changes, Long> {
    Optional<Changes>  findByTaskUserUsernameAndDateUpdateAndDescription(String username, Date dateUpdate, String description);
    Collection<Changes> findByTaskUserUsernameAndDateUpdateBetween(String username, Date dateFrom, Date dateTo);
    Collection<Changes> findByTaskUserUsernameAndTaskIdAndDateUpdate(String username, Long id, Date dateUpdate);

}
