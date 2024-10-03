package com.coltion.coltion.teamspaceMember.service;

import com.coltion.coltion.dao.TeamspaceMemberDao;
import com.coltion.coltion.dto.TeamspaceMemberDto;
import com.coltion.coltion.teamspaceMember.dao.TeamspaceMemberTestDao;
import com.coltion.coltion.teamspaceMember.dto.TeamspaceMemberTestDto;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service("memberService")
public class TeamspaceMemberService {

	@Resource(name="memberDao")
	private TeamspaceMemberTestDao memberDao;
	

	//멤버 등록
	public void insert(TeamspaceMemberTestDto memberDto) {
		memberDao.insertMember(memberDto);
	}
	
	//멤버 이메일 -> 팀스페이스 (join) 조회
	public void emailSelect(String email) {
		memberDao.selectEmailMember(email);
	}
}
