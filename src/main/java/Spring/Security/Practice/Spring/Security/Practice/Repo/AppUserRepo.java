package Spring.Security.Practice.Spring.Security.Practice.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepo extends JpaRepository<AppUserRepo, Long>
{
    AppUserRepo findByUsername(String username);
}
