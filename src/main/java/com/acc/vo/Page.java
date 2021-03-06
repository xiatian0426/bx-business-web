package com.acc.vo;

import java.util.List;

public class Page<T> {

	private List<T> result;// 每页显示的条数
	
	private int pageSize;
	// 总共的条数
	private int recordCount;
	// 当前页面
	private int currentPage;
	
	@SuppressWarnings("unused")
	private String pageInfo;

	public Page(int pageSize, int recordCount, int currentPage) {
		this.pageSize = pageSize;
		this.recordCount = recordCount;
		setCurrentPage(currentPage);
	}

	// 构造方法
	public Page(int pageSize, int recordCount) {
		this(pageSize, recordCount, 1);
	}

	// 总页数
	public int getPageCount() {
		// 总条数/每页显示的条数=总页数
		int size = recordCount / pageSize;
		// 最后一页的条数
		int mod = recordCount % pageSize;
		if (mod != 0)
			size++;
		return recordCount == 0 ? 1 : size;
	}

	// 包含，起始索引为0
	public int getFromIndex() {
		// System.out.print ln("fromindex:"+(currentPage-1)*pageSize);
		return (currentPage - 1) * pageSize;
	}

	// 不包含
	public int getToIndex() {
		// System.out.print ln("toindex:"+Math.min(recordCount,currentPage*
		// pageSize));
		return Math.min(recordCount, currentPage * pageSize);
	}

	// 得到当前页
	public int getCurrentPage() {
		return currentPage;
	}

	// 设置当前页
	public void setCurrentPage(int currentPage) {
		int validPage = currentPage <= 0 ? 1 : currentPage;
		validPage = validPage > getPageCount() ? getPageCount() : validPage;
		this.currentPage = validPage;
	}

	// 得到每页显示的条数
	public int getPageSize() {
		return pageSize;
	}

	// 设置每页显示的条数
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	// 得到总共的条数
	public int getRecordCount() {
		return recordCount;
	}

	// 设置总共的条数
	public void setRecordCount(int recordCount) {
		this.recordCount = recordCount;
	}

	public List<T> getResult() {
		return result;
	}

	public void setResult(List<T> result) {
		this.result = result;
	}

	public String getPageInfo() {
		return "{'recordCount':"+recordCount+",'currentPage':"+currentPage+",'pageCount':"+getPageCount()+"}";
	}

	public void setPageInfo(String pageInfo) {
		this.pageInfo = pageInfo;
	}
}
