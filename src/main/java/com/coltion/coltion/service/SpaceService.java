package com.coltion.coltion.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.coltion.coltion.dao.SpaceDao;
import com.coltion.coltion.dto.WorkspaceDto;

@Service
public class SpaceService {
	private SpaceDao spaceDao;
	
	public SpaceService(SpaceDao spaceDao) {
		this.spaceDao = spaceDao;
	}

	//워크스페이스 등록
	public void insertWorkspace(WorkspaceDto workspaceDto) {
		spaceDao.insertWorkspace(workspaceDto);
	}
	
	//개별 워크스페이스 조회(by workspaceNo)
	public WorkspaceDto getWorkspace(String workspaceNo) {
		WorkspaceDto workspaceDto =spaceDao.getWorkspace(workspaceNo);
		return workspaceDto;
	}
	
	//이메일별 워크스페이스 조회
	public List<WorkspaceDto> getWorkspaceByEmail(String email){
		List<WorkspaceDto> list = spaceDao.getWorkspaceByEmail(email);
		return list;
	}
}
