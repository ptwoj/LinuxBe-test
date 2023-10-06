package com.example.linuxbe.domain;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "Demos")
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Demo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String username;
    public String text;
}
