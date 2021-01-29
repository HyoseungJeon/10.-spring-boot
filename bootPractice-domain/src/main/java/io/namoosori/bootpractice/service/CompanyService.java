package io.namoosori.bootpractice.service;

import java.util.List;

import io.namoosori.bootpractice.entity.Company;

public interface CompanyService {
	
	String register(Company company);
	
	Company find(String name);
	
	List<Company> findNameIn(List<String> names);
	void modify(Company company);
	void remove(String name);
}
