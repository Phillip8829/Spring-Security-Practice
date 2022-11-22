package Spring.Security.Practice.Spring.Security.Practice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUser extends JpaRepository<AppUser, Long>
{
    AppUser findByUsername(String username);
}
