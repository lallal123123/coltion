package com.coltion.coltion.service;

import org.springframework.stereotype.Service;

import com.coltion.coltion.dao.TeamspaceMemberDao;
import com.coltion.coltion.dto.TeamspaceMemberDto;

@Service
public class TeamspaceMemberService {

	private TeamspaceMemberDao memberDao;
	
	public TeamspaceMemberService(TeamspaceMemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	//멤버 등록
	public void insert(TeamspaceMemberDto memberDto) {
		memberDao.insertMember(memberDto);
	}
	
	//멤버 이메일 -> 팀스페이스 (join) 조회
	public void emailSelect(String email) {
		memberDao.selectEmailMember(email);
	}
}
