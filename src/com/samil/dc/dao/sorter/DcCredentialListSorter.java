package com.samil.dc.dao.sorter;

import java.util.Comparator;

import com.samil.dc.domain.DcCredentialListBean;

public class DcCredentialListSorter implements Comparator<DcCredentialListBean> {

	public DcCredentialListSorter() {
		
	}
	
	/**
	 * <pre>
	 * ====================================================================================
	 * Credential 목록 소팅
	 * ====================================================================================
	 * </pre>
	 * 
	 */
	@Override
	public int compare(DcCredentialListBean item1, DcCredentialListBean item2) {
		// 종료일자 내림차순(DESC)
		return item2.getTermidt().compareTo(item1.getTermidt());
	}
}
