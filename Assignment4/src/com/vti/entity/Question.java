package com.vti.entity;

import java.time.LocalDate;

public class Question {
	public int id;
	public String content;
	public TypeQuestion type;
	public Account category;
	public LocalDate createDate;
}
