package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IntResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.JSONResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

public class PageInfoResponse extends AbstractGGResponseObject {
	private final IntResponse total;
	private final IntResponse totalPages;
	private final IntResponse page;
	private final IntResponse perPage;
	private final StringResponse sortBy;
	private final JSONResponse filter;

	public PageInfoResponse() {
		super(EntityType.PAGE_INFO);

		total = null;
		totalPages = null;
		page = null;
		perPage = null;
		sortBy = null;
		filter = null;
	}

	public PageInfoResponse(IntResponse total, IntResponse totalPages, IntResponse page, IntResponse perPage, StringResponse sortBy, JSONResponse filter) {
		super(EntityType.PAGE_INFO, true);
		this.total = total;
		this.totalPages = totalPages;
		this.page = page;
		this.perPage = perPage;
		this.sortBy = sortBy;
		this.filter = filter;
	}

	public IntResponse getTotal() {
		checkProvided();
		return total;
	}

	public IntResponse getTotalPages() {
		checkProvided();
		return totalPages;
	}

	public IntResponse getPage() {
		checkProvided();
		return page;
	}

	public IntResponse getPerPage() {
		checkProvided();
		return perPage;
	}

	public StringResponse getSortBy() {
		checkProvided();
		return sortBy;
	}

	public JSONResponse getFilter() {
		checkProvided();
		return filter;
	}
}
