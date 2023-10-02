package sj.accounting.server.model;

import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "user_roles")
public class UserRole implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private EnumRole authority;

    protected UserRole() {}

    public UserRole(EnumRole authority) {
        this.authority = authority;
    }

    public void setAuthority(EnumRole authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return this.authority.name();
    }
}
