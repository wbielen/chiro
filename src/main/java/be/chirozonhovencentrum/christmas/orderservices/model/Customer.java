package be.chirozonhovencentrum.christmas.orderservices.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String emailAddress;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id",
                foreignKey = @ForeignKey(name = "fk_customer_address_id")
    )
    private List<Address> addresses = new ArrayList<>();
}
