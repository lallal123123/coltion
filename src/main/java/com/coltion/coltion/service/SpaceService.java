package com.coltion.coltion.service;

import org.springframework.stereotype.Service;

import com.coltion.coltion.dao.SpaceDao;
import com.coltion.coltion.dto.WorkspaceDto;

@Service
public class SpaceService {
	private SpaceDao spaceDao;
	
	public SpaceService(SpaceDao spaceDao) {
		this.spaceDao = spaceDao;
	}

	public void insertWorkspace(WorkspaceDto workspaceDto) {
		spaceDao.insertWorkspace(workspaceDto);
	}
	
	public WorkspaceDto getWorkspace(String workspaceNo) {
		WorkspaceDto workspaceDto =spaceDao.getWorkspace(workspaceNo);
		return workspaceDto;
	}
}
