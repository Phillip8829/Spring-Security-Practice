package Spring.Security.Practice.Spring.Security.Practice.Repo;

import Spring.Security.Practice.Spring.Security.Practice.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {

    Role findByName(String name);


}
