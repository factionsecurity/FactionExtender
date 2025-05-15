package com.faction.elements;

import java.util.List;

import lombok.Data;

@Data
public class CheckList {
	private String name;
	private List<CheckListItem> checkListItems;

}
