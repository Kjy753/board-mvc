package com.kjy.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Criteria { //검색의 기준
	
	private int pageNum; // 페이지 번호
	private int amount; // 양
	
	public Criteria() {
		this(1,10);
	}

	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
	
}
