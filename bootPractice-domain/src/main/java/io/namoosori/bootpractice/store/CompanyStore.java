package io.namoosori.bootpractice.store;

import java.util.List;

import io.namoosori.bootpractice.entity.Company;

public interface CompanyStore {
	
	String create(Company company);
	Company retrieve(String name);
	List<Company> retrieveNameIn(List<String> names);
	void update(Company company);
	void delete(String name);

}
