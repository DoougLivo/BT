package com.assignment.choi.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="HOBBY_TB")
@Getter
@Setter
public class HobbyDto {
	@Id
	@Column(name="h_code_id")
	private String h_code_id; // A
	
	@Column(name="h_nm", length=40)
	private String hNm;   // 등산
	
}
