package io.namoosori.bootpractice.rest;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.namoosori.bootpractice.entity.Company;
import io.namoosori.bootpractice.service.CompanyService;

@RestController
@RequestMapping("/company")
public class CompanyResource {
	private final CompanyService companyservice;

	public CompanyResource(CompanyService companyService) {
		this.companyservice = companyService;
	}
	
	@PostMapping("/register")
	public String register(@RequestBody Company company) {
		return companyservice.register(company);
	}
	
	@GetMapping("/find")
	public Company find(@RequestParam String name) {
		return companyservice.find(name);
	}
	
	@GetMapping("/find-by-name")
	public List<Company> findByName(@RequestParam List<String> names){
		return companyservice.findNameIn(names);
	}
	
	@DeleteMapping("/remove")
	public void remove(@RequestParam String name) {
		companyservice.remove(name);
	}
	
	@GetMapping("/echo")
	public String echo() {
		return "alive";
		
	}
}
