package com.coltion.coltion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.coltion.coltion.dto.WorkspaceDto;
@Mapper
public interface SpaceDao {

	//워크스페이스 등록
	public void insertWorkspace(@Param("dto") WorkspaceDto workspace);
	
	//개별 워크스페이스 조회(by workspaceNo)
	public WorkspaceDto getWorkspace(@Param("workspaceNo") String workspaceNo );
	
	//이메일별 워크스페이스 조회
	public List<WorkspaceDto> getWorkspaceByEmail(@Param("email") String email);
}
