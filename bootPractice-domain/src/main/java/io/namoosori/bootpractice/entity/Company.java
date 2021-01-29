package io.namoosori.bootpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import io.namoosori.bootpractice.entity.vo.Payment;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private String name; //                 varchar(20) priamary key;

    private Payment payment;

    private List<Developer> developers;     //TEXT
}

/*create table company(
    name varchar(20) primary key,
    developers TEXT
);*/

