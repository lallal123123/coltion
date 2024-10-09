package com.coltion.coltion.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TeamspaceMemberDto  extends  BoardExtension{

	private Long teamspaceMemberNo;
	private Long teamspaceNo;
	private String email;
	private String role;
}
