package com.example.test.dao;


import com.example.test.vo.MemVO;

public interface IMemberDAO {
//	중복검사
	public int memberIdCount(String memId);
//	insert
	public int insertMember(MemVO memVO);
}
