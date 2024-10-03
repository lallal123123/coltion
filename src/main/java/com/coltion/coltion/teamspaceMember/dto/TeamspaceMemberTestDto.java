package com.coltion.coltion.teamspaceMember.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@Builder
public class TeamspaceMemberTestDto {

	@NotNull(message = "팀스페이스 멤버 번호는 필수입니다.")
	@Size(min = 1, message = "팀스페이스 멤버 번호는 1자 이상이어야 합니다.")
	@Size(max = 20, message = "팀스페이스 멤버 번호는 20자 이하여야 합니다.")
	private Long teamspaceMemberNo;
	private Long teamspaceNo;
	private String email;
	private String role;
}
