package be.chirozonhovencentrum.christmas.orderservices.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@AllArgsConstructor(staticName = "of")
@Entity
@Table(name = "time_interval",
        uniqueConstraints = { @UniqueConstraint(columnNames = {"start_time", "end_time"})
})
public class TimeInterval {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @JsonFormat(pattern = "HH:mm")
    @Column(name = "start_time")
    private LocalTime startTime;

    @NotNull
    @JsonFormat(pattern = "HH:mm")
    @Column(name = "end_time")
    private LocalTime endTime;
}
