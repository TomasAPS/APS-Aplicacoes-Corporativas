@Entity
@Table(name = "users")
@Data // Lombok para gerar Getters e Setters automaticamente
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;  // Será criptografada
    
    @Enumerated(EnumType.STRING)
    private Role role;

    // Construtor, Getters e Setters
}
