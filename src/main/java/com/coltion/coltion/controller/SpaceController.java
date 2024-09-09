package com.coltion.coltion.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	public ResponseEntity<?> insertWorkspace(){
		
		WorkspaceDto workspaceDto = new WorkspaceDto();
		workspaceDto.setEmail("test1@naver.com");
		workspaceDto.setWorkspaceName("defalut");
		spaceService.insertWorkspace(workspaceDto);
		
		
		
		return ResponseEntity.ok().body("성공");
	}
	
	//개별 워크스페이스 조회(by workspaceNo)
	@GetMapping("/workspace/{workspaceNo}")
	public ResponseEntity<?> getWorkspace(@PathVariable("workspaceNo") String workspaceNo ){
		
		WorkspaceDto workspaceDto =spaceService.getWorkspace(workspaceNo);
		
		return ResponseEntity.ok().body(workspaceDto);
	}
}
