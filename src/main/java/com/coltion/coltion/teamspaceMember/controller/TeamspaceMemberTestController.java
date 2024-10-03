package com.coltion.coltion.teamspaceMember.controller;

import com.coltion.coltion.teamspaceMember.dto.TeamspaceMemberTestDto;
import com.coltion.coltion.teamspaceMember.service.TeamspaceMemberService;
import com.coltion.coltion.common.ResultCode;
import com.coltion.coltion.enumClass.Common;
import jakarta.annotation.Resource;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TeamspaceMemberTestController {

	@Resource(name="memberService")
	private TeamspaceMemberService memberService;


	@PostMapping("/member")
	public ResultCode insertMember(@RequestBody @Valid TeamspaceMemberTestDto teamspaceMemberDto) {
		try {
			memberService.insert(teamspaceMemberDto);
			return new ResultCode(Common.SUCCESS);
		} catch (Exception e) {
			return new ResultCode(Common.FAIL);
		}
	}
	
	@GetMapping("/member")
	public ResponseEntity<String> selectEmailMember(@RequestParam String email) {
		memberService.emailSelect(email);
		
		return new ResponseEntity<>("성공적으로 조회하였습니다.", HttpStatus.OK);
	}
	
	
}
