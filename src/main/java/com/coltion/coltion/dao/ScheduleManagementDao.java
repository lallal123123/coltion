package com.coltion.coltion.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.coltion.coltion.dto.ScheduleManagementDto;

@Mapper
public interface ScheduleManagementDao {
	//스케줄 등록(할 일 등록)
	public void insertSchedule(@Param("dto") ScheduleManagementDto scheduleManagementDto);
	
	//해당 팀스페이스 할 일 목록 불러오기
	public List<ScheduleManagementDto> getScheduleByteamspaceNo(@Param("teamspaceNo") int teamspaceNo);

	public List<ScheduleManagementDto> getScheduleByemail(@Param("teamspaceNo") int teamspaceNo, @Param("email") String email);
	
}
