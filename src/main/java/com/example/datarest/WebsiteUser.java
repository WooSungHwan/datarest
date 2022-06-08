package com.example.datarest;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import static javax.persistence.GenerationType.AUTO;
import static lombok.AccessLevel.PROTECTED;

@EqualsAndHashCode(of = "id")
@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = PROTECTED)
@Entity
public class WebsiteUser {

    @Id
    @GeneratedValue(strategy = AUTO)
    private long id;
    private String name;
    private String email;

}
