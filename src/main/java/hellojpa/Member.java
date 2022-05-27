package hellojpa;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

//@Entity
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "name")
    private String userName;

    @Enumerated(EnumType.STRING)
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    private LocalDateTime testDate;

    @Lob
    private String description;

    @Transient
    private int temp;

    public Member() {

    }


}
