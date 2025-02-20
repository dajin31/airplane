package com.example.test.service;


import com.example.test.vo.MemVO;

public interface IMemberService {
//	중복검사
	public int memberIdCount(String memId);
//	insert
	public int insertMember(MemVO memVO);
}
