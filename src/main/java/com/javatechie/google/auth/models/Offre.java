

import javax.persistence.*;
import java.util.List;

@Entity
public class Offre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String entreprise;
    private String techno;
    private String status;

    @OneToMany(mappedBy = "offre")
    private List<Etudiant> etudiants;
}
