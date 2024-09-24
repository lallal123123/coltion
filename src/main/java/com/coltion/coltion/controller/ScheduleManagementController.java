package com.coltion.coltion.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coltion.coltion.dto.ScheduleManagementDto;
import com.coltion.coltion.service.ScheduleManagementService;

@RestController
@RequestMapping("/api")
public class ScheduleManagementController {

	@Autowired
	private ScheduleManagementService scheduleService;
	
	//할 일 추가
	@PostMapping("/schedule")
	public ResponseEntity<String> insertSchedule(@RequestBody ScheduleManagementDto scheduleManagementDto){
		scheduleService.insertSchedule(scheduleManagementDto);
		return ResponseEntity.ok().body("할 일 등록 성공");
	}
	
	//팀 스페이스 내 할 일 목록 출력
	@GetMapping("/schedule/{teamspaceNo}")
	public ResponseEntity<?> getScheduleByteamspaceNo(@PathVariable("teamspaceNo") int teamspaceNo){
		List<ScheduleManagementDto> data = scheduleService.getScheduleByteamspaceNo(teamspaceNo);
		return ResponseEntity.ok(data);
	}
	
	//팀 스페이스 내 담당자(email) 할 일 목록 출력
	@GetMapping("/schedule/{teamspaceNo}/{email}")
	public ResponseEntity<?> getScheduleByemail(@PathVariable("teamspaceNo") int teamspaceNo, @PathVariable("email") String email){
		List<ScheduleManagementDto> data = scheduleService.getScheduleByemail(teamspaceNo, email);
		return ResponseEntity.ok(data);
	}
}
