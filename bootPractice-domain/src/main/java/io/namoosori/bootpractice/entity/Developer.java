package io.namoosori.bootpractice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

import io.namoosori.bootpractice.entity.vo.Skill;
import io.namoosori.bootpractice.util.JsonUtil;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Developer {
    private String name; // primary key     varchar(10);
    private int yearOfCareer; //            tinyint;
    private List<Skill> skills; //               TEXT;
    private String companyName; //          varchar(20); foreignKey
    
    public String skillsToJson(){
        return JsonUtil.toJson(skills);
    }
}


/*create table Developer(
    name varchar(10) primary key,
    yearOfCareer tinyint,
    skills Text,
    companyName varchar(20),
    foreign key(companyName) references Company(name)
);*/
