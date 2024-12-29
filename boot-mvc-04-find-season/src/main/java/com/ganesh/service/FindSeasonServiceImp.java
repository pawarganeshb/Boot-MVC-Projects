package com.ganesh.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

@Service("seasonFinder")
public class FindSeasonServiceImp implements IFindSeasonService {

	@Override
	public String seasonFinder() {
		LocalDate date = LocalDate.now();
		int value = date.getMonthValue();
		if (value >= 3 && value <= 6) {
			return "Summer Season";
		} else if (value >= 7 && value <= 9) {
			return "Mansoon Season";
		} else {
			return "Winter Season";
		}
	}

}
