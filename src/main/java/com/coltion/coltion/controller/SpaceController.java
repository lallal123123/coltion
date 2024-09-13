package com.coltion.coltion.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coltion.coltion.dto.WorkspaceDto;
import com.coltion.coltion.service.SpaceService;

@RestController
@RequestMapping("/api")
public class SpaceController {
	private SpaceService spaceService;
	public SpaceController(SpaceService spaceService) {
		this.spaceService=spaceService;
	}

	//워크스페이스 등록
	@PostMapping("/workspace")
	public ResponseEntity<?> insertWorkspace(@RequestBody WorkspaceDto workspaceDto){
		spaceService.insertWorkspace(workspaceDto);
		return ResponseEntity.ok().body("워크스페이스 등록 성공");
	}
	
	//개별 워크스페이스 조회(by workspaceNo)
	@GetMapping("/workspace/{workspaceNo}")
	public ResponseEntity<?> getWorkspace(@PathVariable("workspaceNo") String workspaceNo ){
		WorkspaceDto workspaceDto =spaceService.getWorkspace(workspaceNo);
		return ResponseEntity.ok().body(workspaceDto);
	}
	
	//이메일별 워크스페이스 조회
	@GetMapping("/workspace/email/{email}")
	public ResponseEntity<?> getWorkspaceByEmail(@PathVariable("email") String email){
		List<WorkspaceDto> list = spaceService.getWorkspaceByEmail(email);
		return ResponseEntity.ok().body(list);
	}
	
	//워크스페이스 이름 수정
	@PutMapping("/workspace")
	public ResponseEntity<?> updateWorkspace(@RequestBody WorkspaceDto workspaceDto){
		spaceService.updateWorkspace(workspaceDto);
		return ResponseEntity.ok().body("워크스페이스 수정 성공");
	}
	
	//워크스페이스 삭제
	@DeleteMapping("/workspace/{workspaceNo}")
	public ResponseEntity<?> deleteWorkspace(@PathVariable("workspaceNo") String workspaceNo){
		spaceService.deleteWorkspace(workspaceNo);
		return ResponseEntity.ok().body("워크스페이스 삭제 성공");
	}
}
