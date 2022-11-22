package Spring.Security.Practice.Spring.Security.Practice.Domain;


import org.hibernate.annotations.ManyToAny;

import javax.persistence.FetchType;
import java.util.ArrayList;
import java.util.Collection;

//MAIN User Account
public class AppUser {


    private long id;
    private String name;
    private String userName;
    private String password;
    @ManyToAny(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();



}
