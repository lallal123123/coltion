package com.coltion.coltion.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.coltion.coltion.dto.WorkspaceDto;
@Mapper
public interface SpaceDao {

	public void insertWorkspace(@Param("dto") WorkspaceDto workspace);
	public WorkspaceDto getWorkspace(@Param("workspaceNo") String workspaceNo );
}
