package com.kjy.service;

import org.springframework.stereotype.Service;

import com.kjy.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Service
@Log4j
@RequiredArgsConstructor
@ToString
public class BoardServiceImpl implements BoardService{

	private final BoardMapper mapper;
}