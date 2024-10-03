package com.coltion.coltion.teamspaceMember.dao;

import com.coltion.coltion.dto.TeamspaceMemberDto;
import com.coltion.coltion.teamspaceMember.dto.TeamspaceMemberTestDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository("memberDao")
public interface TeamspaceMemberTestDao {

	//등록
	public void insertMember(@Param("dto") TeamspaceMemberTestDto memberDto);
	
	//이메일로 조회
	public void selectEmailMember(@Param("email") String email);
	
}

