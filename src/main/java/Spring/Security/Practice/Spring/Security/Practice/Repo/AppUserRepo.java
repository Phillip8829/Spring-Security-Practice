package Spring.Security.Practice.Spring.Security.Practice.Repo;

import Spring.Security.Practice.Spring.Security.Practice.Model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Long>
{
    AppUser findByUsername(String username);
}
