package com.github.gpluscb.ggjava.entity.object.response.objects;

import com.github.gpluscb.ggjava.entity.EntityType;
import com.github.gpluscb.ggjava.entity.object.response.AbstractGGResponseObject;
import com.github.gpluscb.ggjava.entity.object.response.scalars.FloatResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.IDResponse;
import com.github.gpluscb.ggjava.entity.object.response.scalars.StringResponse;

/**
 * The message and player info for a shop order
 */
public class ShopOrderMessageResponse extends AbstractGGResponseObject {
	private final IDResponse id;
	private final FloatResponse total;
	private final StringResponse message;
	private final StringResponse gamertag;
	private final StringResponse name;

	public ShopOrderMessageResponse() {
		super(EntityType.SHOP_ORDER_MESSAGE);

		id = null;
		total = null;
		message = null;
		gamertag = null;
		name = null;
	}

	public ShopOrderMessageResponse(IDResponse id, FloatResponse total, StringResponse message, StringResponse gamertag, StringResponse name) {
		super(EntityType.SHOP_ORDER_MESSAGE, true);
		this.id = id;
		this.total = total;
		this.message = message;
		this.gamertag = gamertag;
		this.name = name;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The total order amount
	 */
	public FloatResponse getTotal() {
		checkProvided();
		return total;
	}

	/**
	 * The order message
	 */
	public StringResponse getMessage() {
		checkProvided();
		return message;
	}

	/**
	 * The player's gamertag. Returns null if anonymous message type
	 */
	public StringResponse getGamertag() {
		checkProvided();
		return gamertag;
	}

	/**
	 * The player's name. Returns null unless name & tag display is selected
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}
}
