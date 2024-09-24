package com.coltion.coltion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.coltion.coltion.dto.TeamspaceDto;
import com.coltion.coltion.dto.WorkspaceDto;
@Mapper
public interface SpaceDao {

	////워크스페이스 
	//워크스페이스 등록
	public void insertWorkspace(@Param("dto") WorkspaceDto workspace);
	
	//개별 워크스페이스 조회(by workspaceNo)
	public WorkspaceDto getWorkspace(@Param("workspaceNo") String workspaceNo );
	
	//이메일별 워크스페이스 조회
	public List<WorkspaceDto> getWorkspaceByEmail(@Param("email") String email);
	
	//워크스페이스 이름 수정
	public void updateWorkspace(@Param("dto") WorkspaceDto workspace);
	
	//워크스페이스 삭제
	public void deleteWorkspace(@Param("workspaceNo") String workspaceNo);
	
	////팀스페이스
	//팀스페이스 등록
	public void insertTeamspace(@Param("dto") TeamspaceDto teamspaceDto);
	
	//워크스페이스별 팀스페이스 조회(by workspaceNo)
	public List<TeamspaceDto> getTeamspaceByWorkspaceNo(@Param("workspaceNo")String workspaceNo);
	
	//팀스페이스 이름 수정
	public void  updateTeamspace(@Param("dto") TeamspaceDto teamspaceDto);
	
	//팀스페이스 삭제
	public void deleteTeamspace(@Param("teamspaceNo") String teamspaceNo);
	
}
