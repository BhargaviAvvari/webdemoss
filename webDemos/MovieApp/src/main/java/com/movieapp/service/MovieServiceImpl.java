package com.movieapp.service;

import java.util.Arrays;
import java.util.List;

public class MovieServiceImpl implements IMovieService {

	@Override
	public List<String> getByLanguage(String language) {
		if(language.equals("Telugu"))
		{
		return Arrays.asList("billa","nani","pokiri");
		}
		else if(language.equals("Hindi")) {
			return Arrays.asList("sanam","dhoom","krish");
		}
		else if(language.equals("English")) {
			return  Arrays.asList("tangles","fire","spidereman");
		}
		else
			return Arrays.asList("vikram","maari","don");
		
	}

	

	

}
