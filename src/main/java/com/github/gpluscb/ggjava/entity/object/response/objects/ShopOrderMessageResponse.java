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
	private final StringResponse gamertag;
	private final StringResponse message;
	private final StringResponse name;
	private final FloatResponse total;

	public ShopOrderMessageResponse() {
		super(EntityType.SHOP_ORDER_MESSAGE);

		id = null;
		gamertag = null;
		message = null;
		name = null;
		total = null;
	}

	public ShopOrderMessageResponse(IDResponse id, StringResponse gamertag, StringResponse message, StringResponse name, FloatResponse total) {
		super(EntityType.SHOP_ORDER_MESSAGE, true);
		this.id = id;
		this.gamertag = gamertag;
		this.message = message;
		this.name = name;
		this.total = total;
	}

	public IDResponse getId() {
		checkProvided();
		return id;
	}

	/**
	 * The player's gamertag. Returns null if anonymous message type
	 */
	public StringResponse getGamertag() {
		checkProvided();
		return gamertag;
	}

	/**
	 * The order message
	 */
	public StringResponse getMessage() {
		checkProvided();
		return message;
	}

	/**
	 * The player's name. Returns null unless name & tag display is selected
	 */
	public StringResponse getName() {
		checkProvided();
		return name;
	}

	/**
	 * The total order amount
	 */
	public FloatResponse getTotal() {
		checkProvided();
		return total;
	}
}
