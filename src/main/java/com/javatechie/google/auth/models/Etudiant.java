

import javax.persistence.*;

@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String filiere;
    private Integer groupe;
    private String tele;
    private String mail;

    @ManyToOne
    @JoinColumn(name = "offre_id")
    private Offre offre;

    @OneToOne(mappedBy = "etudiant")
    private PFE pfe;
}
