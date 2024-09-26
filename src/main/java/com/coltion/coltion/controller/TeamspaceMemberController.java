package com.coltion.coltion.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.coltion.coltion.dto.TeamspaceMemberDto;
import com.coltion.coltion.service.TeamspaceMemberService;

@RestController
@RequestMapping("/api")
public class TeamspaceMemberController {
	
	private TeamspaceMemberService memberService;
	
	public TeamspaceMemberController(TeamspaceMemberService memberService) {
		this.memberService = memberService;
	}
	
	@PostMapping("/member")
	public ResponseEntity<String> insertMember(@RequestBody TeamspaceMemberDto teamspaceMemberDto) {
		memberService.insert(teamspaceMemberDto);
		
		return new ResponseEntity<>("회원이 성공적으로 등록되었습니다.", HttpStatus.CREATED);
		
	}
	
	@GetMapping("/member")
	public ResponseEntity<String> selectEmailMember(@RequestParam String email) {
		memberService.emailSelect(email);
		
		return new ResponseEntity<>("성공적으로 조회하였습니다.", HttpStatus.OK);
	}
	
	
}
