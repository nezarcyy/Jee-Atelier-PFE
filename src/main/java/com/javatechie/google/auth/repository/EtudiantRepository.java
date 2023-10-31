
import com.javatechie.google.auth.models.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.CriteriaBuilder;

public interface EtudiantRepository extends JpaRepository<Etudiant, Integer> {
}
