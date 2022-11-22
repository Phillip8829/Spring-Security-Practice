package Spring.Security.Practice.Spring.Security.Practice.Repo;

import Spring.Security.Practice.Spring.Security.Practice.Domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUser, Long>
{
    AppUserRepo findByUsername(String username);
}
