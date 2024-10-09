package com.coltion.coltion.teamspaceMember.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class TeamspaceMemberTestDto {

	private Long teamspaceMemberNo;
	private Long teamspaceNo;
	private String email;
	private String role;
}
