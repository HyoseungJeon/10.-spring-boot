package io.namoosori.bootpractice.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import io.namoosori.bootpractice.entity.Company;
import io.namoosori.bootpractice.service.CompanyService;
import io.namoosori.bootpractice.store.CompanyStore;


@Service
public class CompanyServiceLogic implements CompanyService{
	
	private final CompanyStore companyStore;
	
	public CompanyServiceLogic(CompanyStore companyStore) {
		this.companyStore = companyStore;
	}
	
	@Override
	public String register(Company company) {
		companyStore.create(company);
		
		return company.getName();
	}

	@Override
	public Company find(String name) {
		// TODO Auto-generated method stub
		
		return companyStore.retrieve(name);
	}

	@Override
	public List<Company> findNameIn(List<String> names) {
		// TODO Auto-generated method stub
		return companyStore.retrieveNameIn(names);
	}

	@Override
	public void modify(Company company) {
		// TODO Auto-generated method stub
		companyStore.update(company);
	}

	@Override
	public void remove(String name) {
		// TODO Auto-generated method stub
		companyStore.delete(name);
	}

}
