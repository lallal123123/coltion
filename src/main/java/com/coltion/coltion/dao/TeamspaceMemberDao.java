package com.coltion.coltion.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.coltion.coltion.dto.TeamspaceMemberDto;

@Mapper
public interface TeamspaceMemberDao {

	//등록
	public void insertMember(@Param("dto") TeamspaceMemberDto memberDto);
	
	//이메일로 조회
	public void selectEmailMember(@Param("email") String email);
	
}

