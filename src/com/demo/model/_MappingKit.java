package com.demo.model;

import com.jfinal.plugin.activerecord.ActiveRecordPlugin;

public class _MappingKit {

	public static void mapping(ActiveRecordPlugin arp) {
		arp.addMapping("user", "id", User.class);
	}
}