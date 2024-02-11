package com.deep.springBoot3Learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyConfigurationController {
	
	
	@Autowired
	private CurrencyServiceConfiguration configuration;
	
	@RequestMapping("/cc")
	public CurrencyServiceConfiguration getConfiguration(){
		return configuration;
	}
}
