package io.namoosori.bootpractice.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.namoosori.bootpractice.entity.Company;

@Mapper
public interface CompanyMapper {
	
	int create(Company company);
	Company retrieve(String name);
	List<Company> retrieveNameIn(List<String> names);
	int update(Company company);
	int delete(String name);
}
