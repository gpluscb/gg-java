package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * A shop
 */
public class ShopResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final ShopOrderMessageConnectionResponse messages;
	private final ShopLevelConnectionResponse levels;
	private final StringResponse name;
	private final StringResponse slug;

	public ShopResponse() {
		super(EntityType.SHOP);

		id = null;
		messages = null;
		levels = null;
		name = null;
		slug = null;
	}

	public ShopResponse(IDResponse id, ShopOrderMessageConnectionResponse messages, ShopLevelConnectionResponse levels, StringResponse name, StringResponse slug) {
		super(EntityType.SHOP, true);
		this.id = id;
		this.messages = messages;
		this.levels = levels;
		this.name = name;
		this.slug = slug;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	public ShopOrderMessageConnectionResponse getMessages() {
		checkProvided();
		return messages;
	}

	public ShopLevelConnectionResponse getLevels() {
		checkProvided();
		return levels;
	}

	public StringResponse getName() {
		checkProvided();
		return name;
	}

	public StringResponse getSlug() {
		checkProvided();
		return slug;
	}
}
