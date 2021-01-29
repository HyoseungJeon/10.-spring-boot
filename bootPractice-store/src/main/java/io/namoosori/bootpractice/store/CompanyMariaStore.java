package io.namoosori.bootpractice.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.namoosori.bootpractice.entity.Company;
import io.namoosori.bootpractice.store.mapper.CompanyMapper;

@Repository
public class CompanyMariaStore implements CompanyStore{
	
	private final CompanyMapper companyMapper;
	
	public CompanyMariaStore(CompanyMapper companyMapper) {
		this.companyMapper = companyMapper;
	}
	
	@Override
	public String create(Company company) {
		String name = company.getName();
		companyMapper.create(company);
		return name;
	}

	@Override
	public Company retrieve(String name) {
		
		return companyMapper.retrieve(name);
	}

	@Override
	public List<Company> retrieveNameIn(List<String> names) {
		// TODO Auto-generated method stub
		return companyMapper.retrieveNameIn(names);
	}

	@Override
	public void update(Company company) {
		// TODO Auto-generated method stub
		companyMapper.update(company);
	}

	@Override
	public void delete(String name) {
		// TODO Auto-generated method stub
		companyMapper.delete(name);
	}
}
