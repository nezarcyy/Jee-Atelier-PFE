
import javax.persistence.*;
import java.util.List;

@Entity
public class Encadrant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String specialite;
    private String type;
    private String tele;

    @OneToMany(mappedBy = "encadrant")
    private List<PFE> pfeList;
}