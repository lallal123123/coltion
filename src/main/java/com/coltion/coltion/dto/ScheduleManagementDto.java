package com.coltion.coltion.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ScheduleManagementDto {

	//일정표 primary key , auto_increment 번호
	int scheduleManagementNo;
	
	//foreign key teamspace_no
	int teamspaceNo;
	
	//진행 상태(ex. 시작 전, 진행중, 완료 ...)
	String state;
	
	//작업이름 (not null)
	String scheduleTitle;
	
	//담당자(email) 유저 Id
	String personInCharge;
	
	//시작예정일
	Date startAbout;
	
	//시작일
	Date startReal;
	
	//마감예쩡일
	Date endAbout;
	
	//마감일
	Date endReal;
	
	//우선순위
	int ranking;
	
	//작성날짜
	Date writtenDate;
	
	//최근 수정날짜
	Date updatedDate;
	
	//비고(설명, 코멘트 등)
	String description;
}
