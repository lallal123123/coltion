package com.coltion.coltion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coltion.coltion.dao.ScheduleManagementDao;
import com.coltion.coltion.dto.ScheduleManagementDto;
import com.coltion.coltion.dto.WorkspaceDto;

@Service
public class ScheduleManagementService {
	@Autowired
	private ScheduleManagementDao scheduleManagementDao;
	
	//공백 할 일 추가
	public void insertSchedule(ScheduleManagementDto scheduleManagementDto) {
		scheduleManagementDao.insertSchedule(scheduleManagementDto);
	}
	
	//팀스페이스 내 할 일 목록 출력
	public List<ScheduleManagementDto> getScheduleByteamspaceNo (int teamspaceNo) {
		List<ScheduleManagementDto> list = scheduleManagementDao.getScheduleByteamspaceNo(teamspaceNo);
		
		return list;
	}
	
	//팀스페이스 내 담당자(이메일 기준) 할 일 출력
	public List<ScheduleManagementDto> getScheduleByemail (int teamspaceNo, String email) {
		List<ScheduleManagementDto> list = scheduleManagementDao.getScheduleByemail(teamspaceNo, email);
		
		return list;
	}
}
