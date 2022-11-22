package Spring.Security.Practice.Spring.Security.Practice.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;

public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    Long id;


    String name;


}
