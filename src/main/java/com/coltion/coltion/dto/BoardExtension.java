package com.coltion.coltion.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardExtension {


    private int page;
    private int size;
    private int currentIdx;
    private int totalSize;
    private String sort;

}
