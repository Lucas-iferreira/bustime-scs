package io.github.lucasiferreira.transport_service.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "bus_lines")
@Getter
@Setter
@NoArgsConstructor
public class BusLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(nullable = false, unique = true, length = 20)
    String code;
    @Column(nullable = false, length = 20)
    String name;
}
