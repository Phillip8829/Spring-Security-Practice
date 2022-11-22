package Spring.Security.Practice.Spring.Security.Practice.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

import static javax.persistence.GenerationType.AUTO;


@Entity @Data
@NoArgsConstructor
public class AppUser {

@Id @GeneratedValue(strategy = AUTO)
    Long id;
    String name;
    String username;
    String password;
    @ManyToMany(fetch = FetchType.EAGER)
    Collection<Role> roles = new ArrayList<>();

}
